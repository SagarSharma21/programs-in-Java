package com.company;
/*
class Main {

    public static void main(String[] args) {
	// create obj named s1and complete the code
        Student s1=new Student("karan",1056,8.8);
    s1.displayProfile();
        System.out.println("Percentage of s1 is "+s1.findPercentage());
    }
}
//
class Student {
    public int rollno;
    public String name;
    public double cgpa;
    // Declare constructor of 'Student' class here
    public Student(String name,int rollno,double cgpa){
this.name=name;
this.rollno=rollno;
this.cgpa=cgpa;
}
    public  void displayProfile() {
        System.out.println(rollno + " " + name + " " + cgpa);
    }
    public double findPercentage() {
        double percent = cgpa * 10;
        return percent;
    }
}
*/
class Main{
    public static void main(String[] args) {
        Person p1=new Person("Ankit");       // Write code here
        System.out.println(p1.getName());
    }
}

class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }

    // Declare a getter method here
    public  String getName(){
        return this.name;
    }

}