/**
 * @param {number[]} candies
 * @param {number} extraCandies
 * @return {boolean[]}
 */
var kidsWithCandies = function(candies, extraCandies) {
    const largest = Math.max(0, ...candies);
    let result=[];

    for(let i=0; i<candies.length; i++){
            result.push((candies[i]+extraCandies)>=largest)
    }
    return result;
    
};