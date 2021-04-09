
#3/8
# 2056) 연월일 달력

T = int(input()) 
for i in range(T): 
    numbers = input()
    date=int(numbers[6:])
    month=int(numbers[4:6])
    year=int(numbers[0:4])
    if month <1 or month>12:
        print('#{} {}'.format(i+1,-1))
        continue

    if month in [1,3,5,7,8,10,12]:
        if  date <1 or  date>31:
            print('#{} {}'.format(i+1,-1))
            continue
    if month ==2:
        if  date<1 or  date>28:
            print('#{} {}'.format(i+1,-1))
            continue

    if month in [4,6,9,11]:
        if  date <1 or  date>30:
            print('#{} {}'.format(i+1,-1))
            continue
    print("#%d %04d/%02d/%02d" %(i+1,year,month, date))