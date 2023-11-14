import java.util.ArrayList;

public class Sentence {
  private final StringBuilder sentence;
  private final ArrayList<Object> elements = new ArrayList<>();

  /**
   * Constructs a Sentence object from the given sentence text.
   *
   * @param sentence The sentence text.
   */
  public Sentence(StringBuilder sentence) {
    this.sentence = sentence;
    splitWords();
  }

  /**
   * Split the words from sentence.
   *
   */
  public void splitWords() {
    StringBuilder word = new StringBuilder();
    boolean inWord = false;

    for (int i = 0; i < sentence.length() - 1; i++) {
      char currentChar = sentence.charAt(i);

      if (!Character.isLetterOrDigit(currentChar)) {
        elements.add(new Punctuation(currentChar));
      }

      if (Character.isWhitespace(currentChar)) {
        if (inWord) {
          elements.add(new Word(word));
          word = new StringBuilder();
          inWord = false;
        }
      } else {
        word.append(Character.toLowerCase(currentChar));
        inWord = true;
      }
    }

    if (inWord) {
      elements.add(word);
    }
  }

  /**
   * Gets the words and punctuations in the sentence.
   *
   * @return The ArrayList of elements in the sentence.
   */
  public ArrayList<Object> getElements() {
    return elements;
  }
}
