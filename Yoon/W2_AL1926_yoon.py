N = int(input())
for t in range(1, N+1) :
    count = 0
    for i in str(t):
        if i=="3" or i=="6" or i=="9" :
            count+=1
    
    if count != 0:
        print("-"*count,end=" ")
    else:
        print(t,end=" ")
        
        
                

