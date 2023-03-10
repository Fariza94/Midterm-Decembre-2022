package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */



    public int[] selectionSort(int [] array){

        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        //https://www.youtube.com/watch?v=nKzEJWbkPbQ
        for (int j = 1; j < array.length; j++) {
            int c = array[j];
            int i = j - 1;

            while (i >= 0 && array[i] > c) {
                array[i + 1] = array[i];
                i = i --;
            }
            array[i + 1] = c;
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        //implement here
        final long startTime = System.currentTimeMillis();
        for (int j = 0; j < array.length-1; j++)
            for (int i = 0; i < array.length-j-1; i++)
                if (array[i] > array[i+1])
                {
                    int c = array[i];
                    array[i] = array[i+1];
                    array[i+1] = c;
                }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;

    }
    

    public int [] mergeSort(int [] array) {
        int[] list = array;
        //implement here
        final long startTime = System.currentTimeMillis();
        if (array.length < 2) {
            return array;
        }
        int c = array.length / 2;
        int[] l = new int[c];
        int[] R = new int[array.length - c];
        for (int i = 0; i < c; i++) {
            l[i] = array[i];
        }
        for (int i = c; i < array.length; i++) {
            R[i - c] = array[i];
        }
        mergeSort(l);
        mergeSort(R);
    //mergeSort(array, l, R, c, array.length - c);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }
    

    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
