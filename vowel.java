import java.util.Scanner;
class vowel
{
 public static void main(String [] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter any alphabet or any word..");
  char vowel;
  vowel = sc.next().charAt(0);
// 0 indicating that it will read only first character of the string 
//if i write 1 instead of 0 it will read second character
//meaning i can write any alphabet as well as any word it will read only that character mentioned in the indexing parenthesis
switch(vowel)
{

case 'A':
      System.out.println("It is a vowel.");
 break;

case 'a':
      System.out.println("It is a vowel.");
 break;

case 'E':
      System.out.println("It is a vowel.");
 break;

case 'e':
      System.out.println("It is a vowel.");
 break;

case 'I':
      System.out.println("It is a vowel.");
 break;

case 'i':
      System.out.println("It is a vowel.");
 break;

case 'O':
      System.out.println("It is a vowel.");
 break;

case 'o':
      System.out.println("It is a vowel.");
 break;

case 'U':
      System.out.println("It is a vowel.");
 break;

case 'u':
      System.out.println("It is a vowel.");
 break;

default: 
      System.out.println("It is a consonant.");

}
}
}
 