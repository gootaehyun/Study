T = int(input())
for t in range(1, T+1) :
    n = int(input())
    num = []
    for i in range(n) :
        arr = list(map(int,input().split()))
        num.append(arr)

    print("#{0}".format(t))
    for i  in range(n) :
        for j in range(n):
            print(num[n-1-j][i],end="")
        print(" ",end="")
        for j in range(n):
            print(num[n-1-i][n-1-j],end="")
        print(" ",end="")
        for j in range(n):
            print(num[j][n-1-i],end="")
        print()
