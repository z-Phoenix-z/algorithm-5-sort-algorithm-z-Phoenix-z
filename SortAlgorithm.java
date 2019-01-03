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
}
