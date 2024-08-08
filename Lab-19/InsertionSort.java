public class InsertionSort{
    public static void main(String[] args){
        int [] arr = { 1 , 5 , 3 , 7 , 4 , 2 , 9 , 8 , 89 , 13};

        insertion(arr);

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void insertion(int [] arr){
        int len = arr.length;

        for(int i = 1 ; i < len ; i++){
            int j = i;

            while(j > 0 && arr[j] < arr[j - 1]){
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}