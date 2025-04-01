package test.chayan.ques;

public class MissingInArray {

    public static void main(String[] args) {

        int[] numbers = { 1, 2, 4, 5, 6, 8, 9, 7 };  
        int n = numbers.length + 1;  
        
        System.out.println(missing(numbers, n));
    }

    public static int missing(int[] numbers, int n) {
        int totalSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : numbers) {
            actualSum += num;
        }

        return totalSum - actualSum;
    }
}
