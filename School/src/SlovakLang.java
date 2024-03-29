/*Tomáš Varga*/
public class SlovakLang extends Subject {

    public String formatText(String text){
        if(text == null || text.length() == 0){
            return text;
        }

        if(!text.contains(".")){

            String first = text.substring(0, 1).toUpperCase();
            String other = text.substring(1).toLowerCase();
            return first + other+".";
        }
        else
        {
            String first = text.substring(0, 1).toUpperCase();
            String other = text.substring(1).toLowerCase();
            return first + other;
        }
    }

    public char encryptLetter(char l){
        int ascii = (int) l;
        String binary = Integer.toBinaryString(ascii);
        System.out.println(binary);
        String lastD = binary.substring(binary.length() -4);
        String firstD = binary.substring(0,binary.length()-lastD.length());
        String rslt ="";
        for(int i = 0;i<lastD.length();i++){
            if(lastD.charAt(i)=='0'){
                rslt=rslt+"1";
            } else {
                rslt=rslt+"0";
            }
        }
        String finalString = firstD+rslt;
        int finalNum = Integer.parseInt(finalString, 2);
        System.out.println(finalNum);
        char ch = (char) finalNum;
        return ch;
    }

    public char encryptLetter2(char l){
        int ascii = (int) l;
        System.out.println(ascii);
        int rslt = (( l & 15 ) << 4) + (( l & 240) >> 4);
        char ch = (char) rslt;

        return ch;
    }

    public char encryptLetter3(char l){
        int ascii = (int) l;
        //System.out.println(ascii);
        int rslt  = ((ascii & 0b10101010) >> 1) | ((ascii & 0b01010101) << 1);
        System.out.println(rslt);
        char ch = (char) rslt;
        System.out.println(ch);
        return ch;
    }

    public String encryptWord(String text){
        String rsltWord = "";
        for(int i = 0;i<text.length();i++){
            rsltWord = rsltWord + encryptLetter(text.charAt(i));
        }
        System.out.println(rsltWord.length());
        return rsltWord;
    }

    public String encryptWord2(String text){
        String rsltWord = "";
        for(int i = 0;i<text.length();i++){
            rsltWord = rsltWord + encryptLetter2(text.charAt(i));
        }
        System.out.println(rsltWord.length());
        return rsltWord;
    }
}
