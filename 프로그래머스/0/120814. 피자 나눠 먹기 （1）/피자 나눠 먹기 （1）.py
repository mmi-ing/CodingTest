def solution(n):
    pizza = 1
    while pizza * 7 < n:
        pizza += 1
    return pizza