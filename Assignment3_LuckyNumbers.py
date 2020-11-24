from itertools import islice

class LN:
     
    str = '0123456789'

        @staticmethod
    def getLN(number, i, n):
        LN = 0
        if i == 0:
            for c in islice(LN.str,1,None):
                number[i] = c
                LN += LN.count(number, i + 1, n)
        elif i == n - 1:
            for c in LN.str:
                number[i] = c
                if int(''.join(number)) % n == 0:
                    LN += 1
        else:
            for c in LN.str:
                number[i] = c
                if int(''.join(islice(number, 0, i+1))) % (i+1) == 0:
                    LN += LN.count(number, i + 1, n)
        return LN

def main():
    n = int(input())
    a = ['0'] * n
    print(LN.getLN(a, 0, n))

