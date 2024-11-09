/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    const cache = new Map(); // Create a Map to store the results
    
    return function(...args) {
        const key = JSON.stringify(args); // Use JSON.stringify to generate a unique key based on arguments
        if (cache.has(key)) {
            return cache.get(key); // If the result is cached, return it
        }
        const result = fn(...args); // Otherwise, call the function
        cache.set(key, result); // Store the result in the cache
        return result; // Return the result   
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */