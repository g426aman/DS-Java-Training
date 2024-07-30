package OOPS;
//to print the student info
public class encapsulationexample {
    public static void main(String[] args) {


                // add the student info
                StudentProfile s=new StudentProfile();
                s.setName("Aman");
                s.setEmail("a@gmail.com");
                s.setAddress("Lucknow");
                s.setMobile(8009066);

        System.out.printf(s.getName());
    }
}
class StudentProfile{
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    String email;
    String address;
    long mobile;

}