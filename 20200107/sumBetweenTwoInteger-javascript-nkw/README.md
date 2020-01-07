### 문제 
두 정수 사이의 합

문제 설명

두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

제한 조건

- a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
- a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
- a와 b의 대소관계는 정해져있지 않습니다.

입출력 예
<table>
<tr>
<td>a</td>
<td>b</td>
<td>return</td>
</tr>
<tr>
<td>3</td>
<td>5</td>
<td>12</td>
</tr>
<tr>
<td>3</td>
<td>3</td>
<td>3</td>
</tr>
<tr>
<td>5</td>
<td>3</td>
<td>12</td>
</tr>
</table>

## 1)이해
 - a ~ b 까지의 합을 구하여 리턴
 - a, b 대소관계는 정해져있지 않다 
 - a와 b가 같으면 둘 중 아무 수 리턴
 
## 2)계획 
 - a ~ b 까지의 합을 구하기 위해 for문 선택
 - a와 b의 대소관계가 정해져 있지않아 <br>
 변수 startNumber에 a가 클경우 a 아닐경우 b로 대입 <br>
 변수 endNumber에 a가 클경우 a 아닐경우 b로 대입
 - reduce 함수 사용
## 3)실행 

~~~
  function solution(a, b) {
    //
    const start = Math.min(a,b);
    const end = Math.max(a,b);
    const result = [];

    for (let i = start; i <= end; i++) {
      result.push(i);
    }

    return result.reduce((pre, val) => pre + val);
  }
~~~