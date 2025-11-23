public class VigenereCipher
{
    public static void main (String [] args){
        System.out.println(encode("ATTACK at DAWN", "LEMON")); 
        System.out.println(decode("LXFOPVEFRNHR", "LEMON")); 
    }

    public static String encode (String plainText, String keyword){
        String str = ""; 

        for (int i = 0 ; i < plainText.length(); i++){
            if (Character.isLetter(plainText.charAt(i))){
                char letter = plainText.charAt(i);
                char key  = keyword.charAt(i % keyword.length());

                if (Character.isUpperCase(letter)){
                    int nkey = Character.toUpperCase(key) - 65;
                    char newLetter = (char)((letter - 65 + nkey + 26) % 26 + 65);
                    str += newLetter;
                }
                else {
                    int nkey = Character.toLowerCase(key) - 97;
                    char newLetter = (char)((letter - 97 + nkey + 26) % 26 + 97);
                    str += newLetter;
                }

            } else {
                str += plainText.charAt(i);
            }
        }

        return str; 
    }

    public static String decode (String cipheredText, String keyword){
        String str = ""; 

        for (int i = 0 ; i < cipheredText.length(); i++){
            if (Character.isLetter(cipheredText.charAt(i))){
                char letter = cipheredText.charAt(i);
                char key  = keyword.charAt(i % keyword.length());

                if (Character.isUpperCase(letter)){
                    int nkey = Character.toUpperCase(key) - 65;
                    char newLetter = (char)(((letter - 65 - nkey + 26) % 26) + 65);
                    str += newLetter;
                }
                else {
                    int nkey = Character.toLowerCase(key) - 97;
                    char newLetter = (char)(((letter - 97 - nkey + 26) % 26) + 97);
                    str += newLetter;
                }

            } else {
                str += cipheredText.charAt(i);
            }
        }

        return str; 
    }
}
