public class Q6 {
    public static  <T> T search(T[] array, T target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                System.out.println("The element "+array[i]+" is available in the array");
                return array[i];
            }
        }
        System.out.println("The element "+target+" is not available in the array");
        return null;
    }

    public static void main(String[] args) {
        String[] names = {"muji", "ali", "muneeb", "arsal"};
        String target = "muji";
        String answer = search(names, target);
        System.out.println("The result is\n" + answer);

        String[] arr = {"10","20","30","40","50"};
        String targetNum = "25",numAnswer = search(arr,targetNum);
        System.out.println("The result is\n" + numAnswer);
    }
}
