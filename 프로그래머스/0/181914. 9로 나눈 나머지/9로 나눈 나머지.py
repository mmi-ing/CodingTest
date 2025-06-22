def solution(number):
    total = sum(int(digit) for digit in number)
    return total % 9