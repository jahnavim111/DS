#Radix Sort

def radixsort(a):
	bucket=[[]]*10
	b=[]
	#for number of iterations
	div=1	
	tmp=[]
	for i in range(len(str(max(a)))):
		for j in range(len(a)):
			digit=(a[j]//div)%10
			if(len(bucket[digit])==0):
				bucket[digit]=a[j]
			else:
				bucket[digit].append(a[j])
		for i in range(10):
			tmp.extend(bucket[i])
		div=div*10
		
				

a=[]
for _ in range(int(input())):
	x=int(input())
	a.append(x)
		
radixsort(a)
print("After Sorting",a)
	
	
	
