package core2;
import java.util.Arrays;

class MergeSortMultiThreaded {
    private int[] array;
    
    public MergeSortMultiThreaded(int[] array) {
        this.array = array;
    }
    
    public void sort() {
        if (array.length < 2) {
            return;
        }
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        
        Thread leftSorter = new Thread(new Sorter(left));
        Thread rightSorter = new Thread(new Sorter(right));
        
        leftSorter.start();
        rightSorter.start();
        
        try {
            leftSorter.join();
            rightSorter.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        merge(left, right, array);
    }
    
    private void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            result[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }
    
    private static class Sorter implements Runnable {
        private int[] array;
        
        public Sorter(int[] array) {
            this.array = array;
        }
        
        @Override
        public void run() {
            Arrays.sort(array);
        }
    }
    
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Unsorted array: " + Arrays.toString(array));
        
        MergeSortMultiThreaded sorter = new MergeSortMultiThreaded(array);
        sorter.sort();
        
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
