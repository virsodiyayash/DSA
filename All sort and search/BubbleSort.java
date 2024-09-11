public class BubbleSort {
    public static void main(String[] args){

        int [] array = {1 , 6 , 2 , 9 , 4 , 12 , 7 , 5 , 3 , 6 , 10};
        int length = array.length;

        for(int i = 0 ; i < length - 1; i++){
            for(int j = i + 1 ; j < length - 1 - i ; j++){
                if(array[j + 1] < array[j]){
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int i = 0 ; i < length ; i++){
            System.out.print(array[i] + " ");
        }

    }
}
