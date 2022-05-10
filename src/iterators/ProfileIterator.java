package iterators;

public interface ProfileIterator {
  boolean hasNext();

  Profile getNext();

  void reset();
}