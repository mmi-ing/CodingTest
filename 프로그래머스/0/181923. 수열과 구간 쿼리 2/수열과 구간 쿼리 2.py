def solution(arr, queries):
    answer = []
    for s, e, k in queries:
        filtered = [x for x in arr[s:e+1] if x > k]
        if filtered:
            answer.append(min(filtered))
        else: answer.append(-1)
    return answer