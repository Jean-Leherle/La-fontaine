import java.util.ArrayList;

public class Main {
//todo  : avoir une base d'objet lié au poeme fonctionnel : génération possible
//todo : savoir lié une bdd à java
// todo : créer un serveur fonctionel avec une route pour poster des vers et une route pour rédiger un poeme.
    public static void main(String[] args){
        System.out.println("Hello World");

        //exemple de verification
        ArrayList<String> theme = new ArrayList<>();
        theme.add("lune");
        theme.add("nuit");
        theme.add("soir");
        theme.add("ciel");

        Feet feet1 = new Feet("La lune est belle", 5, "el", theme, "fin");

        System.out.println(feet1.getPhrase());
        System.out.println(feet1.getSyllable());
        System.out.println(feet1.getRhyme());
        System.out.println(feet1.getOption());
        System.out.println(feet1.getThemes());


    }
}
