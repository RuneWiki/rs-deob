package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.OutputStream;

public class ByteQueueOutputStream extends OutputStream {

    public ByteQueue buffer = new ByteQueue();

    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        this.buffer.addData(arg0, arg1, arg2);
    }

    public ByteQueue getBuffer() {
        return this.buffer;
    }

    public void write(int arg0) throws IOException {
        this.buffer.addData(new byte[] { (byte) arg0 }, 0, 1);
    }
}
