import UIKit

func solution(_ a:Int, _ b:Int) -> Int64 {
    
    var result: Int = 0
    
    for i in min(a, b)...max(a, b) {
        
        result += i
    }
    
    return Int64(result)
}

solution(3, 5)
