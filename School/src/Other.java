import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Other {

    public boolean price(String text){
        Pattern p = Pattern.compile("^\\d+((,|.)\\d{2})?(€?|\\s€|Eur|\\sEur|EUR|\\sEUR|eur|\\seur)?$");
        Matcher m = p.matcher(text);
        boolean rslt = m.matches();

        return rslt;
    }
}
