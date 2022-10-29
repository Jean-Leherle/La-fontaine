import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Feet {
    private ArrayList<String> themes;
    private String phrase;
    private int syllable;
    private String rhyme;

    private String option;

    public Feet(String phrase, int syllable, String rhyme, ArrayList<String> themes, String option) {
        this.phrase=phrase;
        this.syllable=syllable;
        this.rhyme=rhyme;
        this.themes = themes;
        this.option=option;
    }
    public Feet(String phrase, int syllable, String rhyme, ArrayList<String> themes ) {
        this(phrase, syllable, rhyme, themes, "no option");
    }


        public String getPhrase() {
        return phrase;
    }

    public int getSyllable() {
        return syllable;
    }

    public String getRhyme() {
        return rhyme;
    }

    public ArrayList<String> getThemes() {
        return themes;
    }

    public void setThemes(ArrayList<String> themes) {
        this.themes = themes;
    }
    public void addTheme(String theme) {
        if (!themes.contains(theme)){
            this.themes.add(theme);
            System.out.println("theme : "+theme +" ajouter à la liste de ce vers");
        }
    }
    public void removeTheme(String theme) {
        if (themes.contains(theme)){
            this.themes.remove(theme);
        }
    }

    public String getOption() { return option;
    }

    public void showFeet(){
        System.out.println("phrase : "+this.getPhrase());
        System.out.println("number of syllable : "+this.getSyllable());
        System.out.println("rhyme : "+this.getRhyme());
        System.out.println("option : "+this.getOption());
        System.out.println("themes : " +this.getThemes());
    }
    public boolean addFeet(){
        assert (this.phrase !=null );
        assert (this.themes !=null);
        assert (this.rhyme != null);


        String request = "INSERT INTO feet (phrase, syllable, rhyme, option) VALUES ('"
                +this.phrase +"' , "
                +this.syllable +" , '"
                +this.rhyme +"' , '"
                +this.option +"') returning *;";
System.out.println(request);
        ResultSet result = Database.sendRequest(request);
        if(result==null){
            return false;
        };
        Integer id = null;
        try {
            result.next();
            id = result.getInt(1);
            System.out.println( result.getString(1));

            result.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return true;
    }



}
