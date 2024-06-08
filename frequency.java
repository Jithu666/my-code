public class frequency {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,6,6};
        int n = arr.length;
        findFreq(arr, n);
    }
    public static void findFreq(int[] arr, int n){
        boolean visited[] = new boolean[n];

        for(int i = 0; i < n; i++){
            if(visited[i] == true) {
                continue;
            }
            int count = 1;
            for(int j = i+1; j < n; j++){
               if(arr[i] == arr[j]){
                   visited[j] = true;
                   count++;
               }
            }
        System.out.println(arr[i] + " : " + count);
        }
    }
}
