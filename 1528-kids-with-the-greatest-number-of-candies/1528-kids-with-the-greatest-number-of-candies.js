/**
 * @param {number[]} candies
 * @param {number} extraCandies
 * @return {boolean[]}
 */
var kidsWithCandies = function(candies, extraCandies) {
    const largest = Math.max(0, ...candies);
    return candies.map(candy => (candy+extraCandies)>=largest);
    
};