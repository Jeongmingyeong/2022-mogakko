dic = {1 : 10, 2 : 55, 3 : 220}
def dp(n):
    list = []
    new_list = [0]*10
    for i in range(10):
        list.append(1)

    for i in range(1, n):
        if (i == 1):
            a=0
        else:
            list = new_list[:]
        for j in range(10):
            if (j == 0):
                new_list[j] = dic[i] % 10007
            else:
                new_list[j] = (new_list[j-1] - list[j-1]) % 10007
        dic[i+1] = sum(new_list)
    return dic[n]
    

n = int(input())
print(dp(n))