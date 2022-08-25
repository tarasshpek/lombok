package lombok.examples.k;

import lombok.Cleanup;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CleanupExample {
    public static void main(String[] args) throws IOException {
        @Cleanup InputStream in = new ByteArrayInputStream("abc".getBytes());
        @Cleanup ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] b = new byte[10000];
        while (true) {
            int r = in.read(b);
            if (r == -1) break;
            out.write(b, 0, r);
        }
        System.out.println(new String(out.toByteArray()));
    }
}
