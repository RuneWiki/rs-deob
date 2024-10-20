package org.bouncycastle.util.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TeeInputStream extends InputStream {

    public final InputStream input;

    public final OutputStream output;

    public TeeInputStream(InputStream arg0, OutputStream arg1) {
        this.input = arg0;
        this.output = arg1;
    }

    public int read(byte[] arg0) throws IOException {
        return this.read(arg0, 0, arg0.length);
    }

    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.input.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.output.write(arg0, arg1, var4);
        }
        return var4;
    }

    public int read() throws IOException {
        int var1 = this.input.read();
        if (var1 >= 0) {
            this.output.write(var1);
        }
        return var1;
    }

    public void close() throws IOException {
        this.input.close();
        this.output.close();
    }

    public OutputStream getOutputStream() {
        return this.output;
    }
}
