public class ceaserSubstition {

    public static String encryptCeaserCipher(String plainText, int offset)
    {
        if(offset >=26)
            offset = offset - 26;

        String encryptedText = "";
        char character;

        for(int i=0;i<plainText.length();i++)
        {
            character = plainText.charAt(i);

            if(character != ' ')
            {
                character += offset;

                if(character > 'Z')
                {
                    character -=26;
                }
            }
            encryptedText+=character;
        }

        return encryptedText;
    }
}
