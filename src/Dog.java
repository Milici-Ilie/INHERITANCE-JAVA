public class Dog extends Animal {
    //🏭🏭[INHERITANCE]🏭🏭 // first we must create an empty "public" class in the "Animal.java" class

    private String earShape;//dog specific field
    private String tailShape;//dog specific field

    public Dog() {
        super("Mathew", "Big", 50);//inside "super" we must add the attributes need it in the "Animal.java" file
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");//connecting with the constructor from bellow
    }//creating a CONSTRUCTOR and calling the other CONSTRUCTOR from bellow and passing the attributes 🔻🔻🔻
    //now let's see how we call those CONSTRUCTORS in "main.java" file

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }// ❗❗❗❗❗❗❗❗❗❗ we added this "toString()" + "super.toString()" by selecting it in the: "menu, code, generate, toString(), and select [stringConcat() + super.toString()]" ❗❗❗❗❗❗❗❗❗❗ the only
    // difference from a normal "toString()" is the " + toString()" added at the final code

    public void makeNoise() {

    }//in the left, you can see a "blue circle with a red arrow on it", that's indicate that this method wil override the original method

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dogs walk, run and wag their tail");
    }// we can override a method using the "auto" from the IntelliJ [menu, code, override Methods...]
}// the "Dog" file will inherit all the attributes from the "Animal.java" file, and we can add more attributes (type, size and weight)
