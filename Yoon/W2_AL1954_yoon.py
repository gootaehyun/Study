T = int(input())
for t in range(1, T+1) :
    N = int(input())
    ls = [[0]*N for i in range(N)]
    drArr = [[0,1],[1,0],[0,-1],[-1,0]] #우 / 하 / 좌 / 상 순서
    count = 1
    limit = N*N
    x,y = 0,0
    dr = 0 #0~3까지

    while count <= limit :
        # print(ls)
        if x >= 0 and x < N and y >= 0 and y < N and ls[x][y] == 0 :
            ls[x][y] = count
            count += 1
        else :
            x -= drArr[dr][0]
            y -= drArr[dr][1]
            dr = (dr + 1) % 4

        x+= drArr[dr][0]
        y+= drArr[dr][1]
    
    print("#{0}".format(t))
    for line in ls :
        for el in line :
            print(el, end = " ")
        print()
