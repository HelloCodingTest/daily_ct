### 문제 
두 정수 사이의 합
문제 설명
길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.

제한 조건
n은 길이 10,000이하인 자연수입니다.

입출력 예
<table>
<tr>
<td>n</td><td>return</td>
</tr>
<tr>
<td>3</td><td>수박수</td>
</tr>
<tr>
<td>4</td><td>수박수박</td>
</tr>
</table>
	

## 1)이해
 - 홀수일때 '수', 짝수일때 '수박'의 반복
 - n이 짝수이면 n/2의 몫만큼 수박 반복 
 - n이 홀수이면 n/2의 몫만큼 수박 반복 후 수 더하기
 
## 2)계획 
 - 홀수일때와 짝수일때를 분리
 - 홀수일 경우 n/2의 몫만큼 수박 반복 후 수 붙여주기
 - 짝수일 경우 n/2의 몫만큼 수박 반복

## 3)실행 
~~~
  function solution(a) {
      //
      const odd = '수';
      const even = '수박';
      let answer = '';
  
      if ((a % 2) === 0) {
        answer = loop((a/2), even);
      }
  
      if ((a % 2) === 1) {
        answer = loop(parseInt(a/2), even) + odd;
      }
  
      return answer;
    }
  
    function loop(a, text) {
      //
      let answer = '';
      for (let i = 0; i < a; i++) {
        answer = answer += text;
      }
      return answer;
    }
~~~