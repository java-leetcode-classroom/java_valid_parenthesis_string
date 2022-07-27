import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private  Solution sol = new Solution();
  @Test
  void checkValidStringExample1() {
    assertTrue(sol.checkValidString("()"));
  }
  @Test
  void checkValidStringExample2() {
    assertTrue(sol.checkValidString("(*)"));
  }
  @Test
  void checkValidStringExample3() {
    assertTrue(sol.checkValidString("(*))"));
  }
}