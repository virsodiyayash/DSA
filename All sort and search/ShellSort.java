public class ShellSort {
    public static void main(String[] args){

        int [] array = {80 , 93 , 60 , 12 , 42 , 30 , 68 , 85 , 10};
        int N = array.length;

        for(int gap = N / 2 ; gap >= 1 ; gap = gap / 2){
            
            for(int j = gap ; j < N ; j++){

                for(int i = j - gap ; i >= 0 ; i = i - gap){

                    if(array[i + gap] >= array[i]){
                        break;
                    }

                    else{
                        int temp = array[i + gap];
                        array[i + gap] = array[i];
                        array[i] = temp;

                        // for(int k = 0 ; k < array.length ; k++){
                        //     System.out.print(array[k] + " ");
                        // }
                    }

                    System.out.println();

                }

            }

        }

        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }

    }
}
