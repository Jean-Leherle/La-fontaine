import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
//todo  : avoir une base d'objet lié au poeme fonctionnel : génération possible
// todo détailler les règles.
//todo : créer un serveur fonctionel avec une route pour poster des vers et une route pour rédiger un poeme.
    // todo traitement de texte pour doubler les apostrophes (caractére d'echapement)
    public static void main(String[] args){
        System.out.println("Hello World");

        //exemple de verification
        ArrayList<String> theme = new ArrayList<>();
        theme.add("transport");
        theme.add("objectif");
        theme.add("chemin");
        theme.add("moral");

        Feet feet1 = new Feet("Quand l''objectif remplace le chemin", 10, "min", theme);

        feet1.showFeet();

        ResultSet results = Database.sendRequest("Select * FROM feet;");

        ResultSetMetaData rsmd;
        try {
            assert results != null;
            rsmd = results.getMetaData();
            int nbCols = rsmd.getColumnCount();

            while(results.next()){
                for (int i = 1; i <= nbCols; i++)
                    System.out.println(results.getString(i) + " ");
            }
            results.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    Rule test = new Rule("A B B,C B B", theme, 1);
        for(String[] distique : test.formateModel() ){
            for(String value : distique){
                    System.out.print(value + "/");
            }
            System.out.println();
        }
    }
}
