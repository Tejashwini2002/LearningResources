def bubblesort(list1):
    for i in range(len(list1)-1):
        for j in range(i+1,len(list1),1): # range(start,stop,step)
            if(list1[i]>list1[j]):
               list1[i],list1[j] =  list1[j],list1[i]
    return list1

# list1 = [5,3,8,6,7,2]
list1 = []
n = int(input("Enter number of elements: "))
print("Enter the elements: ")
for i in range(n):
    val = int(input())
    list1.append(val)

print("The unsorted list is: ",list1)  
list1 = bubblesort(list1)           
print("The sorted list is: ",list1)        
             
'''
SAMPLE OUTPUT:
Enter number of elements: 6
Enter the elements: 
5
3
8
6
7
2
The unsorted list is:  [5, 3, 8, 6, 7, 2]
The sorted list is:  [2, 3, 5, 6, 7, 8]
'''        