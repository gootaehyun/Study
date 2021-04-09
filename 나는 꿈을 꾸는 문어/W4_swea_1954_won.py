

#4/9
# 1954) 달팽이 숫자

dx =[-1, 0, 1, 0]
dy = [0, 1, 0, -1]

a = int(input())

for c in range(1, a+1):
    
    n = int(input())
    snail = [[0]*n for _ in range(n)]
    
    x,y=0,0
    d=0
    i=2
    snail[x][y] = 1
    
    while i<= n*n:
        if -1<x+dx[d%4]<n and -1<y+dy[d%4]<n and snail[x+dx[d%4]][y+dy[d%4]]==0:
            x = x+dx[d%4]
            y = y+dy[d%4]
            snail[x][y]=i
            i+=1
        else:
            d+=1
    print("#{}".format(c))
    for i in range(n):
        print(*snail[i])