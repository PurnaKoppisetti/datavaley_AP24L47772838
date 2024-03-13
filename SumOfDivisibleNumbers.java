public class SumOfDivisibleNumbers {
    public static void main(String[] args) {
        int[] values = {100, 52, 43, 99, 42, 40, 91};
        int sum = findSumOfDivisible(values);
        System.out.println("Sum of numbers divisible by both 5 and 2: " + sum);
    }

    public static int findSumOfDivisible(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 5 == 0 && num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
}
