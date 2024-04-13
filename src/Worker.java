public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;// we made this attribute "protected" because this will give us the possibility to change the date for different users

    public Worker() {
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    public int getAge(){
        int currentYear = 2024;
        int birthYear = Integer.parseInt(birthDate);// we need to convert the string that we get from the User to valid data/numbers
        int age = currentYear - birthYear;
        System.out.println("Age: " + age);
        return age;
    }

    public double collectPay(){

    }

    public String terminate(){

    }
}
