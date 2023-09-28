public class Square extends Shape {

    double lenght;

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public Square(double l){
        super("Rectangle");
        this.lenght = l;
    }

    public double getArea(){
        return lenght * lenght;
    }

    public double getPerimeter(){
        return lenght * 4;
    }

}
