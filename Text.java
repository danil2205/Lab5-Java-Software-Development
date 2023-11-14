import java.util.ArrayList;

public class Text {
  private final ArrayList<Sentence> sentences = new ArrayList<>();

  /**
   * Constructs a Text object from the given text.
   *
   * @param text The input text.
   */
  public Text(StringBuilder text) {
    int start = 0;

    for (int end = 0; end < text.length(); end++) {
      char currentChar = text.charAt(end);

      if (currentChar == '.' || currentChar == '!' || currentChar == '?') {
        sentences.add(new Sentence(new StringBuilder(text.substring(start, end + 1))));
        start = end + 1;
      }
    }

    if (start < text.length()) {
      sentences.add(new Sentence(new StringBuilder(text.substring(start))));
    }
  }

  /**
   * Gets the sentences in the text.
   *
   * @return The Arraylist of sentences in the text.
   */
  public ArrayList<Sentence> getSentences() {
    return sentences;
  }
}
