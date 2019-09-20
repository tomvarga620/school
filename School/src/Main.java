public class Main {
    public static void main(String[] args) {
        Subject sjl = new SlovakLang();

        System.out.println(((SlovakLang) sjl).formatText("TOTO JE VETA"));

        Subject eng = new English();

        System.out.println(((English) eng).translateAnimal("papagáj"));

        Subject mat = new Math();

        System.out.println(((Math) mat).reverse(150));

        System.out.println(((Math) mat).primeNumber(991));

        Other other = new Other();

        System.out.println(other.price("6.2 €"));

        Subject letter = new SlovakLang();

       // System.out.println(((SlovakLang) letter).encryptWord("K"));

        System.out.println(((SlovakLang) letter).encryptLetter2('E'));

        System.out.println(((SlovakLang) letter).encryptLetter3('Z'));

    }
}
