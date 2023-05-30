package decorator;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class IODemo {
    final static String CONTENT = "Hello, my MAN!";

    public static void main(String[] args) {
        testInputStream();
        testReader();
    }

    static void testInputStream() {
        try (InputStream input = new LowerCaseInputStream(
                new BufferedInputStream(
                        new ByteArrayInputStream(CONTENT.getBytes(StandardCharsets.UTF_8))))) {
            int ch;
            while ((ch = input.read()) >= 0) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void testReader() {
        try (Reader input = new LowerCaseReader(
                new StringReader(CONTENT))) {
            int ch;
            while ((ch = input.read()) >= 0) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class LowerCaseReader extends FilterReader {
    /**
     * Creates a new filtered reader.
     *
     * @param in a Reader object providing the underlying stream.
     * @throws NullPointerException if {@code in} is {@code null}
     */
    protected LowerCaseReader(Reader in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        return Character.toLowerCase((char) super.read());
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        int charsRead = super.read(cbuf, off, len);
        for (int i = off; i < off + len; i++) {
            cbuf[i] = Character.toLowerCase(cbuf[i]);
        }
        return charsRead;
    }
}

class LowerCaseInputStream extends FilterInputStream {

    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        return Character.toLowerCase((char) super.read());
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int bytesRead = super.read(b, off, len);
        for (int i = off; i < off + len; i++) {
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return bytesRead;
    }
}
