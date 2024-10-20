package org.bouncycastle.crypto.tls;

public class ByteQueue {

    public int skipped;

    public int available;

    public byte[] databuf;

    public static final int DEFAULT_CAPACITY = 1024;

    public void removeData(int arg0) {
        if (arg0 > this.available) {
            throw new IllegalStateException("Cannot remove " + arg0 + " bytes, only got " + this.available);
        }
        this.available -= arg0;
        this.skipped += arg0;
    }

    public ByteQueue() {
        this(1024);
    }

    public ByteQueue(int arg0) {
        this.skipped = 0;
        this.available = 0;
        this.databuf = new byte[arg0];
    }

    public void read(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg0.length - arg1 < arg2) {
            throw new IllegalArgumentException("Buffer size of " + arg0.length + " is too small for a read of " + arg2 + " bytes");
        } else if (this.available - arg3 < arg2) {
            throw new IllegalStateException("Not enough data to read");
        } else {
            System.arraycopy(this.databuf, this.skipped + arg3, arg0, arg1, arg2);
        }
    }

    public void addData(byte[] arg0, int arg1, int arg2) {
        if (this.skipped + this.available + arg2 > this.databuf.length) {
            int var4 = nextTwoPow(this.available + arg2);
            if (var4 > this.databuf.length) {
                byte[] var5 = new byte[var4];
                System.arraycopy(this.databuf, this.skipped, var5, 0, this.available);
                this.databuf = var5;
            } else {
                System.arraycopy(this.databuf, this.skipped, this.databuf, 0, this.available);
            }
            this.skipped = 0;
        }
        System.arraycopy(arg0, arg1, this.databuf, this.skipped + this.available, arg2);
        this.available += arg2;
    }

    public static int nextTwoPow(int arg0) {
        int var1 = arg0 | arg0 >> 1;
        int var2 = var1 | var1 >> 2;
        int var3 = var2 | var2 >> 4;
        int var4 = var3 | var3 >> 8;
        int var5 = var4 | var4 >> 16;
        return var5 + 1;
    }

    public byte[] removeData(int arg0, int arg1) {
        byte[] var3 = new byte[arg0];
        this.removeData(var3, 0, arg0, arg1);
        return var3;
    }

    public int available() {
        return this.available;
    }

    /**
     * @deprecated
     */
    public int size() {
        return this.available;
    }

    public void removeData(byte[] arg0, int arg1, int arg2, int arg3) {
        this.read(arg0, arg1, arg2, arg3);
        this.removeData(arg2 + arg3);
    }
}
