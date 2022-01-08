package com.company.String;

import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Word");
        String word=sc.nextLine();
        System.out.println("Enter the Second Word");
        String word2= sc.nextLine();
        boolean isAnagram=true;

        int al[]=new int[256];
        int bl[]=new int[256];

        for(char c: word.toCharArray()){
            int index= (int) c;
            al[index]++;
        }
        for(char c: word2.toCharArray()){
            int index= (int) c;
            bl[index]++;
        }
        for(int i=0;i<256;i++){
            if(al[i]!=bl[i]){
                isAnagram=false;
                break;
            }
        }
        if(isAnagram){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
