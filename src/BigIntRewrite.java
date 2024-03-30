import java.math.BigInteger;

public class BigIntRewrite {

    public static void main(String[] args) {
        int base = 6543;
        int exponent = 21;
        BigInteger result = pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    public static BigInteger pow(int x, int n) {
        // convert int to BigInt
        BigInteger base = BigInteger.valueOf(x);

        // base case
        if (n == 0) return BigInteger.ONE;

        // find x to the n/2 recursively
        BigInteger t = pow(x, n / 2);

        // if n is even, the result is t squared
        // if n is odd, the result is t squared times x
        if (n % 2 == 0) {
            return t.multiply(t);
        } else {
            return t.multiply(t).multiply(base);
        }
    }
}
