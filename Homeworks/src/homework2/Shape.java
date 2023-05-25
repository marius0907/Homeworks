package homework2;

public class Shape {

    public Shape(int length){
        calculateSquareArea(length);
    }

    public Shape(int length, int width){
        calculateRectangleArea(length,  width);
    }

    public Shape(double radius){
        double result = radius*radius*Math.PI;
        System.out.println("The area of the circle is :" + result );
    }

    public void calculateSquareArea(int length){
        int result =  length*length ;
        System.out.println("The area of the square is :" + result );
    }

    public void calculateRectangleArea(int length, int width){
        int result =  length*width ;
        System.out.println("The area of the rectangle is :" + result );
    }

}
