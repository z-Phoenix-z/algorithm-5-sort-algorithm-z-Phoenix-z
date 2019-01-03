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
  
}
