/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    // Convert the input to a string to ensure compatibility
    x = x.toString();

    let left = 0;
    let right = x.length - 1;

    // Compare characters from both ends
    while (right > left) {
        if (x[left] !== x[right]) {
            return false; // Return false if any mismatch is found
        }
        left++;
        right--;
    }
    return true; // Return true if no mismatches are found
};