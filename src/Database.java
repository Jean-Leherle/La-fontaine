import java.sql.*;

public class Database {
    public static void main(String[] args){
        //modèle et source d'information : https://www.jmdoudoux.fr/java/dej/chap-jdbc.htm
        try {
            //instalation nécessaire au préalable
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver ok");



            //test avec une bdd déjà existante
            String url = "jdbc:postgresql://localhost:5432/zeng";
            String user = "zeng";
            String passwd = "zeng";

            Connection conn = DriverManager.getConnection(url, user, passwd);
            System.out.println("Connexion effective !");
            ResultSet resultats = null;
            String requete = "Select * FROM sheet;";
            try {
                Statement stmt = conn.createStatement();
                resultats = stmt.executeQuery(requete);

                ResultSetMetaData rsmd = resultats.getMetaData();
                int nbCols = rsmd.getColumnCount();
                while (resultats.next()) {
                    for (int i = 1; i <= nbCols; i++)
                        System.out.println(resultats.getString(i) + " ");
                }
                resultats.close();
            } catch (SQLException e) {
                //traitement de l'exception
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


