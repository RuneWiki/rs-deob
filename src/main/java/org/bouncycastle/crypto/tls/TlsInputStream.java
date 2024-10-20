package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;

public class TlsInputStream extends InputStream {

    public byte[] buf = new byte[1];

    public TlsProtocol handler = null;

    public int available() throws IOException {
        return this.handler.applicationDataAvailable();
    }

    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.handler.readApplicationData(arg0, arg1, arg2);
    }

    public TlsInputStream(TlsProtocol arg0) {
        this.handler = arg0;
    }

    public int read() throws IOException {
        return this.read(this.buf) < 0 ? -1 : this.buf[0] & 0xFF;
    }

    public void close() throws IOException {
        this.handler.close();
    }
}
