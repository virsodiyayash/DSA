public class SelectionSort {
    public static void main(String[] args) {

        int[] array = { 1, 9, 3, 6, 4, 7, 5, 10, 2 };
        int length = array.length;

        for (int i = 0; i < length; i++) {
            int smallest = i;

            for(int j = i + 1 ; j < length ; j++){
                
                if(array[smallest] > array[j]){
                    smallest = j;
                }
            }

            int temp = array[i];
            array[i] = array[smallest];
            array[smallest] = temp;
        }

        for(int i = 0 ; i < length ; i++){
            System.out.print(array[i] + " ");
        }
    }

}
