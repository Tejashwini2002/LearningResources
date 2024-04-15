# Read this only for exam.
'''
Store the following information in the dictionary.
coursecode: coursename,Faculty and No_of_registrations
Perform the following operations using functions
a) Find the course_Name that has the highest no of registrations
b) Given the course code, display the associated details
c)Display details of all courses.

'''
# you can make value as a list or tuple.

# Program on dictionary

# adding a course
def add(D):
  code = input("Enter the course code: ")
  if code not in D:
     name = input("Enter the course name: ")
     faculty=input("Enter the faculty name: ")
     reg = int(input("Enter the number of registrations for this course: "))
     D[code] = [name,faculty,reg]
  else:
     print("course is already present") 
  
# Course with highest number of registration.  
def CWHR(D):
    no_of_reg = []
    for item in D.values():
           no_of_reg.append(item[2])
       
    high = no_of_reg[0]
    for i in no_of_reg:
        if i>high:
            high = i    
        
    for item in D.values():
        if(item[2]==high):
            print(item[0]," has max.number of registrations.")  
            print("Details: ", end=' ')
            for i in item:
                print(i,end=' ')   
        print("\n")
# Searching a course given its  course code    
def  search(D):
    code = input("Enter the course code to search: ")
    if code in D:
        print("The code is present with the following details: ")
        # print(code,': ',D[code]) 
        print(code,': ',end=' ')
        for item in D[code]:
             print(item,end='  ') 
        print("\n")          
    else:
        print("Course with the code is not present")
 
# Displaying all courses    
def display(D):
    if len(D)==0:
        print("No courses")
        return
    for item,value in D.items():
        # print(item,' ',value)
        print("\n",item,":",end='  ') 
        for item in value:
         print(item,end='  ') 
    print("\n")       
       
def main():
    D = {} # empty dictionary
    
    while(1):
        print("1.Add a Course 2.Find Course with highest registrations 3. Search a Course 4.Display all courses 5.exit")
        
        opt = int(input("Enter your option: "))
        if opt == 1:
            add(D)
        elif(opt ==2): 
            CWHR(D)
        elif(opt == 3):
            search(D)
        elif(opt == 4):
            display(D)
        elif(opt == 5):
            break
        else:
            print("Invalid choice!!")
            break      
        
if __name__ =='__main__':
    main()                      
            
    