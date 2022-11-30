package com.mindtree.FSE;
public class Mainc {



   public Mainc() {
        System.out.println("In Default constructor");
    }

   public Mainc(String str1) {
        this();
        System.out.println("2nd ");
   }

   public Mainc(String str1, String str2) {
        this(str1);
        System.out.println("3rd ");
    }

   public Mainc(String str1, String str2, String str3) {
        this(str1, str2);
        System.out.println("4th constructor");
        
    }

   public static void main(String[] args) {
        Mainc mainc = new Mainc("str1", "str2", "str3");



   }

}