
# 3.13
# 1859) 백만장자 되기 프로젝트백만장자 되기 프로젝트

a = int(input())
for i in range(1,a+1):
    b = int(input())
    w = list(map(int,input().split()))
    w=w[::-1]
    m=w[0]
    result=0
    for j in range(len(w)):
        if m>w[j]:
            result+= m -w[j]
        else:
            m=w[j]
    
    print("#{} {}".format(i,result))
    
 잘못된 코드
#a = int(input())
# for i in range(1,a+1):
#     b = int(input())
#     w = list(map(int,input().split()))
#     index  = w.index(max(w))
#     result = 0
#     for j in range(b):
#         if (w.index(w[j]))<index:
#             result+=max(w)-w[j]
#     print("#{} {}".format(i,result))