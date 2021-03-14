//public class cnstructorOverloading {
//}
//
class Rectangle{
    double length, breadth;

    Rectangle(double l,double b)
    {               //constructor to be used if
        length=l;  //user enters length and breadth
        breadth=b;
    }


    Rectangle(double side)
    {                       //constructor to be used if
        length=breadth=side;// user enters only one side of square
    }

    Rectangle()
    {                    //constructor to be used if
        length=breadth=0;//user forgets to mention dimensions
    }

    public double area(){
        double area= length*breadth;
        return area;

    }
}
//class containing main
 class Main {
    public static void main(String args[]) {
        Rectangle r1=new Rectangle(4,5); //user entered l and b of rectangle
        Rectangle r2=new Rectangle(8);   //user entered side os square
        Rectangle r3=new Rectangle();    //user forgot to mention dimensions

        System.out.println("Area of r1 = " +r1.area()  );
        System.out.println("Area of r2 = " +r2.area()  );
        System.out.println("Area of r3 = " +r3.area()  );
    }
}