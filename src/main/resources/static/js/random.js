
function generateRandomNumber() {
    return Math.floor(Math.random() * 100) + 1;
}
function assignRandomNumberToField() {
    var numeroInput = document.getElementById("numero");
    var randomNumber = generateRandomNumber();
    numeroInput.value = randomNumber;
}


