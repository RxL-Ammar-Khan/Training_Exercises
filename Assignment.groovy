import java.util.*
//Task 1 & Task 2 & Task 4
// package com.assignment
// import java.util.*
// class Person {
//     def name, gender, age, address
// }

// class Details extends Person {
//     def empid,company,salary
//     Details(def salary,def empid, def company,def age,def name, def gender, def address){
//         this.salary=salary
//         this.empid=empid
//         this.company=company
//         this.age=age
//         this.name=name
//         this.gender=gender
//         this.address=address
// }

//     public String toString() {
//         return """${this.getName()} is a ${this.getGender()} aged ${this.getAge()} who lives at ${this.getAddress()}. He works for ${this.company}
// with employee id ${this.empid}  and draws ${this.salary} lots of money"""
//     }
// }

// def details = new Details(180000, 1, "rxlogix",18,"Ammar","Male","Delhi")


// print(details)

//Task 3
// for (i in 0..<4) {
//     for (int j=0;j <(2**i);j++) {
//         print("*")
//     }
//     print("\n")
// }
//Task 6
// package com.assignment

// import java.sql.Time

// class HourMinute{
//     def hours
//     def minutes

//     void setHours(hours) {
//         this.hours = hours
//     }

//     void setMinutes(minutes) {
//         this.minutes = minutes
//     }

//     def getHours() {
//         return hours
//     }

//     def getMinutes() {
//         return minutes
//     }

// }
// def time = new HourMinute()
// def a= new Date()
// time.setHours(a)
// time.setMinutes(a)
// print(getHours()++)
// print(getMinutes()--)

//Task 7
// package com.assignment
//1st way
// i=1
// 10.times{print(3*i + "\n")
// i++}
// 10.times println {$(3*i)}

// //2nd way
// i=1
// 1.upto(10,{print(3*i  + "\n")
// i++})

// //3rd way
// i=1
// 1.step(10,1,{print(3*i  + "\n")
//     i++})

// //4th way
// i=1
// (1..10).each({print(3*i  + "\n")
//     i++})

//task 8
// package com.assignment
// def sample=9
// def sampleArray=[2,3,4,9]

// sampleArray.any{el-> if( el==sample)
//     print "found it"}

//Task 9
// File file1  = new File("1.txt")
// File file2 = new File("2.txt")
// File file3 =  new File("3.txt")
// File file4 = new File("4.txt")
// file4 << file1.text
// file4 << file2.text
// file4 << file3.text

//Task10
// File file1  = new File("1.txt")
// File file2 = new File("5.txt")
// def i=1
// file1.eachLine{
//     line-> if(i%2==1){
//         file2 << i +line + "\n" 
//     }
// i++
// }
//Task 11   
// File file1= new File('1.txt')
// File file2= new File('6.txt')
// List l1=[' ','\n']
// file1.eachLine{
//     line->
//         line.tokenize(" ").join("")
//         file2 << line
//     }
// //Task 12
// File file1= new File('1.jpg')
// File file3= new File('6.txt')
// ByteArrayOutputStream bos = new ByteArrayOutputStream();
// byte[] file2= bos.toByteArray()
// file3 << file2

