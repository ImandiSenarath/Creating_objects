//creating two objects 

//Student class 
class Student{
    //instance variables
    String x = "Sam";
    String y = "John";
    //main class 
    public static void main(String[] args) {
        Student myObj1 = new Student(); //Obj1
        Student myObj2 = new Student(); //Obj2

        //display objects
        System.out.println(myObj1.x);
        System.out.println(myObj2.y);
    }
}