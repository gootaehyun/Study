
#3/8
# 2072) 홀수만 더하기

T = int(input())
for i in range (T):
    number = list(map(int, input().split()))
    odd_num = [num for num in number if num % 2 == 1]
    print("#{} {}".format(i+1,sum(odd_num)))