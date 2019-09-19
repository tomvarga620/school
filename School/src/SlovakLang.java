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

    public char cryptLetter(char l){
        int ascii = (int) l;
        String binary = Integer.toBinaryString(ascii);
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

    public String cryptWord(String text){
        String rsltWord = "";
        for(int i = 0;i<text.length();i++){
            rsltWord = rsltWord + cryptLetter(text.charAt(i));
        }
        System.out.println(rsltWord.length());
        return rsltWord;
    }
}
