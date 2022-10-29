import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
//todo  : avoir une base d'objet lié au poeme fonctionnel : génération possible
// todo détailler les règles.
//todo : créer un serveur fonctionel avec une route pour poster des vers et une route pour rédiger un poeme.
    public static void main(String[] args){
        System.out.println("Hello World");

        //exemple de verification
        ArrayList<String> theme = new ArrayList<>();
        theme.add("lune");
        theme.add("nuit");
        theme.add("soir");
        theme.add("ciel");

        Feet feet1 = new Feet("La lune est belle", 5, "el", theme, "fin");

        feet1.showFeet();

        ResultSet results = Database.sendRequest("Select * FROM feet limit 2;");

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

        feet1.addFeet();
    }
}
