
public class VigenereCipher
{
    public static void main (String [] args){
        System.out.println(encode ("ATTACKATDAWN", "LEMON") ); 
        System.out.println (decode("LXFOPVEFRNHR" , "LEMON")); 
    }

    public static String encode (String plainText, String keyword){
        String str = ""; 

        for ( int i = 0 ; i < plainText.length(); i ++ ){
            if (Character.isLetter(plainText.charAt(i))){
                if ( Character.isUpperCase( plainText.charAt(i))){
                    char letter = plainText.charAt(i);

                    char key  = keyword.charAt(i%keyword.length()); 

                    int nkey = key-65;
                    char newLetter = (char)((letter + 65 - nkey) % 26 + 65); 

                    str+= newLetter ;
                }else if ( Character.isLowerCase( plainText.charAt(i))){
                    char letter = plainText.charAt(i);

                    char key  = keyword.charAt(i%keyword.length()); 

                    int nkey = key-97;
                    char newLetter = (char)((letter + 97 - nkey) % 26 + 97); 

                    str+= newLetter ; 
                    
                }

            }else {
                str += plainText.charAt(i);
            }
        }
        return str; 
    }

    public static String decode (String cipheredText, String keyword){
        String str = ""; 

        for ( int i = 0 ; i < cipheredText.length(); i ++ ){

            char letter = cipheredText.charAt(i);
            char key  = keyword.charAt(i%keyword.length()); 
            int nkey = key- 65;
            char newLetter = (char)((letter + 65 - nkey) % 26 + 65); 

            str+= newLetter ;

        }
        return str; 
    }

}
