T = int(input())
for t in range(1,T+1):
    answer = "Y"

    P = str(input().rstrip)
    Q = str(input())
    if P+"a" == Q:
        answer = "N"
    print("#{0} {1}".format(t,answer))