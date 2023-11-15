public class Punctuation {
  private final char character;

  /**
   * Constructs a Punctuation object with the specified character.
   *
   * @param character The punctuation character.
   */
  public Punctuation(char character) {
    this.character = character;
  }

  /**
   * Gets the punctuation character.
   *
   * @return The punctuation character.
   */
  public char getCharacter() {
    return character;
  }

  /**
   * Returns a string representation of the Punctuation object.
   *
   * @return A string representation of the Punctuation object.
   */
  @Override
  public String toString() {
    return String.valueOf(character);
  }
}
