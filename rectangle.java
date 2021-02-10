public class rectangle extends shape{
    // inherit constructor
    public rectangle(double h, double w) {
        super(h, w);
    }

    // calculate the area
    public double area(){
        double rectangleArea = height * width;
        return rectangleArea;
    }

}
