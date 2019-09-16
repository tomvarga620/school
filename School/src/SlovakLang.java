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
}
