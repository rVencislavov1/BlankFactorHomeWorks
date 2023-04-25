package LoopsAndConditions;
//Merge two strings
//Input: word1 = "abc", word2 = "pqr"
//Output: "apbqcr"
public class MergeTwoStrings {
   static void mergeTwoStrings() {
       String word1 ="abc";
       String word2 ="pqr";
       for (int i = 0; i < word1.length(); i++) {
           System.out.print(word1.charAt(i));
           System.out.print(word2.charAt(i));
       }
    }
    public static void main(String[] args) {

       mergeTwoStrings();



        }
    }

