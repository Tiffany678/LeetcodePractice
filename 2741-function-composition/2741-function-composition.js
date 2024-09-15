/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    return function(x){
        for(const fn of functions.reverse()){
                // accumulate the result to variable x
                x=fn(x)
            }
            return x;
    }
    
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */