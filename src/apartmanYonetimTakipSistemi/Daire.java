package apartmanYonetimTakipSistemi;

import java.util.ArrayList;
import java.util.Random;

/*-- Daire
    + ArrayList <Aidat> 12 item, her ay icin */

public class Daire {
    Random x = new Random();
    ArrayList<Integer> aidat = new ArrayList<Integer>();
    ArrayList<Object> aidatList = new ArrayList();
    int i=0;


    public void aidat() {

            for (i = 0; i < 12; i++) {
                aidat.add(x.nextInt(250));
            }
            aidatList.add(aidat);
            System.out.println(aidatList);

    }



}
