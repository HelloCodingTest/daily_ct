import UIKit

func solution(_ a:Int, _ b:Int) -> Int64 {
    
    if a < b {
        
        return Int64((a...b).reduce(0, +))

    } else if a > b {
        
        return Int64((b...a).reduce(0, +))
        
    } else if a == b{
        
        return Int64(a)
    }
    
    return 0
    
}

solution(3, 5)
