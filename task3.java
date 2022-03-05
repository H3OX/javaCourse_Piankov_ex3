import java.util.*;
public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(List.of(3, 22, 1, 13, 4, 6, 16, 5));
        System.out.println(evenNumbers(arr));
        System.out.println(doubleNumbers(arr));
        System.out.println(Collections.max(arr)); // Не стал объявлять дополнительный метод для пункта 3
        System.out.println(arrSum(arr));
        reverseArr(arr); // Аналогично пункту 3.
    }

    public static ArrayList<Integer> evenNumbers(ArrayList<Integer> arr) {
        ArrayList<Integer> evenArr = new ArrayList<Integer>();
        for (int x: arr) {
            if (x % 2 == 0) {
                evenArr.add(x);
            }
        }
        return evenArr;
    }

    public static ArrayList<Integer> doubleNumbers (ArrayList<Integer> arr) {
        ArrayList<Integer> doubleArr = new ArrayList<Integer>();
        for (int x: arr) {
            if (String.valueOf(x).length() == 2) {
                doubleArr.add(x);
            }
        }
        return doubleArr;
    }

    public static Integer arrSum(ArrayList<Integer> arr) {
        Integer sum = 0;
        for (int x: arr) {
            sum += x;
        }
        return sum;
    }

    public static void reverseArr(ArrayList<Integer> arr) {
        Collections.reverse(arr);
        System.out.println(arr);
    }
}