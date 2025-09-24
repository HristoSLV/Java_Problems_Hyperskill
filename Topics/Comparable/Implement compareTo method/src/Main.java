
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger bigInt1 = new BigInteger("123456789101112");
        BigInteger bigInt2 = new BigInteger("987654321010220");

        BigDecimal result = new BigDecimal(bigInt1).divide(new BigDecimal(bigInt2), 2, BigDecimal.ROUND_HALF_UP);
        System.out.println(result);
    }
}