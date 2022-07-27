public class Solution {
  public boolean checkValidString(String s) {
    int sLen = s.length();
    int maxLeft = 0;
    int minLeft = 0;
    for (int pos = 0; pos < sLen; pos++) {
      char ch = s.charAt(pos);
      if (ch != ')') {
        maxLeft += 1;
      } else {
        maxLeft -= 1;
      }
      if (ch != '(') {
        minLeft -= 1;
      } else {
        minLeft += 1;
      }
      minLeft = Math.max(minLeft, 0);
      if (maxLeft < 0) {
        return false;
      }
    }
    return minLeft == 0;
  }
}
