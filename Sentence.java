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
   */
  public void splitWords() {
    StringBuilder word = new StringBuilder();
    boolean inWord = false;

    for (int i = 0; i < sentence.length() - 1; i++) {
      char currentChar = sentence.charAt(i);

      if (Character.isWhitespace(currentChar)) {
        if (inWord) {
          elements.add(new Word(word));
          word = new StringBuilder();
          inWord = false;
        }
      } else {
        word.append(currentChar);
        inWord = true;
      }
    }

    if (inWord) {
      elements.add(new Word(word));
    }

    elements.add(new Punctuation(sentence.charAt(sentence.length() - 1)));
  }

  /**
   * Gets the words and punctuations in the sentence.
   *
   * @return The ArrayList of elements in the sentence.
   */
  public ArrayList<Object> getElements() {
    return elements;
  }

  /**
   * Returns a string representation of the Sentence object.
   *
   * @return A string representation of the Sentence object.
   */
  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    int lastIndex = elements.size() - 1;

    for (int i = 0; i < elements.size(); i++) {
      if (i != lastIndex) result.append(" ");
      result.append(elements.get(i));
    }

    return result.toString().trim();
  }
}
