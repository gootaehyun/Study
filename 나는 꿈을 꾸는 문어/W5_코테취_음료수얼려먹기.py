
# 음료수 얼려먹기... 저렇게만 부분적으로 어는건 말이 안됨 


# a는 x축 b는 y축 
a,b = map(int,input().split())
ice = [list(map(int,input().split())) for _ in range(b)]


def dfs(x,y):
    if x<=-1 or y<=-1 or x>=a or y>=b:
        return False
    if ice[x][y] == 0:
        ice[x][y] = 1            
        dfs(x-1, y)
        dfs(x+1, y)
        dfs(x, y-1)
        dfs(x, y+1)
        return True
    return False

count = 0
for i in range(a):
    for j in range(b):
        if dfs(i,j) == True:
            count +=1

print(count)
