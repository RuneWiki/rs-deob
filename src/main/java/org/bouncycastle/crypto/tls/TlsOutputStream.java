package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.OutputStream;

public class TlsOutputStream extends OutputStream {

    public byte[] buf = new byte[1];

    public TlsProtocol handler;

    public void write(int arg0) throws IOException {
        this.buf[0] = (byte) arg0;
        this.write(this.buf, 0, 1);
    }

    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        this.handler.writeData(arg0, arg1, arg2);
    }

    public TlsOutputStream(TlsProtocol arg0) {
        this.handler = arg0;
    }

    public void close() throws IOException {
        this.handler.close();
    }

    public void flush() throws IOException {
        this.handler.flush();
    }
}
