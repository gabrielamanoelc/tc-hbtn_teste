import java.util.Date;

public class Person {

    private String name;

    private int age;

    private String surname;

    private Date birthDate;

    private boolean anotherCompanyOwner;

    private boolean pensioner;

    private boolean publicServer;

    private float salary;

    public Person(String name, int age, String surname, Date birthDate, boolean anotherCompanyOwner, boolean pensioner, boolean publicServer, float salary) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.birthDate = birthDate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        this.pensioner = pensioner;
        this.publicServer = publicServer;
        this.salary = salary;
    }

    String fullName(){
        return name + " " + surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float calculateYearlySalary(){
       return salary * 12;
    }

    public boolean isMEI(){
        return salary * 12 < 130000 && age >= 18 && !anotherCompanyOwner && !pensioner && !publicServer;
    }
}
