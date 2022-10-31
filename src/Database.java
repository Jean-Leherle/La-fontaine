import java.sql.*;

public class Database {

    //test avec une bdd déjà existante
    private static final String url = "jdbc:postgresql://localhost:5432/la_fontaine";
    private static final String user = "la_fontaine";
    private static final String passwd = "jean"; //pour le moment en claire todo ajouter des variables d'environnement ou equivalent

            /*
                url = "jdbc:postgresql://localhost:5432/la_fontaine";
                String user = "la_fontaine";
                String passwd = "jean";
            */

    protected static ResultSet sendRequest(String request){
        //modèle et source d'information : https://www.jmdoudoux.fr/java/dej/chap-jdbc.htm
        try {
            //installation nécessaire au préalable
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver ok");


            Connection conn = DriverManager.getConnection(url, user, passwd);
            System.out.println("Connexion effective !");
            ResultSet results;
            try {
                Statement stmt = conn.createStatement();
                results = stmt.executeQuery(request);
                return results;
                /*
                ResultSetMetaData rsmd = results.getMetaData();
                int nbCols = rsmd.getColumnCount();
                results.close();

                while (results.next()) {
                for (int i = 1; i <= nbCols; i++)
                    System.out.println(results.getString(i) + " ");
                }
                */


            } catch (SQLException e) {
                e.printStackTrace();
                return null;
                //traitement de l'exception
            }


        }catch (Exception e){
            e.printStackTrace();
            return null;
        }


    }
}


