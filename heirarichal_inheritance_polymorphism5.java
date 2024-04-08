import java.util.Arrays;
class Sorting {
    void reverse(int[] array)
    {
        int n =array.length-1;
        for (int i = 0; i <=n; ++i)
        {
            for (int j = i + 1; j <= n; ++j)
            {
                if (array[i] < array[j])
                {
                    int a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }}}}
    void reverse(String[] array)
    {
        int n = array.length - 1;
        for (int i = 0; i <=n; ++i) {
            for (int j = i + 1; j <= n; ++j) {

                if (array[i].length()< array[j].length()) {
                    String a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }}}}
    void Sort(int[] array){
        Arrays.sort(array);
    }
    void Sort(String[] array){
        Arrays.sort(array);
    }
    void sort (int[] array, boolean descending ){
        if(descending){
            reverse(array);
        }
        else {
            Arrays.sort(array);
        }
    }
    void sort (String[] array, boolean descending ){
        if(descending){
            reverse(array);
        }
        else {
            Arrays.sort(array);
        }}}
public class heirarichal_inheritance_polymorphism5
{
    public static void main(String[]args){
        Sorting s=new Sorting();
        int[] arr={4,7,9,3,2};
        String [] array={"Arrow","MiC","Laptop","Speaker","Blue"};
        s.Sort(arr);
        System.out.println(Arrays.toString(arr));
        s.Sort(array);
        System.out.println(Arrays.toString(array));
        s.sort(arr,true);
        System.out.println(Arrays.toString(arr));
        s.sort(array,true);
        System.out.println(Arrays.toString(array));
    }
}
