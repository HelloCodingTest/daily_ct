### 문제

두 정수 사이의 합

문제 설명

두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요. 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

제한 조건

- a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
- a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
- a와 b의 대소관계는 정해져있지 않습니다.

입출력 예

| a    | b    | return |
| ---- | ---- | ------ |
| 3    | 5    | 12     |
| 3    | 3    | 3      |
| 5    | 3    | 12     |

## 

## 1) 이해

- a ~ b 까지의 합을 구하여 리턴
- a, b 대소관계는 정해져있지 않다
- a와 b가 같으면 둘 중 아무 수 리턴

## 

## 2) 계획

- 첫 날의 if문을 더 간결하게 표현하여 적용하기

## 

## 3)실행

```swift
func solution(_ a:Int, _ b:Int) -> Int64 {
    
    let minV = a < b ? a : b
    let maxV = a > b ? a : b
    
    var value: Int = 0
    
    for i in minV...maxV {
        value += i
    }
    
    return Int64(value)
}

```

## 

## 4)회고

더 간결하게 할 방법을 고민해 봐야겠다.

