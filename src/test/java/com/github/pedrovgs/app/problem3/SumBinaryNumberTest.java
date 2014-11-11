package com.github.pedrovgs.app.problem3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Pedro Vicente Gómez Sánchez.
 */
public class SumBinaryNumberTest {

  private SumBinaryNumbers sumBinaryNumbers;

  @Before public void setUp() {
    this.sumBinaryNumbers = new SumBinaryNumbers();
  }

  @Test(expected = IllegalArgumentException.class) public void shouldNotAcceptNullInputs() {
    sumBinaryNumbers.sumBinaryNumbersCheating(null, null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldNotAcceptMalformedBinaryNumbers() {
    String n1 = "10";
    String n2 = "2";

    sumBinaryNumbers.sumBinaryNumbersCheating(n1, n2);
  }

  @Test public void zeroPlusZeroEqualsZero() {
    String n1 = "0";
    String n2 = "0";

    String result = sumBinaryNumbers.sumBinaryNumbersCheating(n1, n2);

    assertEquals("0", result);
  }

  @Test public void zeroPlusTwoEqualsTwo() {
    String n1 = "0";
    String n2 = "10";

    String result = sumBinaryNumbers.sumBinaryNumbersCheating(n1, n2);

    assertEquals("10", result);
  }

  @Test public void fivePlusSevenEqualsTwelve() {
    String n1 = "101";
    String n2 = "111";

    String result = sumBinaryNumbers.sumBinaryNumbersCheating(n1, n2);

    assertEquals("1100", result);
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldNotAcceptNullInputsBasedOnPowersOfTwo() {
    sumBinaryNumbers.sumBinaryNumbersBasedOnPowersOfTwo(null, null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldNotAcceptMalformedBinaryNumbersBasedOnPowersOfTwo() {
    String n1 = "10";
    String n2 = "2";

    sumBinaryNumbers.sumBinaryNumbersBasedOnPowersOfTwo(n1, n2);
  }

  @Test public void zeroPlusZeroEqualsZeroBasedOnPowersOfTwo() {
    String n1 = "0";
    String n2 = "0";

    String result = sumBinaryNumbers.sumBinaryNumbersBasedOnPowersOfTwo(n1, n2);

    assertEquals("0", result);
  }

  @Test public void zeroPlusTwoEqualsTwoBasedOnPowersOfTwo() {
    String n1 = "00";
    String n2 = "10";

    String result = sumBinaryNumbers.sumBinaryNumbersBasedOnPowersOfTwo(n1, n2);

    assertEquals("10", result);
  }

  @Test public void fivePlusSevenEqualsTwelveBasedOnPowersOfTwo() {
    String n1 = "101";
    String n2 = "111";

    String result = sumBinaryNumbers.sumBinaryNumbersBasedOnPowersOfTwo(n1, n2);

    assertEquals("1100", result);
  }
}
