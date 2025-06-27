def solution(array):
    freq_dic = {}
    for i in array:
        if i in freq_dic:
            freq_dic[i] += 1
        else:
            freq_dic[i] = 1
            
    max_freq = max(freq_dic.values())
    freq_num = [key for key, val in freq_dic.items() if val == max_freq]
    
    if len(freq_num) > 1:
        return -1
    else: return freq_num[0]