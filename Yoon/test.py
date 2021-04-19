n = int(input())
ls = [1]*n
for i in range(6**n):
    for j in range(n-1, 0, -1):
        if ls[j] > 6:
            ls[j] = 1
            ls[j-1] += 1
    print(ls)
    ls[n-1] += 1

n = int(input())
ls = [1]*n
for i in range(6**n):
    for j in range(n-1, 0, -1):
        if ls[j] > 6:
            ls[j] = 1
            ls[j-1] += 1
    print(ls)
    ls[n-1] += 1