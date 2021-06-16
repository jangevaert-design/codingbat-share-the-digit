package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatShareTheDigitTest {

  private static int[][] digitParams = {
      {12, 23},
      {12, 43},
      {12, 44},
      {23, 12},
      {23, 39},
      {23, 19},
      {30, 90},
      {30, 91},
      {55, 55},
      {55, 44}
  };

  private static boolean[] digitExpected = {true, false, false, true, true, false, true, false, true, false};


  @Test
  void digitTest() {
    for (int i = 0; i < digitParams.length; i++) {
      boolean actual = CodingBatShareTheDigit.shareDigit(digitParams[i][0], digitParams[i][1]);
      Assertions.assertEquals(actual, digitExpected[i]);
    }
  }
}