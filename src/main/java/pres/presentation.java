package pres;

import ext.DaoImpl2;
import metier.MetierImpl;

public class presentation {
    public static void main(String[] args){
        DaoImpl2 dao=new DaoImpl2();
        MetierImpl metier=new MetierImpl(dao);
        //metier.setDao(dao);
        System.out.println("Resultats="+metier.calcul());
    }

}
