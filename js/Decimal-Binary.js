// c 2017 Michael Smith

var decimal = prompt("Enter a positive number.")
var binary = "";
var bytes = [ 128, 64, 32, 16, 8, 4, 2, 1 ]
while ( decimal > 0 ) {
    for (var i = 0; i < bytes.length; i++) {
        if (decimal < 256) {
            if (decimal >= bytes[i]) {
                decimal -= bytes[i]
                binary += "" + 1 + ""
            } else {
                binary +="" + 0 + ""
            }
        } else {
            decimal -= 255
            binary += "" + 11111111 + " "
        }
    }
    alert(binary)
}