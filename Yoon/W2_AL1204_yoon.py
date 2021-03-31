T = int(input())
for t in range(1,T+1):
    s = int(input())
    ls = [0]*101
    ls2 = list(map(int, input().split()))
    for i in ls2:
        ls[i] +=1


    ls.reverse()
    idx = ls.index(max(ls))

    print("#{0} {1}".format(t,100 - idx))
