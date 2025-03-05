//how it work: compare với số trước nó cho tới khi nó hết nhỏ nhất thì chèn vị trí của nó vào vị trí trước đó
//temp=9, while lỗi, trả gtri A[0] về temp=9, temp=5, while chạy, A[0]=9 >= 5, A[1]<- A[0](=9) , j-- = 0, A[0]=5
import java.util.Arrays;
public class InsertionSort {
    public static void insertion(int[] A){
        int n= A.length;
        for(int i=0; i< n; i++){ //i bắt đầu từ 1 cũng được
            int temp= A[i];
            int j=i;

            while(j>0 && A[j-1]>= temp){ //nếu số ở vị trí j-1 (aka: nhỏ hơn i) lớn hơn số ở vị trí i
                A[j]= A[j-1]; 
                --j;
            }

            A[j]= temp;
        }
    }

    public static void main(String[] args) {
        int[] array= {9, 5, 7, 3, 1};
        insertion(array);
        System.out.println("The result after sort:" + Arrays.toString(array));
    }
}
