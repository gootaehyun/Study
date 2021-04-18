# n = int(input())
# dice = [0]*(n+1)

# def dfs(depth):
#     if depth>n:
#         print(*dice[1:])
#         return
#     for i in range(1,7):
#         dice[depth] = i
#         dfs(depth+1)

# dfs(1)

n = int(input())
arr = [0]*(n+1)
def dfs(depth):
    if depth>n:
        print(*arr[1:])
        return
    for i in range(1,7):
        arr[depth]= i
        dfs(depth+1)
dfs(1)