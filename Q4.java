public class Q4{
    public static <T extends Comparable <T>> T findMaximum(T[] array)    {
        T maximum = array[0];

        for (int i=0; i< array.length; i++){
            if (array[i].compareTo(maximum) > 0){
                maximum = array[i];
            }
        }

        System.out.println("The maximum number is" + maximum);
        return maximum;
    }

    public static void main(String[] args) {

        Integer[] array = {66,55,22,44,77};
        findMaximum(array);
    }
}