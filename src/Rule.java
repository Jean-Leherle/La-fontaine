import java.util.ArrayList;

public class Rule {
        private String model;

        private ArrayList<String> themes;
        private int verseNumber;

    public Rule (String model, ArrayList<String> themes, int verseNumber){
        //todo verifier que model correspond aux regles
        this.model = model;
        this.themes = themes;
        this.verseNumber = verseNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        //todo verifier que model correspond aux regles
        model = model;
    }


    public ArrayList<String> getThemes() {
        return themes;
    }

    public void setThemes(ArrayList<String> themes) {
        this.themes = themes;
    }

    public int getVerseNumber() {
        return verseNumber;
    }

    public void setVerseNumber(int verseNumber) {
        this.verseNumber = verseNumber;
    }
}
