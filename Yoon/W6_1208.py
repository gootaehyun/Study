T = 10
for t in range(1, T+1):
    n = int(input())
    ls = list(map(int,input().split()))
    print(ls)
    for i in range(n):
        ls[ls.index(max(ls))] -=1
        ls[ls.index(min(ls))] +=1
    ans = max(ls) - min(ls)
    print("#{0} {1}".format(t,ans))