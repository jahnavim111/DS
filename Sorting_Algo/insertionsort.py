#Insertion sort-O(n^2)

a=[]
for i in range(int(input())):
	x=int(input())
	a.append(x)


for i in range(1,len(a)):
	key=a[i]
	j=i-1
	while(j>=0 and key<a[j]):
		a[j+1]=a[j]
		j=j-1
	a[j+1]=key
print("After Sorting")
print(a)

