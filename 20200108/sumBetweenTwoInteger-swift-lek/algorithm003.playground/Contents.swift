import UIKit

func solution(_ a:Int, _ b:Int) -> Int64 {
    
    let minV = a < b ? a : b
    let maxV = a > b ? a : b
    
    var value: Int = 0
    
    for i in minV...maxV {
        value += i
    }
    
    return Int64(value)
}

solution(3, 5)
