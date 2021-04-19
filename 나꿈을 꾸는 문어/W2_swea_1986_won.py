
#3/13
# 1986) 지그재그 숫자

n = int(input())
for i in range (n):
    k = 0
    a = int(input())
    for p in range (a):
        if (p+1)%2 == 0:
            t=(p+1)*-1
        else:
            t=(p+1)
        k =k+t
    print(f"#{i+1} {k}")

#2번째 방법

a = int(input())
for i in range (1,a+1):
    n = int(input())
    b=0
    for nn in range (1,n+1):
        if nn%2==1:
            b+=nn
        else:
            b-=nn
    print('#{} {}'.format(i, b))