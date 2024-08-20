public class BubbleSort {
    public static void main(String[] args) {

        int[] Arr={88,89,90,91,92,93,94,95,3};
        int i=0;
        int j=0;
        int n=Arr.length;
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(Arr[j]>Arr[j+1]) {
                    int temp=Arr[j];
                    Arr[j]=Arr[j+1];

                    Arr[j+1]=temp;

                }


            }
        }

        for(i=0;i<n;i++) {

            System.out.println("Sorted array:"+Arr[i]);

        }





    }
}


