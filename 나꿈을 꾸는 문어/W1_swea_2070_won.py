
#3/8
# 2070) 큰놈 작은놈 같은놈

T = int(input())
for i in range (T):
    a,b = map(int, input().split())
    if a == b:
        print("#{} {}".format(i+1,"="))
    elif a > b:
         print("#{} {}".format(i+1,">"))
    else:
         print("#{} {}".format(i+1,"<"))  