public class friendsarray {
    public static void main(String[] args) {
        String[]studentNames ={"Adarsh","yash","Ajay","Adarsh","Anurag"};
        studentNames[3]="Prashant";
        for(int i=0;i<studentNames.length;i++){
            System.out.println(studentNames[i]);
        }
    }
}
