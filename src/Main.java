public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);//calling the "Animal.java" method
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();//calling the "Dog.java" method
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");
        Dog retriever = new Dog("Labrador retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");

        //////////////////////////////////Worker CHALLENGE//////////////////////////////

        Employee milici = new Employee("Milici", "04/10/1993", "08/10/2024");

        System.out.println(milici);
        System.out.println("Age = " + milici.getAge());
        System.out.println("Pay = " + milici.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/14/2002", "03/03/2006", 35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check  = $" + joe.collectPay());

        //🦓🦓[FORMATTING STRING]🦓🦓 🦓🦓[FORMATTING STRING]🦓🦓 🦓🦓[FORMATTING STRING]🦓🦓

        String bulletIt = "Print a Bulleted List:\n" + "\t\u2022 First Point\n" + "\t\t\u2022 Sub Point\\";
        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List: 
                    \u2022 First Point 
                        \u2022 Sub Point
                        """;
        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d%n", age);
        int yearOfBirth = 2023 - age;
        System.out.printf("Age %d, Birth year %d%n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float) age);// here we specified that we want to print only the last 2 decimals "%.2f%n", ex: 35.00

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }
    }

    public static void doAnimalStuff(Animal animal, String speed) {

        animal.makeNoise();//calling the method from the "Animal.java" file
        animal.move(speed);//calling the method
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }

}
