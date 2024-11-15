/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    // Convert x to a string to handle numbers
   x = x.toString();

   // Reverse the string and compare
   let xRev = x.split('').reverse().join('');

   return x === xRev;
};