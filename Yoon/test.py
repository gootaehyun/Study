ls1 = [0]*3  # 1차원배열은 이렇게 써도 상관없음
print(ls1)

ls2 = [[0]*3]*3
#1차원배열 선언하는것 처럼 2차원배열도 선언하면 얕은복사 일어남
print(ls2)
ls2[0][1] = 2
print(ls2)

#무조건 안전하게 배열선언하는법 : append쓰기
ls1 = []
for i in range(3):
    ls1.append(0)
print(ls1)

#마찬가지로 2차원배열은 2중for문 써야겠져
ls2 = []
for i in range(3):
    tmp =[]
    for j in range(3):
        tmp.append(0)
    ls2.append(tmp)
print(ls2)

#삼중포문 append
ls3 = []
for i in range(3):
    tmp2 = []
    for j in range(3):
        tmp1 = []
        for k in range(3):
            tmp1.append(0)
        tmp2.append(tmp1)
    ls3.append(tmp2)
print(ls3)