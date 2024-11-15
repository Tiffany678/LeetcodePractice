/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    x = x.toString();
    let left=0;
    let right= x.length-1;

    while(right>left){
        if(x[left]!==x[right]){
            return false;
        }
        right--;
        left++;
    }
    return true;
};