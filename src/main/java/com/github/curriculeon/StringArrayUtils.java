package com.github.curriculeon;

import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String item:array) {
            if(item.equals(value)){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] newArray = new String[array.length];
        int j = 0;
        for (int i = array.length-1; i >= 0 ; i--) {
            newArray[j] = array[i];
            j++;
        }
        return newArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static Boolean isPalindromic(String[] array) {
        String[] reverseArray = reverse(array);
        return Arrays.equals(array, reverseArray);
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static Boolean isPangramic(String[] array) {
        String strValue = Arrays.toString(array);
        String regex = "(?i)(?=.*a)(?=.*b)(?=.*c)(?=.*d)(?=.*e)(?=.*f)"
                + "(?=.*g)(?=.*h)(?=.*i)(?=.*j)(?=.*k)(?=.*l)(?=.*m)(?=.*n)"
                + "(?=.*o)(?=.*p)(?=.*q)(?=.*r)(?=.*s)(?=.*t)(?=.*u)(?=.*v)"
                + "(?=.*w)(?=.*x)(?=.*y)(?=.*z).*";
        return strValue.matches(regex);

    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurrences = 0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i].equals(value)){
                occurrences++;
            }
        }
        return occurrences;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> arrayList = new ArrayList<>();

        for (String str:array) {
            if(!str.equals(valueToRemove)){
                arrayList.add(str);
            }
        }
        String strArray [] = arrayList.toArray(new String[arrayList.size()]);

        return strArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(array[1]);
        for (int i = 1; i <= array.length - 1; i++) {
            if (!array[i].equals(array[i - 1])) {
                arrayList.add(array[i]);
            }
        }
        String strArray [] = arrayList.toArray(new String[arrayList.size()]);
        return strArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String str = array[0];
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 1; i < array.length ; i++) {
             if (!array[i].equals(array[i - 1])) {
                arrayList.add(str);
                str = array[i];
            } else {
                str += array[i];
            }
        }
        arrayList.add(str);
        String strArray [] = arrayList.toArray(new String[arrayList.size()]);
        return strArray;
    }


}
