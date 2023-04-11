public class Homework09 {

    static int getDivisorCount(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 1;
        int divisorCount = 0;
        while (divisorCount <= 100) {
            int triangleNum = n * (n + 1) / 2;
            divisorCount = getDivisorCount(triangleNum);
            n++;
        }
        n--;
        int triangleNum = n * (n + 1) / 2;
        System.out.println(triangleNum);
    }
}

//