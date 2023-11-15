import java.util.ArrayList;
import java.util.Arrays;

public class Lab5 {
  private final Text text;
  private final ArrayList<Word> words;

  public Lab5(Text text, ArrayList<Word> words) {
    this.text = text;
    this.words = words;
  }

  /**
   * Counting words from given ArrayList with words in text
   *
   */
  public void countWords() {
    for (Word word : words) {
      int counter = 0;
      for (Sentence sentence : text.getSentences()) {
        for (Object element : sentence.getElements()) {
          if (element instanceof Word wordInSentence) {
            if (Word.equals(wordInSentence, word)) {
              counter++;
              break;
            }
          }
        }
      }
      System.out.printf("The word '%s' appeared in %d sentences\n", Word.wordToString(word), counter);
    }
  }

  public static void main(String[] args) {
    ArrayList<Word> words = new ArrayList<>(Arrays.asList(new Word(new StringBuilder("war")),
            new Word(new StringBuilder("Lorem")), new Word(new StringBuilder("has"))));
    Text text = new Text(new StringBuilder("Book war and peace is overrated russian bullshit. Dwarfs is different race. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."));
    System.out.println(text);
    Lab5 test = new Lab5(text, words);
    test.countWords();
  }
}
