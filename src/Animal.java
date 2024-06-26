public class Animal {
    //🏭🏭[INHERITANCE]🏭🏭 = 🏭🏭[INHERITANCE]🏭🏭 = 🏭🏭[INHERITANCE]🏭🏭

    /////////////////////////ATTRIBUTES///////////////////////
    protected String type;// giving access to child files to mutate this attribute if need it
    private String size;
    private double weight;

    /////////////////////////CHILD & PARENT class/////////////////

    public Animal() {//this is the Constructor that connect "Animal" to "Dog.java" file

    }// now we must go to the "Main.java" class

    /////////////////////////CONSTRUCTOR///////////////////////

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }//we created this Constructor using IntelliJ

    /////////////////////////STRING///////////////////////
    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }// toString(), we need it to display the data/info ❗ this method is override in the "Dog.java" file, check the circle with arrow from the left

    public void move(String speed) {
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise() {
        System.out.println(type + " makes some kind of noise");
    }

    //now go and check the "dog.java" file and see how to use "INHERITANCE"
}
