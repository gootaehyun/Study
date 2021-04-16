T = int(input())
for t in range(1, T+1):
    N = int(input())
    pre = [1]
    print("#{0}".format(t))
    for i in range(1, N+1):
        now = []
        for j in range(i):
            if j == 0 or j == i-1:
                now.append(1)
            else:
                now.append(pre[j-1]+pre[j])
            print(now[j], end=" ")
        print()
        pre = now
