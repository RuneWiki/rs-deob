package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

public abstract class GeneralDigest implements ExtendedDigest, Memoable {

    public final byte[] xBuf = new byte[4];

    public int xBufOff;

    public long byteCount;

    public static final int BYTE_LENGTH = 64;

    public void update(byte arg0) {
        this.xBuf[this.xBufOff++] = arg0;
        if (this.xBuf.length == this.xBufOff) {
            this.processWord(this.xBuf, 0);
            this.xBufOff = 0;
        }
        this.byteCount++;
    }

    public GeneralDigest(GeneralDigest arg0) {
        this.copyIn(arg0);
    }

    public int getByteLength() {
        return 64;
    }

    public void copyIn(GeneralDigest arg0) {
        System.arraycopy(arg0.xBuf, 0, this.xBuf, 0, arg0.xBuf.length);
        this.xBufOff = arg0.xBufOff;
        this.byteCount = arg0.byteCount;
    }

    public abstract void processWord(byte[] arg0, int arg1);

    public void update(byte[] arg0, int arg1, int arg2) {
        int var4 = Math.max(0, arg2);
        int var5 = 0;
        if (this.xBufOff != 0) {
            while (var5 < var4) {
                this.xBuf[this.xBufOff++] = arg0[arg1 + var5++];
                if (this.xBufOff == 4) {
                    this.processWord(this.xBuf, 0);
                    this.xBufOff = 0;
                    break;
                }
            }
        }
        int var6 = (var4 - var5 & 0xFFFFFFFC) + var5;
        while (var5 < var6) {
            this.processWord(arg0, arg1 + var5);
            var5 += 4;
        }
        while (var5 < var4) {
            this.xBuf[this.xBufOff++] = arg0[arg1 + var5++];
        }
        this.byteCount += (long) var4;
    }

    public void finish() {
        long var1 = this.byteCount << 3;
        this.update((byte) -128);
        while (this.xBufOff != 0) {
            this.update((byte) 0);
        }
        this.processLength(var1);
        this.processBlock();
    }

    public void reset() {
        this.byteCount = 0L;
        this.xBufOff = 0;
        for (int var1 = 0; var1 < this.xBuf.length; var1++) {
            this.xBuf[var1] = 0;
        }
    }

    public GeneralDigest(byte[] arg0) {
        System.arraycopy(arg0, 0, this.xBuf, 0, this.xBuf.length);
        this.xBufOff = Pack.bigEndianToInt(arg0, 4);
        this.byteCount = Pack.bigEndianToLong(arg0, 8);
    }

    public abstract void processLength(long arg0);

    public GeneralDigest() {
        this.xBufOff = 0;
    }

    public void populateState(byte[] arg0) {
        System.arraycopy(this.xBuf, 0, arg0, 0, this.xBufOff);
        Pack.intToBigEndian(this.xBufOff, arg0, 4);
        Pack.longToBigEndian(this.byteCount, arg0, 8);
    }

    public abstract void processBlock();
}
