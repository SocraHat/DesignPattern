package structure_pattern.adapter;

/**
 * 适配者类，尽管只有它有具体的操作方法，但这并不是目标类想要的，需要有Adapter来进行方法上的适配
 *
 * Created by Suagr on 2017/8/16.
 */
public class Adaptee {
    public int[] quickSort(int[] arrays){
        sort(arrays,0,arrays.length-1);
        return arrays;
    }

    private void sort(int[] arrays, int p, int r) {
        int q = 0;
        if(p<r){
            q = partition(arrays,p,r);
            sort(arrays,p,q-1);
            sort(arrays,q+1,r);
        }
    }

    private int partition(int[] arrays, int p, int r) {
        int x = arrays[r];
        int j = p-1;
        for(int i=p;i<=r-1;i++){
            if(arrays[i]<=x){
                j++;
                swap(arrays,j,i);
            }
        }
        swap(arrays,j+1,r);
        return j+1;
    }

    private void swap(int[] arrays, int j, int i) {
        int temp = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = temp;
    }

    /**
     * 进行二分查找的数组必须有个明确的顺序，一般是增序
     * @param arrays
     * @param key
     * @return
     */
    public int binarySearch(int[] arrays,int key){
        int low = 0;
        int high = arrays.length-1;
        while(low<=high){
            int mid = (high+low)/2;
            if(arrays[mid]>key){
                high = mid -1;
            } else if(arrays[mid]<key){
                low = mid + 1;
            } else{
                return 1;
            }
        }
        return -1;
    }
}
