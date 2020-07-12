import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Arrays;
import java.util.Random;

public class RandomSortRec {
    public static void main(String[] args)
    {
        int[] array = {5,2,1,6};
        RandomSortRec rs = new RandomSortRec();
        array = rs.randomSort(array);
        System.out.println(Arrays.toString(array));
    }
    public int[] randomSort(int[] array)
    {
        return randomSortRec(array,0,array.length-1);
    }
    public int[] randomSortRec(int[] array,int l, int r) {
        if (isSorted(array, l, r))
        {
            return array;
        }
        else {
            Random dice = new Random();
            swapAtIndex(array,dice.nextInt(array.length),dice.nextInt(array.length));
            return randomSortRec(array,l,r);
        }
    }
    public Boolean isSorted(int[] array,int l, int r)
    {
        if (l==r)
            return true;
        if (array[l] > array[l+1])
            return false;
        else {
            return isSorted(array,++l,r);
        }
    }
    public void swapAtIndex(int[] array,int one, int two)
    {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }


}
