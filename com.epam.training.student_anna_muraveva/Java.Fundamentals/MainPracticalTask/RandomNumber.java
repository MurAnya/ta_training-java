public class RandomNumber {
    public static void main(String[] args){
        int[] numbers = new int[9];
        for (int i=0; i<numbers.length; i++){
            numbers [i] = i+1;
        }
        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        for (int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i]);
        }
    }
}
