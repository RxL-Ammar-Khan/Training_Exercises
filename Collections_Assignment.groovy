import java.util.*
//Task1
// List l=[]
// l=[1,2,3,4,5,6,7,8]
// l.each{s-> if(s%2==0){println s}}

//Task2
// List l=[1,1,2,2,3,3,4,5]
// Set s= l as List
// println s
// //Or
// println l.unique()

//Task3
// List l1=[11,12,13,14]
// List l2=[13,14,15]
// println l1-l2

// //Task4
// List l1=[11,12,13,14]
// List l2=[13,14,15]
// println l1.intersect(l2)

//Task5
//  List l=[1,2,3,4,5,6,7,8]
//  l.eachWithIndex{it,index->
//  if(index%2==1)
//  println it}
 
 
//Task6
// List l=[1,2,3,"element1",0.3,[2,4,6],0..10]
//  l.each{
//      println "class : ${it.getClass()}"
//  }

//Output Answer is 9


//Task7
// List l=[14,12,11,10,16,15,12,10,99,90,14,16,35]
// println l.sort{-it}.unique()

//Task8
// class Employee{
// def Name
// def Age
// def Salary
// }
// Employee s1= new Employee(Name: "A",Age: 10,Salary : 1000)
// Employee s2= new Employee(Name : "B",Age : 11,Salary : 2000)
// Employee s3= new Employee(Name : "C",Age : 12,Salary : 3000)
// Employee s4= new Employee(Name : "D",Age : 13,Salary : 4000)
// Employee s5= new Employee(Name : "E",Age : 14,Salary : 5000)
// Employee s6= new Employee(Name : "F",Age : 15,Salary : 6000)
// Employee s7= new Employee(Name : "G",Age : 16,Salary : 7000)
// Employee s8= new Employee(Name : "H",Age : 17,Salary : 8000)
// Employee s9= new Employee(Name : "I",Age : 18,Salary : 9000)
// Employee s10= new Employee(Name : "J",Age : 19,Salary : 10000)

// List s = [s1,s2,s3,s4,s5,s6,s7,s8,s9,s10]

//a
// println s.findAll{
// it.salary > 5000
// }.name

//b
// println s.min{
//     it.age
// }.salary

//c
// println s.max{
//     it.salary
// }.name

//d
// println s*.name

//Task9
// String s = "This sstring needs to be split"
// println s.tokenize("")
// println s.split("")
// println s.tokenize(" ")
// println s.split(/\s/)

//Task10

// Range r = 1..10
// println "first : ${r.get(0)} second : ${r.get(1)} last : ${r.get(9)}"

//Task11
// i=1
// 10.times{
//     print "${2*i}\n"
//     i++
// }
// i=1
// 10.times{
//     print "${12*i}\n"
//     i++
// }

//Task12
// List l=['a','a','a','a','a']
// String b=l.join('')
// println b.split('c')[1].toList()

//Task13
// List l=['a','a','a','a','a']
// String b=l.join('')
// println b.findAll{it=='a'}.size()


//Task14
// List l=1..100
// l.eachWithIndex{it,i ->
// if((i+1)%3==0 && (i+1)%5==0)
// println "Fizzbuzz"
// else if((i+1)%3==0)
// println "Fizz"
// else if((i+1)%5==0)
// println "Buzz"
// else
// println it
// }

//Task15
// List d1=new Stack()
// List d2=new Stack()
// List d3=new Stack()
// List d4=new Stack()
// List l=[d1,d2,d3,d4]
// //pop
// l.each{
//     it.pop()
// }
// //push
// l.each{
//     it.push()
// }
// //top
// l.each{
//     println it.head()
// }

//Task 16
// String l="this.is.strinnng.yayy"
// println l.split('n')
// println l.tokenize('n')

//Task 17
// Map m = ['A':11,'B':12,'C':13,'D':14,'E':15,'F':16,'G':17,'H':18,'I':19,'J':20]
// print m

//task 18
// Map m = ['A':11,'B':12,'C':13,'D':14,'E':15,'F':16,'G':17,'H':18,'I':19,'J':20]
// print m.each

//Task19
// Map m = [:]
// println m.getClass()

//Task20
// Map m = ['1':2,'2':2,'3':4,'2':5]
// println m['2']

//Task21
// Map m = ['1':2,'2':2,'3':4,'2':5]
// println m.getKey('2')

//Task22
//a
Map m= ['Computing':['Computing':600,'Information Systems':300],'Engineering':['Civil':200,'Mechanical': 100],'Management':['Management':800]]
println m.keySet().size()
//b
println m['Computing'].size()
//c
println m['Engineering']['Civil']