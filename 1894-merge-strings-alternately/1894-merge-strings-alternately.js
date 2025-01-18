/**
 * @param {string} word1
 * @param {string} word2
 * @return {string}
 */
var mergeAlternately = function(word1, word2) {
    let mergeArr ='';
    let arrLength = Math.max(word1.length, word2.length);

    for(let i=0; i<arrLength; i++){
        if(word1.length>i){
            mergeArr+=word1[i];
        }
          if(word2.length>i){
            mergeArr+=word2[i];
        }
    }
    return mergeArr;
};