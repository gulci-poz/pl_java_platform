import java.io.IOException;
import java.io.Writer;

public class Ex01_streams_01 {
    public static void main(String[] args) {
        // stream - ordered sequence of data
        // provide a common I/O model
        // abstract the details of source or destination
        // stream types are unidirectional - to read from or write to
        // two categories: byte streams (binary data), text streams (Unicode characters)

        // base class to read from: byte - InputStream, text - Reader
        // both have int read() method, byte - reads 8bits, chars - reads 16bit (int is 32bits)

        // base class to write to: byte - OutputStream, text - Writer

        /*
        InputStream input = null;
        int intVal;

        try {
            // end-of-stream is -1
            while ((intVal = input.read()) >= 0) {
                byte byteVal = (byte) intVal;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        /*
        Reader input = null;
        int intVal;

        try {
            // end-of-stream is -1
            while ((intVal = input.read()) >= 0) {
                char charVal = (char) intVal;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        // we can read a buffer which is an array
        // there are overloaded methods int read(byte[] buff) and int read(char[] buff)
        // in this case int is a number of characters read

        /*
        InputStream input = null;
        int length;
        byte[] byteBuff = new byte[10];

        try {
            while ((length = input.read(byteBuff)) >= 0) {
                // we don't know if buffer is full, we can read the buffer depending on its length
                for (int i = 0; i < length; i++) {
                    byte byteVal = (byte) byteBuff[i];
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        /*
        Reader reader = null;
        int length;
        char[] charBuff = new char[10];

        try {
            while ((length = reader.read(charBuff)) >= 0) {
                // we don't know if buffer is full, we can read the buffer depending on its length
                for (int i = 0; i < length; i++) {
                    char charVal = (char) charBuff[i];
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        // byte streams - OutputStream, void write(int b), void write(byte[] buff)

        /*
        OutputStream output = null;

        byte byteVal = 100;
        try {
            output.write(byteVal);
        } catch (IOException e) {
            e.printStackTrace();
        }

        byte[] byteBuff = {0, 63, 127};
        try {
            output.write(byteBuff);
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        // text streams - Writer, void write(int ch), void write(char[] buff), void write(String str)

        /*
        Writer writer = null;

        char charVal = 'a';
        try {
            writer.write(charVal);
        } catch (IOException e) {
            e.printStackTrace();
        }

        char charBuff[] = {'a', 'b', 'c'};
        try {
            writer.write(charBuff);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String stringVal = "Hello World";
        try {
            writer.write(stringVal);
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
    }
}
