def mergesort(list):
    if (len(list) < 2):
        return list
    else:
        start = 0
        end = len(list)
        mid = len(list)//2
        
        start_list = mergesort(list[:mid])
        end_list = mergesort(list[mid:end])
        
        mergelist = []
        p = q = 0
        while (True):
            if (p == len(start_list) or q == len(end_list)):
                break
            else:
                if (start_list[p][0] <= end_list[q][0]):
                    mergelist.append(start_list[p])
                    p += 1
                else:
                    mergelist.append(end_list[q])
                    q += 1
        
        mergelist += start_list[p:]
        mergelist += end_list[q:]
        return mergelist

n = int(input())
li = [[0 for _ in range(2)] for _ in range(n)]
for i in range(n):
    a, b = map(str, input().split())
    a = int(a)
    li[i][0] = a
    li[i][1] = b

li = mergesort(li)
print(li)
    
    
        
                