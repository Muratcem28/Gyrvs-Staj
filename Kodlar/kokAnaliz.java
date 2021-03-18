package org.example;

import zemberek.morphology.TurkishMorphology;
import zemberek.morphology.analysis.SentenceAnalysis;
import zemberek.morphology.analysis.SingleAnalysis;
import zemberek.morphology.analysis.WordAnalysis;
import zemberek.tokenization.TurkishSentenceExtractor;

import java.util.ArrayList;
import java.util.List;

public class kokAnaliz {

    // if root is UNK, then return original string
    public static List<String> bolunmusCumle(List<String> paragraphList) {

        TurkishSentenceExtractor extractor = TurkishSentenceExtractor.DEFAULT;
        TurkishMorphology morphology = TurkishMorphology.createWithDefaults();
        List<String> sentenceList = extractor.fromParagraphs(paragraphList);
        List<String> yeniCumleler = new ArrayList<>();


        for (String sentence : sentenceList) {

            List<WordAnalysis> analyses = morphology.analyzeSentence(String.valueOf(sentence));
            SentenceAnalysis result = morphology.disambiguate(String.valueOf(sentence), analyses);
            List<SingleAnalysis> termList = result.bestAnalysis();
            List<String> rootList = new ArrayList<>();

            for (SingleAnalysis term : termList) {
                String root = term.getDictionaryItem().root;
                if (!root.equals("UNK"))
                    rootList.add(root);
                else {
                    rootList.add(term.getMorphemeDataList().get(0).surface);
                }

            }
            yeniCumleler.add(String.join(" ", rootList));

        }
        
       return yeniCumleler;
    }
}
