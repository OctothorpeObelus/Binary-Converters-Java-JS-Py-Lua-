var binary = prompt("Type some binary.");
var text;
var process = [];
var counter = 0;

for ( var i = 0; i < binary.length; i++ ) {
    if ( binary.charAt(i) != " " ) {
        if ( process[counter] != null ) {
            process[counter] += binary.charAt(i + "");
        } else {
            process[counter] = binary.charAt(i + "");
        }
    } else {
        counter += 1;
    }
}

counter = 0;

for ( var i = 0; i < process.length; i++ ) {
    if ( process[i].charAt(0) == 1 ) {
        counter += 128;
    }
    if ( process[i].charAt(1) == 1 ) {
        counter += 64;
    }
    if ( process[i].charAt(2) == 1 ) {
        counter += 32;
    }
    if ( process[i].charAt(3) == 1 ) {
        counter += 16;
    }
    if ( process[i].charAt(4) == 1 ) {
        counter += 8;
    }
    if ( process[i].charAt(5) == 1 ) {
        counter += 4;
    }
    if ( process[i].charAt(6) == 1 ) {
        counter += 2;
    }
    if ( process[i].charAt(7) == 1 ) {
        counter += 1;
        process[i] = counter;
        counter = 0;
    } else {
        process[i] = counter;
        counter = 0;
    }
}
alert(process)
for ( var i = 0; i < process.length; i++ ) {
    if ( text != null ) {
        text += String.fromCharCode(process[i])
    } else {
        text = String.fromCharCode(process[i])
    }
}
alert(text)
document.write(text)
