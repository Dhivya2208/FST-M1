package Activities;

public class Activity2 {
    public static boolean calculate(int array[]){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==10)
                sum = sum + array[i];
            if (sum == 30) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array1 = new int[]{10, 77, 10, 54, -11, 10};
        System.out.println(calculate(array1));

    }
}
