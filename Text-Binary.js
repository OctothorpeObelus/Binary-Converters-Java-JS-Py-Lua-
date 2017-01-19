var letters = prompt("Enter some text.")
var binary = "";
var process = [];
var bits = [ 128, 64, 32, 16, 8, 4, 2, 1 ]

for ( var i = 0; i < letters.length; i++ ) {
    process[i] = letters[i].charCodeAt(0)

while ( process[i] > 0 ) {
    if ( process[i] < 256 ) {
        for ( var j = 0; j < bits.length; j++ ) {
            if ( process[i] >= bits[j] ) {
                binary += "" + 1 + ""
                process[i] -= bits[j]
            } else {
                binary += "" + 0 + ""
            }
            if ( j == 7 ) {
                binary += " "
            }
        }
    } else {
        binary += " " + 11111111 + " "
        process[i] -= bits[j]
    }
}
}
alert(binary)