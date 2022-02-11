def hanoi_Tower(n, start, end):
    list = [1, 2, 3]
    list.remove(start)
    list.remove(end)
    if (n == 2):
        print(str(start) + " " + str(list[0]))
        print(str(start) + " " + str(end))
        print(str(list[0]) + " " + str(end))
    else:
        hanoi_Tower(n-1, start, list[0])
        print(str(start) + " " + str(end))
        hanoi_Tower(n-1, list[0], end)
n = int(input())
if (n == 1):
    print(1)
    print("1 3")
else:
    print(2**n-1)
    hanoi_Tower(n, 1, 3)