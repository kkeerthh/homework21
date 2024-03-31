public class User {
    private final String NAME;
    private final int DAY_OF_BIRTH;
    private final int MONTH_OF_BIRTH;
    private final int YEAR_OF_BIRTH;
    private final String EMAIL;
    private final String PHONE;
    private String surname;
    private double weight;
    private int pressure;
    private int numOfSteps;
    private int age;

    public User(String NAME, int DAY_OF_BIRTH, int MONTH_OF_BIRTH, int YEAR_OF_BIRTH, String EMAIL, String PHONE, String surname, double weight, int pressure, int numOfSteps) {
        this.NAME = NAME;
        this.DAY_OF_BIRTH = DAY_OF_BIRTH;
        this.MONTH_OF_BIRTH = MONTH_OF_BIRTH;
        this.YEAR_OF_BIRTH = YEAR_OF_BIRTH;
        this.EMAIL = EMAIL;
        this.PHONE = PHONE;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.numOfSteps = numOfSteps;
        findAge();
    }

    public String getNAME() {
        return NAME;
    }

    public int getDAY_OF_BIRTH() {
        return DAY_OF_BIRTH;
    }

    public int getMONTH_OF_BIRTH() {
        return MONTH_OF_BIRTH;
    }

    public int getYEAR_OF_BIRTH() {
        return YEAR_OF_BIRTH;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public String getPHONE() {
        return PHONE;
    }

    public String getSurname() {
        return surname;
    }

    public double getWeight() {
        return weight;
    }

    public int getPressure() {

        return pressure;
    }

    public int getNumOfSteps() {

        return numOfSteps;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setNumOfSteps(int numOfSteps) {
        this.numOfSteps = numOfSteps;
    }

    private void findAge() {
        int currYear = 2020;
        age = currYear - YEAR_OF_BIRTH;
    }

    public void printAccountInfo() {
        System.out.println("Name: " + NAME);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Date of Birth: " + DAY_OF_BIRTH + "." + MONTH_OF_BIRTH + "." + YEAR_OF_BIRTH);
        System.out.println("Email: " + EMAIL);
        System.out.println("Phone: " + PHONE);
        System.out.println("Weight: " + weight);
        System.out.println("Blood Pressure: " + pressure);
        System.out.println("Steps per Day: " + numOfSteps);
        System.out.println();
    }
}

