package PeterMartyr.Library.Models;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 001091501
 */
public class Search {
    
        public int linearSearchOfIntASC(int[] intArray, int number) {
        int index = 0;
        while (index < intArray.length) {
            if (intArray[index] == number) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int linearSearchOfIntDESC(int[] intArray, int number) {

        int index = intArray.length;
        while (index > 0) {
            index--;
            if (intArray[index] == number) {
                System.out.println(index);
                return index;
            }
        }
        return -1;
    }

    public int linearSearchOfStringASC(String[] stringArray, String text) {
        int index = 0;
        while (index < stringArray.length) {
            if (stringArray[index].equals(text)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int linearSearchOfStringDESC(String[] stringArray, String text) {
        int index = stringArray.length;
        while (index > 0) {
            index--;
            if (stringArray[index].equals(text)) {
                System.out.println(index);
                return index;
            }
        }
        return -1;
    }

    public int binarySeachOfIntArray(int[] array, int anInt) {
        Sort sort = new Sort();
        sort.bubbleSortIntArray_Asc(array);
        int result = -1;
        int min = 0;
        int N = array.length;
        int max = N - 1;
        do {
            int mid = (min + max) / 2;
            if (anInt == array[mid]) {
                result = mid;
                break;
            } else if (anInt > array[mid]) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
            if (min > max) {
                break;
            }
        } while (min <= max);
        return result;
    }
    
}
