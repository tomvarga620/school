public class Main {
    public static void main(String[] args) {
        Subject sjl = new SlovakLang();

        System.out.println(((SlovakLang) sjl).formatText("TOTO JE VETA"));

        Subject eng = new English();

        System.out.println(((English) eng).translateAnimal("papagáj"));

        Subject mat = new Math();

        System.out.println(((Math) mat).reverse(150));



    }
}
