package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Letter space = new Letter(' ');
        Letter exclamationMark = new Letter('!');
        Letter endOfLine = new Letter('\n');

        Word wordHello = createWord(createLettersList(List.of('H', 'e', 'l', 'l', 'o')));
        Word wordWorld = createWord(createLettersList(List.of('H', 'e', 'l', 'l', 'o')));

        Sentence sentenceHelloWorld = createSentence(List.of(wordHello, space, wordWorld, exclamationMark, endOfLine));

        sentenceHelloWorld.print();
    }

    public static Sentence createSentence(List<Glif> glifs) {
        Sentence sentence = new Sentence();
        glifs.forEach(glif -> {
            sentence.add(glif);
        });

        return sentence;
    }


    public static Word createWord(List<Letter> letters) {
        Word word = new Word();
        letters.forEach(letter -> {
            word.add(letter);
        });

        return word;
    }

    public static List<Letter> createLettersList(List<Character> characters) {
        List<Letter> letters = new ArrayList<>();
        characters.forEach(character -> {
            letters.add(new Letter(character));
        });

        return letters;
    }

}
