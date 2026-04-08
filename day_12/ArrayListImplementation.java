import java.util.*;
public class ArrayListImplementation{
    public static void main(String[] args) {
      ArrayList<Integer> arrList = new ArrayList<>();
      arrList.add(null);
      arrList.add(10);
      arrList.add(20);
      System.out.println(arrList);
      // for changing a value in arrlist
      arrList.set(0,5);
      System.out.println(arrList);
      // two types of adds 1 is by position and value ... 2 is by value
      arrList.add(0,0);
      System.out.println(arrList);
      System.out.println(arrList.get(1));// getting elements from list using index
      System.out.println(arrList.contains(10));
      arrList.remove(2);// removing
      System.out.println(arrList);
      System.out.println(arrList.contains(10));//checking
      System.out.println(arrList.size());
      arrList.add(0);
      System.out.println(arrList.indexOf(0));//first index
      System.out.println(arrList.lastIndexOf(0));//last index
      System.out.println(arrList.isEmpty());
      arrList.clear();
      System.out.println(arrList);
      System.out.println(arrList.isEmpty());

    }}
