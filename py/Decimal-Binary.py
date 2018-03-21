# c 2017 Michael Smith
# Automatically detects and compensates for py3 or py2

from sys import version_info

py3 = version_info[0] > 2 
if py3:
    decimal = int(input("Enter a positive number: "))
else:
    decimal = int(raw_input("Enter a positive number: "))

binary = "";
bits = [ 128, 64, 32, 16, 8, 4, 2, 1 ]
while ( decimal > 0 ):
    for i in range(0, len(bits)):
        if (decimal < 256):
            if (decimal >= bits[i]):
                decimal = decimal - bits[i]
                binary = binary + "1"
            else:
                binary = binary + "0"
        else:
            decimal = decimal - 255
            binary = binary + "11111111 "
    print(binary)
