public class RightTriangle {
    private double a;
    private double b;
    private double c;
    public RightTriangle(double a, double b){
        this.a = a;
        this.b = b;
        this.c = Math.sqrt(a*a + b*b);
    }
    public double Area(){
        return 0.5*a*b;
    }
    public double Perimeter(){
        return a+b+c;
    }
    public double hypotenuse(){
        return c;
    }
    public String toString(){
        return "Right triangle| a = "+a+", b = "+b+", c = "+c
                +" |\nArea: "+Area()+"\nPerimeter: "+Perimeter();
    }
}
