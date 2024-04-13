public class Fish extends Animal {

    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    public void moveMuscles() {
        System.out.println("muscles moving ");

    }

    public void moveBackFin() {
        System.out.println("backfin moving ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if (speed == "fast") {
            moveBackFin();
        }
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }// now check the "Main.java" file and see how to call this file inherited with the "Animal.java"
}
