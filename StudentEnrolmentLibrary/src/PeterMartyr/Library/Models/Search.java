package PeterMartyr.Library.Models;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

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

    public int linearSearchOfInt (int[] intArray, int number) {
        int index = 0;
        while (index < intArray.length) {
            if (intArray[index] == number) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int linearSearchOfString (String[] stringArray, String text) {
        int index = 0;
        while (index < stringArray.length) {
            if (stringArray[index].equals(text)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int binarySeachOfStringArray(String[] array, String text) {

        Arrays.sort(array); // lol

        int result = -1;
        int min = 0;
        int N = array.length;
        int max = N - 1;
        do {
            int mid = (min + max) / 2;
            if (text.equals(array[mid])) {
                result = mid;
                break;
            } else if (text.compareTo(array[mid]) > 0) {
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
