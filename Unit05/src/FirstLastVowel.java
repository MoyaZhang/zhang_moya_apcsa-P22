//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Moya Zhang
//Date - 2/6/2019


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String vowels = "AEIOUaeiou";
	   int index = vowels.indexOf(a.substring(0, 1));
	   index += vowels.indexOf(a.substring(a.length()-1, a.length()));
	   if (index !=-2) {
		   return "yes";
	   }
	   return "no";
	}
}