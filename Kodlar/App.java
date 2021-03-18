package org.example;

import java.io.IOException;
import java.util.List;

public class App {

    public static void main(String[] main) throws IOException {
  //  konstraktır
        cumleAlımı cumleler = new cumleAlımı();
        kokAnaliz analiz = new kokAnaliz();
        dosyaYazdirma dosya = new dosyaYazdirma();


        List<String> paragraphList = cumleler.method("/home/cem/Desktop/Staj/deneme.txt");
        List<String> kokListesi = kokAnaliz.bolunmusCumle(paragraphList);
        dosyaYazdirma.yazdirma(kokListesi);


        System.out.println("bitti");
            //instead of console print, write these result into an output file
       // System.out.println(String.join(" ", kokListesi));

    }
}
