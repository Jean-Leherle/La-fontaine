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

}
