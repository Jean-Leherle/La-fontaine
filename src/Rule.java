import java.util.ArrayList;

public class Rule {
        private String model;

        private ArrayList<String> themes;
        private int verseNumber;

    public Rule (String model, ArrayList<String> themes, int verseNumber){
        //todo verifier que model correspond aux règles
        this.model = model; //format "A B B A"
        this.themes = themes;
        this.verseNumber = verseNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        //todo verifier que model correspond aux règles
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

    public String[][] formateModel(){
        /**
         * le but est de pouvoir traiter un model tel que "a b b,c b b" qui rendrait :
         *
         * rimeEn[a]
         * rimeEn[b]
         * rimeEn[b]
         *
         * rimeEn[c]
         * rimeEn[b]
         * rimeEn[b]
         *
         */
        String[] distiqueNotFormate = this.model.split(",");
        
        String[][] distiqueFormate = new String[distiqueNotFormate.length][];
        
        for (int i = 0; i<distiqueNotFormate.length; i++){
            distiqueFormate[i]=distiqueNotFormate[i].split(" ");
        }
        System.out.println(distiqueFormate);
        return distiqueFormate;
    }
    /**
     * Rule test = new Rule("A B B,C B B", theme, 1);
     *         for(String[] distique : test.formateModel() ){
     *             for(String value : distique){
     *                     System.out.print(value + "/");
     *             }
     *             System.out.println();
     *         }
     */
}
