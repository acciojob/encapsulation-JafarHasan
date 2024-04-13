package com.driver;

public class Main {
  public static void main(String[] args){
      RWOnly obj=new RWOnly();
      /*obj.no=120;
      System.out.println(obj.no);*/
      /* Error:  COMPILATION ERROR :
[INFO] -------------------------------------------------------------
Error:  /home/runner/work/encapsulation-JafarHasan/encapsulation-JafarHasan/src/main/java/com/driver/Main.java:[6,10] no has private access in com.driver.RWOnly
Error:  /home/runner/work/encapsulation-JafarHasan/encapsulation-JafarHasan/src/main/java/com/driver/Main.java:[7,29] no has private access in com.driver.RWOnly*/
      obj.setName("jafar");
      System.out.println(obj.getName());

  }
}