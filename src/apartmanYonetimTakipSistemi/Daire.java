package apartmanYonetimTakipSistemi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/*-- Daire
    + ArrayList <Aidat> 12 item, her ay icin */

public class Daire {
    ArrayList<Aidat> aidat;
    Aidat aidatlar = new Aidat();

    public void aidatOlustur() {

        Aidat aidat1 = new Aidat(1, aidatlar.aidatRandom());
        Aidat aidat2 = new Aidat(2, aidatlar.aidatRandom());
        Aidat aidat3 = new Aidat(3, aidatlar.aidatRandom());
        Aidat aidat4 = new Aidat(4, aidatlar.aidatRandom());
        Aidat aidat5 = new Aidat(5, aidatlar.aidatRandom());
        Aidat aidat6 = new Aidat(6, aidatlar.aidatRandom());
        Aidat aidat7 = new Aidat(7, aidatlar.aidatRandom());
        Aidat aidat8 = new Aidat(8, aidatlar.aidatRandom());
        Aidat aidat9 = new Aidat(9, aidatlar.aidatRandom());
        Aidat aidat10 = new Aidat(10, aidatlar.aidatRandom());
        Aidat aidat11 = new Aidat(11, aidatlar.aidatRandom());
        Aidat aidat12 = new Aidat(12, aidatlar.aidatRandom());

        aidat = new ArrayList<>();
        aidat.add(aidat1);
        aidat.add(aidat2);
        aidat.add(aidat3);
        aidat.add(aidat4);
        aidat.add(aidat5);
        aidat.add(aidat6);
        aidat.add(aidat7);
        aidat.add(aidat8);
        aidat.add(aidat9);
        aidat.add(aidat10);
        aidat.add(aidat11);
        aidat.add(aidat12);

        Iterator itr = aidat.iterator();

        //traverse elements of ArrayList object
        while (itr.hasNext()) {
            Aidat st = (Aidat) itr.next();
            System.out.println(st.getAyNumarasi() + " " + st.getOdenenMiktar());


        }
    }
}