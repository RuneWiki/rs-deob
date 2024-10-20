package org.bouncycastle.crypto.tls;

import java.io.InputStream;

public class ByteQueueInputStream extends InputStream {

    public ByteQueue buffer = new ByteQueue();

    public long skip(long arg0) {
        int var3 = Math.min((int) arg0, this.buffer.available());
        this.buffer.removeData(var3);
        return (long) var3;
    }

    public void addBytes(byte[] arg0) {
        this.buffer.addData(arg0, 0, arg0.length);
    }

    public int peek(byte[] arg0) {
        int var2 = Math.min(this.buffer.available(), arg0.length);
        this.buffer.read(arg0, 0, var2, 0);
        return var2;
    }

    public int read() {
        return this.buffer.available() == 0 ? -1 : this.buffer.removeData(1, 0)[0] & 0xFF;
    }

    public int read(byte[] arg0) {
        return this.read(arg0, 0, arg0.length);
    }

    public void close() {
    }

    public int available() {
        return this.buffer.available();
    }

    public int read(byte[] arg0, int arg1, int arg2) {
        int var4 = Math.min(this.buffer.available(), arg2);
        this.buffer.removeData(arg0, arg1, var4, 0);
        return var4;
    }
}
