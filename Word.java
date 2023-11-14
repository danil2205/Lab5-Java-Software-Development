import java.util.ArrayList;

public class Word {
  private final ArrayList<Letter> letters = new ArrayList<>();

  /**
   * Constructs a Word object from the given word string.
   *
   * @param word The word as a StringBuilder.
   */
  public Word(StringBuilder word) {
    char[] charLetters = new char[word.length()];
    word.getChars(0, word.length(), charLetters, 0);

    for (char letter : charLetters) {
      letters.add(new Letter(Character.toLowerCase(letter)));
    }
  }

  /**
   * Gets the letters in the word.
   *
   * @return The list of letters in the word.
   */
  public ArrayList<Letter> getLetters() {
    return letters;
  }
}
