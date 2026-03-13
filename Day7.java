import java.util.Arrays;
import java.util.HashMap;

public class Day7 {
    public static void main(String[] args) {
        int[] arr = { 25, 28, 26, 4, 7, 4, 5, 10, 12, 11 };
        minimum(arr);
        maximum(arr);
        second(arr);
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : arr) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        System.out.println(hm);
        rearrange(arr);
        sum(arr);
        avg(arr);
        median(arr);
    }

    public static void minimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void maximum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void second(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i > max1) {
                max2 = max1;
                max1 = i;
            } else if (i > max2 && i != max1) {
                max2 = i;
            }
            if (i < min1) {
                min2 = min1;
                min1 = i;
            } else if (i < min2 && i != min1) {
                min2 = i;
            }
        }
        System.out.println("Second smallest: " + min2);
        System.out.println("Second largest: " + max2);
    }

    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void rearrange(int[] arr) {
        Arrays.sort(arr);
        int left = arr.length / 2;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void avg(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double avg = (double) sum / arr.length;
        System.out.println(avg);

    }

    public static void median(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        double median = 0;
        if (n % 2 != 0) {
            median = arr[n / 2];
        } else {
            median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
        System.out.println(median);
    }
}