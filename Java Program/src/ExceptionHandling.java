public class ExceptionHandling {
    public static void main(String[] args) {
        // how to control the exception
        //by zero exception
        try{
            System.out.println(100/0);
        }
        catch(Exception exception){
            System.out.println(exception);
        }


        //input type or format error
        String name="Aman";

        try{
            int z=Integer.parseInt(name);
            System.out.println(z);
        }
        catch(Exception e){
            System.out.println(e);
        }

        //out of the bounds exception
        int array []={1,2,3,4};

        try{
            System.out.println(array[4]);
        }
        catch(Exception e){
            System.out.println(e);
        }


    }
}
