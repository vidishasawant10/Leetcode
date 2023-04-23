def intToRoman(self, num: int) -> str:
        num_map ={
            1: "I",
            5: "V",    4: "IV",
            10: "X",   9: "IX",
            50: "L",   40: "XL",
            100: "C",  90: "XC",
            500: "D",  400: "CD",
            1000: "M", 900: "CM",
        }

        r = ""
        for n in [1000,900,500,400,100,90,50,40,10,9,5,4,1]:
            while n <= num:
                r += num_map[n]
                num -= n
        return r
        
'''For example, the symbols "IV" and "IX" are used to represent the numbers 4 and 9, respectively, instead of using the letters "IIII" and "VIIII" 
which would be the literal representation of the numbers in Roman numerals. Similarly, the symbols "XL", "XC", "CD", and "CM" are used to represent 
the numbers 40, 90, 400, and 900, respectively, instead of writing "XXXX" or "LXXXX", and so on.'''