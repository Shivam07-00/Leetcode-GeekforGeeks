class Solution {
    public void mergeArrays(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        int[] arr = new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(a[i]<b[j]){
                arr[k] = a[i];
                k++;
                i++;
            }
            else{
                arr[k] = b[j];
                k++;
                j++;
            }
        }
        while (i < n) {
            arr[k++] = a[i++];
        }

        while (j < m) {
            arr[k++] = b[j++];
        }
        
        for(i=0;i<n;i++){
            a[i] = arr[i];
        }
        for(j=0;j<m;j++){
            b[j] = arr[j+n];
        }
    }
}
