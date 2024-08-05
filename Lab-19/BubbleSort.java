public class BubbleSort{
    public static void main(String[] args){
        int [] arr = {1 , 9 , 8 , 7 , 5 , 3 , 6 , 4 , 2};
        int length = arr.length;

        for(int i = 0 ; i < length - 1 ; i++){
            for(int j = 0 ; j < length - 1 - i ; j++){
                if(arr[j + 1] < arr[j]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0 ; i < length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}