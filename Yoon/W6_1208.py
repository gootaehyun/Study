def dfs(n, now):
    global maximum
    if(now == depth):
        res = int("".join(map(str, ls)))
        maximum = max(res,maximum)
        return
    for i in range(n, leng):
        for j in range(i+1, leng):
            ls[i], ls[j] = ls[j], ls[i]
            dfs(n,now+1)
            ls[i], ls[j] = ls[j], ls[i]

T = int(input())
leng = 0
depth = 0
for t in range(1, T+1):
    maximum = 0
    inputs = input().split(" ")
    ls = [0]*len(inputs[0])
    leng = len(ls)
    for i in range(leng):
        ls[i] = int(inputs[0][i])
    depth = int(inputs[1])
    dfs(0, 0)
    print("#{0} {1}".format(t, maximum))