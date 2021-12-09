var button1 = $('<button></button>').click(function () {
    window.location="/"
})

var answer = document.getElementById("beatings").value

console.log(answer)

var button2 = $('<button></button>')
var button3 = $('<button></button>')

var answerDiv = $('#div_answer')

var text1 = "Sandrita's beatings > Buddy's beatings"
var text2 = "Sandrita's beatings == Buddy's beatings"
var text3 = "Sandrita's beatings < Buddy's beatings"

answerDiv.append(button1)
answerDiv.append(button2)
answerDiv.append(button3)

button1.append(text1)
button2.append(text2)
button3.append(text3)