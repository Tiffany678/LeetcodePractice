/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function (obj) {
    // check if the input is array
    if (Array.isArray(obj)) {
        return obj.length === 0;
    }
    // check if the input is object
    if (typeof obj === 'object' && obj !== null) {
        return Object.keys(obj).length === 0;
    }
    return false;
};