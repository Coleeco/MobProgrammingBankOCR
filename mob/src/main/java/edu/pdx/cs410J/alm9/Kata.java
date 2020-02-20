package edu.pdx.cs410J.alm9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.security.AlgorithmConstraints;
import java.util.ArrayList;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {

    if (args.length == 0) {
      System.err.println("Missing command line arguments");
      System.exit(1);
    }

    String filename = args[0];

    ArrayList<String> lines = splitLines(filename);
    ArrayList<ArrayList<String>> numbers = splitIntegers(lines);
    System.exit(0);
  }

  public static ArrayList<String> splitLines(String fileName){
    ArrayList<String> arrayList = null;
    try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
      arrayList = new ArrayList<>();
      while(bufferedReader.ready()){
        arrayList.add(bufferedReader.readLine());
      }
    }catch (IOException e){
      e.printStackTrace();
    }
    return arrayList;
  }

  public static ArrayList<ArrayList<String>> splitIntegers(ArrayList<String> lines){
      if(lines == null)
        return null;
      ArrayList<ArrayList<String>> array = new ArrayList<>();
      for(String line:lines){
        array.add(splitLine(line));
      }
      return array;
  }
  public static ArrayList<String> splitLine(String line){
    ArrayList<String> row = new ArrayList<>();

    for(int i=0;i<27;i+=3){
      String a = line.substring(i,i+2);
      row.add(a);
    }

    return row;
  }

  public static ArrayList<String> joinColumns(ArrayList<ArrayList<String>> matrix) {
    return new ArrayList<>();
  }
}