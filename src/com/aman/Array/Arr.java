package com.aman.Array;

class Calculate {
    public int[] twoRepeated(int[] arr) {
        int[] res = new int[2];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) { 
                    res[index++] = arr[i];
                    break; 
                }
            }
            if (index == 2) break;
        }
        return res;
    }
}

public class Arr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 3, 4, 3};
        Calculate obj = new Calculate();
        int[] result = obj.twoRepeated(arr);

        System.out.println("Repeated elements: " + result[0] + ", " + result[1]);
    }
}
