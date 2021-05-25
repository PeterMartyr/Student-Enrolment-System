/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeterMartyr.Library.Models;

/**
 *
 * @author 001091501
 */
public class Sort {
    
        public void bubbleSortIntArray_Desc(int[] numbers) {
        int t;
        for (int j = 0; j <= numbers.length - 2; j++) {
            for (int i = 0; i <= numbers.length - 2; i++) {
                if (numbers[i + 1] > numbers[i]) {
                    t = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = t;
                }
            }
        }
    }

    public void bubbleSortIntArray_Asc(int[] numbers) {
        int t;
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    t = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = t;
                }
            }
        }
    }

    public void bubbleSortStringArray_Asc(String[] stringArray) {
        String t;

        for (int j = 0; j <= stringArray.length - 2; j++) {
            for (int i = 0; i <= stringArray.length - 2; i++) {
                if (stringArray[i].compareTo(stringArray[i + 1]) > 0) {
                    t = stringArray[i + 1];
                    stringArray[i + 1] = stringArray[i];
                    stringArray[i] = t;
                }
            }
        }
    }

    public void bubbleSortStringArray_Desc(String[] stringArray) {
        String t;
        for (int j = 0; j <= stringArray.length - 2; j++) {
            for (int i = 0; i <= stringArray.length - 2; i++) {
                if (stringArray[i + 1].compareTo(stringArray[i]) > 0) {
                    t = stringArray[i + 1];
                    stringArray[i + 1] = stringArray[i];
                    stringArray[i] = t;
                }
            }
        }
    }

    public void selectionSortInt(int[] intArray) {

        int tmp, min_Key;
        for (int j = 0; j < intArray.length - 1; j++) {
            min_Key = j;
            for (int k = j + 1; k < intArray.length; k++) {
                if (intArray[k] < intArray[min_Key]) {
                    min_Key = k;
                }
            }
            tmp = intArray[min_Key];
            intArray[min_Key] = intArray[j];
            intArray[j] = tmp;
        }
    }
    
}
