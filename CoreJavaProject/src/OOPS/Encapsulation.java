package OOPS;
//it is a data binding using methods
public class Encapsulation {
    public static void main(String[] args) {
       // to print the trainer profile
       Trainers trainers = new Trainers();
       trainers.name="Aman Singh";
       trainers.email="aman.singh@gmail.com";
       trainers.technology="JAVA";
       System.out.println(trainers.name + " " + trainers.email + " " + trainers.technology);
    }

}
class Trainers{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    String email;
    String technology;

}