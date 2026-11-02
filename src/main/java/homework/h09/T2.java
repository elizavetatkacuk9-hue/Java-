package homework.h09;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
class T2 {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int max = 0;
    for (int c : candies) {
      if (c > max) {
        max = c;
      }
    }

    List<Boolean> result = new ArrayList<>();
    for (int c : candies) {
      result.add(c + extraCandies >= max);
    }
    return result;
  }
}
