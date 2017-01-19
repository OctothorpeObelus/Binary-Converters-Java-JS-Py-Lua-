-- c 2017 Michael Smith

local decimal = io.read()
local binary = "";
local bytes = { 128, 64, 32, 16, 8, 4, 2, 1 }
while decimal > 0 do
    for i = 0, i < bytes.length, i + 1 do
        if decimal < 256 then
            if decimal >= bytes[i] then
                decimal = decimal - bytes[i]
                binary = binary .. "" .. 1 .. ""
            else
                binary = binary .. "" .. 0 .. ""
            end
        else
            decimal = decimal - 255
            binary = binary .. "" .. 11111111 .. " "
        end
    end
    io.write(binary)
end
