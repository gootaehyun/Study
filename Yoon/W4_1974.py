T = int(input())
for t in range(1, T+1) :
    n = 9
    board = []
    for i in range(n) :
        arr = list(map(int,input().split()))
        board.append(arr)
    
    checks = [False]*9
    ans = 1
    flag = False

    #가로체크
    for i in range(9) :
        checks = [False]*9
        for j in range(9) :
            if not checks[board[i][j] - 1] :
                checks[board[i][j] - 1] = True
            else :
                flag = True
                break
        if flag :
            break
    if not flag :
        #세로체크   
        for i in range(9) : 
            checks = [False]*9
            for j in range(9) :
                if not checks[board[j][i] - 1] :
                    checks[board[j][i] - 1] = True
                else :
                    flag = True
                    break
            if flag :
                break
        for i in range(0,9,3) :
            for j in range(0,9,3) :
                checks = [False]*9
                for i2 in range(3) :
                    for j2 in range(3) :
                        if not checks[board[i + i2][j + j2] - 1] :
                            checks[board[i + i2][j + j2] - 1] = True
                        else :
                            flag = True
                            break
        
    if flag :
        ans = 0
    print("#{0} {1}".format(t,ans))
