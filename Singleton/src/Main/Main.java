package Main;

public class Main {

    public static void main( String[] args )
    {

        Singleton idioma = Singleton.getInstance();

       String cat = idioma.getText("MessagesBundle_cat", "titol_pagina");
       String en = idioma.getText("MessagesBundle_en", "titol_pagina");
       String es =idioma.getText("MessagesBundle_es", "titol_pagina");

        System.out.println(cat);
        System.out.println(en);
        System.out.println(es);
    }
}
