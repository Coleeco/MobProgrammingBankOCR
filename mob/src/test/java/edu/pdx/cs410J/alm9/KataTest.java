package edu.pdx.cs410J.alm9;

import static edu.pdx.cs410J.alm9.Kata.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class KataTest
{

  @Test
  public void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  public void splitLinesTest(){
    ArrayList<String> lines = Kata.splitLines("/home/michelle/git/MobProgrammingBankOCR/mob/src/test/resources/Testfile.txt");
    assertThat(lines.size(), equalTo(3));
    System.out.println(lines.toString());
  }

  @Test
  public void splitIntegersTestReturnsExpectedSize() {
    ArrayList<String> lines = Kata.splitLines("/home/michelle/git/MobProgrammingBankOCR/mob/src/test/resources/Testfile.txt");
    ArrayList<ArrayList<String>> numbers = splitIntegers(lines);
    assertThat(numbers.size(), equalTo(3));
  }

  @Test
  public void splitLineRetunsExpectedArrayListSize() {
    String line = " _  _  _  _  _  _  _  _  _ ";
    ArrayList<String> expected = splitLine(line);
    assertEquals(expected.size(), 9);
  }
}
