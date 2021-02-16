package shape_pc;

public class cuboid extends rectangle{
    double l;
    // inherit constructor
    public cuboid(double h, double w, double l) {
        super(h, w);
        this.l = l;
    }

    // calculate volume, will get height and width from super class, we add length
    public double volume(double length) {
        double cuboidvolume = height *width * length;
        return cuboidvolume;
    }
}
