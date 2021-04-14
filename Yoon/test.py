N = int(input())
M = int(input())
ice = [list(map(int,input().split())) for _ in range(N)]
count =0
for n in range(N):
    for m in range(M) :
        #print(ice[n][m])
        if ice[n][m]== 0 :
            #dfs
            stack = []
            stack.append([n,m])
            print(stack)
            count +=1
            while stack :
                pop = stack.pop() # pop = [y,x]
                y = pop[0]
                x = pop[1]
                for i in range(N) :
                    print(ice[i])
                print()
                ice[y][x]=1 # visit 설정
                if y -1 >= 0 and ice[y - 1][x] == 0 :
                    stack.append([y-1,x])
                if x -1 >= 0 and ice[y][x - 1] == 0 :
                    stack.append([y,x-1])
                if y +1 < N and ice[y + 1][x] == 0 :
                    stack.append([y+1,x])
                if x +1 < M and ice[y][x + 1] == 0 :
                    stack.append([y,x+1])

print(count)


        