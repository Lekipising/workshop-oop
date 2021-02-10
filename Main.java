

class Main {
    public static void main(String[] args) {
        // create rectangle
        rectangle rec1 = new rectangle(4, 6);

        // create cuboid
        cuboid cuboid1 = new cuboid(7, 9, 10);

        // get area of rectangle
        System.out.println(rec1.area());

        // get volume of cuboid
        System.out.println(cuboid1.volume(9));
        
    }

}
