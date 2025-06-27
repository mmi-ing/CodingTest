def solution(array):
    array.sort() # 차례대로 정렬
    num = int(len(array) / 2)
    return array[num]