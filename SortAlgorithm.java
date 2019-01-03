public class SortAlgorithm{
  public SelectionSort {
        int[] a = { 3, 8, 1, 10 };
        for (int i = 0; i < a.length; i++) {
            int index = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[index]) {
                    index = j;
                }
            }
            int tep = a[i];
            a[i] = a[index];
            a[index] = tep;
        }
        for (int i : a)
            System.out.println(i);
    }
  public BucketSort{
  int [] a = new int [2,3,4,5,2,7];
  int [] b = new int [7+1];               //长度等于a的最大值，看条件写不写找maximum的方法。 最大值要➕1；
  for (int i = 0; i < a.length ; i ++){
   b [a[i]] ++;
  }
  for (int i = 0; i < b.length; i ++){
   if (b [i] != 0){
      System.out.print( b[i] );
   }
  } 
    public Bubble {
    int [] a = {5,4,2,1,3};
int n = 1;
while (n < a.length){
  for(int i = 0;i < a.length-n; i ++){
    int b = 0;
    if (a[i]<a[i+1]){
      b = a[i];
      a[i] = a[i+1];
      a[i+1] = b;
    }
n++;
 }
for (int i = 0 ; i < a.length; i ++){
  System.out.print(a[i]);
}
}
      public class MergeSort {
    public static void mergeSort(int[] ints, int leftStart, int rightEnd) {
        // base case
        if (leftStart == rightEnd) {
            return;
        }
        int leftEnd = (rightEnd - leftStart) / 2 + leftStart;
        mergeSort(ints, leftStart, leftEnd);
        mergeSort(ints, leftEnd + 1, rightEnd);
        merge(ints, leftStart, leftEnd, rightEnd);
    }

    public static void merge(int[] ints, int leftStart, int leftEnd, int rightEnd) {
        int[] temp = new int[rightEnd - leftStart + 1];
        int l = leftStart;
        int r = leftEnd + 1;
        int index = 0;
        while (l <= leftEnd && r <= rightEnd) {
            if (ints[l] < ints[r]) {
                temp[index] = ints[l];
                index++;
                l++;
            }
            if (ints[r] < ints[l]) {
                temp[index] = ints[r];
                index++;
                r++;
            } else {
                temp[index] = ints[l]; // 另一种情况就是俩数相等，就随便找个数组放进去一个。
                index++;
                l++;
            }
        }
        while (l <= leftEnd) {
            temp[index] = ints[l];
            index++;
            l++;
        }
        while (r <= rightEnd) {
            temp[index] = ints[r];
            index++;
            r++;
        }
        for (int i = 0; i < temp.length; i++) {
            ints[leftStart + i] = temp[i];
        }
    }

    public static void print(int[] ints) {
        for (int a : ints) {
            System.out.println(a + " ");
        }
    }

    public static void main(String[] args) {
        int[] ints = { 1, 3, -1, 5 };
        // 0 1 2 3
        merge(ints, 0, 1, 3);
        print(ints);
    }
}
}
