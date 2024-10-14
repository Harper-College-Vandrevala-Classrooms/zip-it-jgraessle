package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ZipperTest {
  Zipper<String> zipString = new Zipper();
  Zipper<Integer> zipInteger = new Zipper();
  Zipper<Double> zipDouble = new Zipper();
  List<String> stringList = List.of("one", "two", "three");
  List<String> stringList2 = List.of("four", "five", "six", "seven");
  List<String> stringListTest = List.of("one", "four", "two", "five", "three", "six", "seven");
  List<Integer> intList =  List.of(1, 2, 3);
  List<Integer> intList2 =  List.of(4, 5, 6, 7);
  List<Integer> intListTest =  List.of(1, 4, 2, 5, 3, 6, 7);
  List<Double> doubleList = List.of(1.0, 2.0, 3.0);
  List<Double> doubleList2 = List.of(4.0, 5.0, 6.0, 7.0);
  List<Double> doubleListTest =  List.of(1.0, 4.0, 2.0, 5.0, 3.0, 6.0, 7.0);
  @BeforeEach
  void setUp() {
  }

  @Test
  void ZipForIntegers() {
    assertEquals(intListTest, zipInteger.Zip(intList, intList2));
  }
  @Test
  void ZipForDoubles() {
    assertEquals(doubleListTest, zipDouble.Zip(doubleList, doubleList2));
  }
  @Test
  void ZipforStrings() {
    assertEquals(stringListTest, zipString.Zip(stringList, stringList2));
  }
}
