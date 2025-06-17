def solution(code):
    mode = 0
    ret = ''
    
    for idx, val in enumerate(code):
        if val == '1':
            mode = 1 - mode
        else:
            if mode == 0 and idx % 2 == 0:
                ret += val
            elif mode == 1 and idx % 2 != 0:
                ret += val
        
    return ret if ret else "EMPTY"