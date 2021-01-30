package apartmanYonetimTakipSistemi;
/*Kaygisizlar adli apartman yönetimi aylik aidat takip sistemi icin bir muhasabe programina ihtiyac duymaktadir.
Bu muhasebe programinda gerekli olan classlar asagida belirlenmistir.

Her daire icin:
   - Aylik odenmesi gereken miktar 250 Fr.
   - Aylik odedigi miktar random olarak belirlenecek.

Ornek:
1. Daire yil sonu bilancosu: -200 Fr.
2. Daire yil sonu bilancosu: +300 Fr.

Classlar:
-- Main
   + Maneger Class'ini yonetir*/

public class Main {

    public static void main(String[] args) {
        Daire daire = new Daire();

        daire.aidat();

    }
}
