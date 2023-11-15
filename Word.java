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
      letters.add(new Letter(letter));
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

  /**
   * Counting words from given ArrayList with words in text
   *
   */
  public static StringBuilder wordToString(Word word) {
    StringBuilder wordStringBuilder = new StringBuilder();
    for (Letter letter : word.getLetters()) {
      wordStringBuilder.append(letter.getCharacter());
    }
    return wordStringBuilder;
  }

  /**
   * Checks if word1 equals to word2
   *
   * @param word1 The word1 as a Word.
   * @param word2 The word2 as a Word.
   */
  public static boolean equals(Word word1, Word word2) {
    ArrayList<Letter> letters1 = word1.getLetters();
    ArrayList<Letter> letters2 = word2.getLetters();

    if (letters1.size() != letters2.size()) {
      return false;
    }

    for (int i = 0; i < letters1.size(); i++) {
      if (Character.toLowerCase(letters1.get(i).getCharacter()) != Character.toLowerCase(letters2.get(i).getCharacter())) {
        return false;
      }
    }

    return true;
  }

  /**
   * Returns a string representation of the Word object.
   *
   * @return A string representation of the Word object.
   */
  @Override
  public String toString() {
    StringBuilder wordStringBuilder = new StringBuilder();
    for (Letter letter : letters) {
      wordStringBuilder.append(letter);
    }
    return wordStringBuilder.toString();
  }
}
