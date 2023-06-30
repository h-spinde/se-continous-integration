import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    assertEquals("this is a prime number!", true, PrimeCheck.isPrime(7));
    assertEquals("this is a prime number!", true, PrimeCheck.isPrime(5179));
    assertEquals("this is a prime number!", true, PrimeCheck.isPrime(3));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    assertEquals("this is NOT a prime number!", false, PrimeCheck.isPrime(4));
    assertEquals("this is NOT a prime number!", false, PrimeCheck.isPrime(55));
    assertEquals("this is NOT a prime number!", false, PrimeCheck.isPrime(100000000));
  }
}
