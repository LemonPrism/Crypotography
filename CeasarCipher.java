
public class CeasarCipher
{
    public static void main (String []args){

        System.out.println(encode ("bob went to BUY A GUN", 4)); 
        System.out.println(decode ("fsf airx xs FYC E KYR", 4)); 

    }

    public static String encode (String plainText, int key){
        String str = ""; 

        for (int i = 0; i< plainText.length();  i ++){
            if (Character.isLetter(plainText.charAt(i))){
                char letter  = plainText.charAt(i);

                if ( Character.isUpperCase( plainText.charAt(i))){

                    int n = letter - 65; 
                    n = (n + key)%26;
                    n += 65; 

                    char newLetter = (char)n; 

                    str += newLetter; 
                }else if ( Character.isLowerCase( plainText.charAt(i))){

                    int n = letter - 97; 
                    n = (n + key)%26;
                    n += 97; 

                    char newLetter = (char)n; 

                    str += newLetter;

                }
            }else {

                str+= plainText.charAt(i); 

            }

        }
        return str ; 
    }

    public static String decode( String cipherText , int key){
        String str = ""; 
        int j = 26-key;

        for (int i = 0; i< cipherText.length();  i ++){
            if (Character.isLetter(cipherText.charAt(i))){
                char letter  = cipherText.charAt(i);

                if ( Character.isUpperCase( cipherText.charAt(i))){

                    int n = letter - 65; 
                    n = (n + j)%26;
                    n += 65; 

                    char newLetter = (char)n; 

                    str += newLetter; 
                }else if ( Character.isLowerCase( cipherText.charAt(i))){

                    int n = letter - 97; 
                    n = (n + j)%26;
                    n += 97; 

                    char newLetter = (char)n; 

                    str += newLetter;

                }
            }else {

                str+= cipherText.charAt(i); 

            }

        }
        return str; 
    }
}

