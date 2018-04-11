import structure5.*;

public class CharacterIterator extends AbstractIterator<Character> {

protected String theString;
protected int current;

  public CharacterIterator(String str) {
    theString = str;
    reset();
  }

  public Character next() {
    return theString.charAt(current++);
  }

  public boolean hasNext() {
    return current < theString.length();
  }

  public void reset() {
    current = 0;
  }

  public Character get() {
    return theString.charAt(current);
  }
}
