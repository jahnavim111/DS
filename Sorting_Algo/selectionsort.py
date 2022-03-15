#Selection Sort Algorithm-O(n^2)

a=[]
for i in range(int(input())):
	x=int(input())
	a.append(x)

for i in range(len(a)):
	min=a[i]
	for j in range(i+1,len(a)):
		if(a[j]<min):
			min=a[j]
			k=j
	if(min!=a[i]):
		temp=a[i]
		a[i]=a[k]
		a[k]=temp
		
print(a)


