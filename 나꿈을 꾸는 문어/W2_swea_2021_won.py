
#3/13
# 2021) 파리퇴치

a = int(input())
for num in range (1,a+1):
    b,c = map(int,input().split())
    arr = [list(map(int,input().split())) for _ in range(b)]
    max = 0
    for i in range (b-c+1):
        for j in range(b-c+1):
            current = 0
            for k in range (c):
                for m in  range (c):
                    current +=arr[i+k][j+m]
                if current>max:
                    max = current
    print("#{} {}".format(num,max))