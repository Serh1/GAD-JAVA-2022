package Lecture3.Ch2;

public class MergeSort implements SortingStrategy{
    @Override
    public void sort(Integer[] list) {
        int l = 0;
        int r = list.length;
        doSort(list,l,r-1);
        System.out.println("Merge sorted!");
    }

    public void doSort(Integer list[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;

            doSort(list, l, m);
            doSort(list, m + 1, r);

            merge(list, l, m, r);
        }
    }

    void merge(Integer list[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = list[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = list[m + 1 + j];


        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                list[k] = L[i];
                i++;
            }
            else {
                list[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            list[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            list[k] = R[j];
            j++;
            k++;
        }
    }

}
