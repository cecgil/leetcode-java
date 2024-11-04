package Exercism;


public class QuickSort {

	    public static void quickSort(int[] array) {
	        if (array == null || array.length == 0) {
	            return;
	        }
	        int length = array.length;
	        quickSort(array, 0, length - 1);
	    }

	    private static void quickSort(int[] array, int low, int high) {
	        if (low < high) {
	            int pivot = partition(array, low, high);
	            quickSort(array, low, pivot - 1);
	            quickSort(array, pivot + 1, high);
	        }
	    }

	    private static int partition(int[] array, int low, int high) {
	        int pivot = array[high]; // escolha do pivô
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            if (array[j] < pivot) {
	                i++;
	                int temp = array[i];
	                array[i] = array[j];
	                array[j] = temp;
	            }
	        }

	        int temp = array[i + 1];
	        array[i + 1] = array[high];
	        array[high] = temp;

	        return i + 1;
	    }

	    public static void main(String[] args) {
	        int[] array = {10, 7, 8, 9, 1, 5};
	        System.out.println("Array original:");
	        printArray(array);

	        quickSort(array);

	        System.out.println("Array ordenado:");
 	        printArray(array);
	    }

	    private static void printArray(int[] array) {
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}

