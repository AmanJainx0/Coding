package com.aman.sorting;

class Sort{
    public void swap(int i, int j, int arr[]){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int[] sorti(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    swap(i, j, arr);
                }
            }
            
        }
        return arr;
    }
    

    
}



public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[] {54, 10, 21, 0, 25, 41, 3, 9, 11, 52};
        Sort s = new Sort(); 
        for(int ne:s.sorti(arr)){
            System.out.println(ne);
        }
    }
}
