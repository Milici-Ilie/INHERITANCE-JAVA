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

    public int getAge() {
        int currentYear = 2024;
        int birthYear = Integer.parseInt(birthDate.substring(6));// EXTRACTING the YEAR using the 0 base numbering

        return (currentYear - birthYear);
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
