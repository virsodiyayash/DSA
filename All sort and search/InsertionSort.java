public class InsertionSort {
    public static void main(String[] args){

        int [] array = { 1 , 10 , 9 , 5 , 6 , 2 , 4 , 90 , 8 , 7};

        insertion(array);

        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void insertion(int [] array){
        int length = array.length;

        for(int i = 0 ; i < array.length ; i++){
            int j = i;

            while(j > 0 && array[j] < array[j - 1]){
                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
                j--; 
            }
        }
    }
}
