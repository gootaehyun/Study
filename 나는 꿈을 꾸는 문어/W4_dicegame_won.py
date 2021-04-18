n = int(input())
dice = [0]*(n+1)

def dfs(depth):
    if depth>n:
        print(*dice[1:])
        return
    for i in range(1,7):
        dice[depth] = i
        dfs(depth+1)

dfs(1)