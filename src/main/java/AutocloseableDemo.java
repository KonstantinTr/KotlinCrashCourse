public class AutocloseableDemo implements AutoCloseable {
  public void close() {
    System.out.println("deallocating resource");
  }
}
