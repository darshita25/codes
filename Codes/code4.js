function reverseWords(sentence) {
    var words = sentence.split(' ');

    var reversedWords = words.map(function(word) {
        return word.split('').reverse().join('');
    });

    var reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

var inputSentence = "This is a sunny day";
var reversedResult = reverseWords(inputSentence);

console.log(reversedResult);
