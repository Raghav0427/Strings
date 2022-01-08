package com.company.String;

public class IntoToString {
    public static void main(String[] args) {
//   1)   CharAt() Function
//        String name="Raghav";
//        String name2=new String("Sharma");
//        System.out.println(name2.charAt(3));

//      2) length
//        String name="Raghav";
//       String name2=new String("Sharma");
//        System.out.println(name2.length());

//        3) subString(int beginIndex)   & subString(int beginIndex,int endIndex)
//        String name="Raghav Sharma";
//        System.out.println(name.substring(3,8));

//        4)contains()
//        String name="Raghav";
//        System.out.println(name.contains("R"));

//        5)equals()
//        String name="Raghav";
//        String name2=new String("Raghav");
//        System.out.println(name.equals(name2));

//        6)concat()
//        String name="Raghav";
//        System.out.println(name.concat(" Sharma"));

//        7)replace()
//        String name="Raghav";
//        System.out.println(name.replace('a','j'));

//        8()
        String cars="Alto,Swift,Laborghini,BMW,Amaze,Santro";
        String allCars[]= cars.split(",");
        for(String car: allCars){
            System.out.println(car);
        }
    }
}
