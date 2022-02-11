import sys
n = int(sys.stdin.readline())
li = [[] for _ in range(51)]
ans_list = [[] for _ in range(51)]
for i in range(n):
    inp = sys.stdin.readline()
    li[len(inp)-1].append(inp)

for i in range(51):
    a = set(li[i])
    a = list(a)
    ans_list[i] = sorted(a)
for i in range(51):
    for j in ans_list[i]:
        print(j, end="")