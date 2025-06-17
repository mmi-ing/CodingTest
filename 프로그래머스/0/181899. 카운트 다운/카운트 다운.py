def solution(start_num, end_num):
    answer = []
    for i in range(0,(start_num-end_num+1)):
        answer.append(start_num - i)
    
    return answer