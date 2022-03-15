#Quick Sort - o(n^2)

def quicksort(a,lb,ub):
	pivot=lb
	l=lb
	r=ub
	while(lb!=ub):
		while(a[ub]>=a[pivot] and lb!=ub):
			ub-=1
		if(lb!=ub):
			temp=a[ub]
			a[ub]=a[pivot]
			a[pivot]=temp
			pivot=ub
		while(a[lb]<=a[pivot] and lb!=ub):
			lb+=1
		if(lb!=ub):
			temp=a[lb]
			a[lb]=a[pivot]
			a[pivot]=temp
			pivot=lb
	if(l<pivot):
		quicksort(a,l,pivot-1)
	if(r>pivot):
		quicksort(a,pivot+1,r)
a=[]
for _ in range(int(input())):
	x=int(input())
	a.append(x)
quicksort(a,0,len(a)-1)

print("After Sorting",a)	
