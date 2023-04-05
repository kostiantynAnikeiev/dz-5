public class Main {
    public static void main(String[] args) {
        int a = 34;
        int b = 45;
        int c = 11;
        int d = 43;

        int sum1 = a + b;
        int sum2 = c + d;

        boolean isFirstSumGrater = sum1 > sum2;
        System.out.println(isFirstSumGrater);

        sum1 += 1;
        sum2 -= 2;
        boolean isFirstSumGraterUpdate = sum1 > sum2;
        System.out.println(isFirstSumGraterUpdate);

        boolean isAnySumCanBeDevidedTo2 = sum1 % 2 == 0 || sum2 % 2 == 0;
        System.out.println(isAnySumCanBeDevidedTo2);
    }
}