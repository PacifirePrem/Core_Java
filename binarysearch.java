public class binarysearch{
    public static void main(String[]args) {
        int arr[] = {1, 2, 5, 9, 15, 88, 108};
        int tobesearched = 88;
        int last = arr.length-1;
        int ans = b_s(arr,0,last,tobesearched);
    }
    public static int b_s(int arr[],int start, int end, int key){
        int mid = (start + end)/2;
        while(start<=end){
            if(arr[mid]<key){
                start = mid + 1;
            }
            else if(arr[mid]==key){
                System.out.println("Element found at index: " + mid);
                break;
            }
            else{
                end = mid - 1;
            }
            mid = (start + end)/2;
        } 
        if(start>end){
            System.out.println("Element not found!!!");
        }
        return mid;
    } 
}