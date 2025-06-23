def solution(name, yearning, photo):
    score_dict = {n: y for n, y in zip(name, yearning)}
    answer = []
    for people in photo:
        total = 0
        for person in people:
            total += score_dict.get(person, 0)
        answer.append(total)
    return answer