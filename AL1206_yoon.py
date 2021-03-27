import sys;

T = 10
for t in range(1, T+1):
    N = int(input())
    arr = list(map(int, input().split()))

    total = 0

    for n in range(2, N-2):
        if arr[n-2] < arr[n] and arr[n-1] < arr[n] and arr[n+2] < arr[n] and arr[n+1] < arr[n]:
            mx = max(arr[n-2],arr[n-1],arr[n+1],arr[n+2])
            total += arr[n] - mx
        else :
            continue
        
    print("#{0} {1}".format(t,total))
