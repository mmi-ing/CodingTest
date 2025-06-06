def solution(num_list):
    answer = 0
    num1 = 1
    num2 = 0
    num3 = 0
    for i in num_list:
        num1 = num1 * i
        num2 = num2 + i
        num3 = num2**2
    if num1 < num3:
        answer = 1
    else: answer = 0
    return answer