
public class CesearCipher
{
    public static void main (String []args){

        System.out.println(encode ("BOB ", 4)); 
        System.out.println(decode ("FSF", 4)); 

    }

    public static String encode (String plainText, int key){
        String str = ""; 

        for (int i = 0; i< plainText.length();  i ++){

            char letter  = plainText.charAt(i);
            int n = letter - 65; 
            n = (n + key)%26;
            n += 65; 

            char newLetter = (char)n; 

            str += newLetter; 

        }
        return str ; 
    }

    public static String decode( String cipherText , int key){
        String str = ""; 
        int j = 26-key;

        for (int i = 0; i< cipherText.length();  i ++){

            char letter  = cipherText.charAt(i);
            int n = letter - 65; 
            n = (n + j)%26;
            n += 65; 

            char newLetter = (char)n; 

            str += newLetter; 

        }

        return str ; 
    }
}