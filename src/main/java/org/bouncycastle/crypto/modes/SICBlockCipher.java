package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.SkippingStreamCipher;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

public class SICBlockCipher extends StreamBlockCipher implements SkippingStreamCipher {

    public final BlockCipher cipher;

    public final int blockSize;

    public byte[] IV;

    public byte[] counter;

    public byte[] counterOut;

    public int byteCount;

    public void incrementCounter(int arg0) {
        byte var2 = this.counter[this.counter.length - 1];
        this.counter[this.counter.length - 1] = (byte) (this.counter[this.counter.length - 1] + arg0);
        if (var2 != 0 && this.counter[this.counter.length - 1] < var2) {
            this.incrementCounterAt(1);
        }
    }

    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/SIC";
    }

    public SICBlockCipher(BlockCipher arg0) {
        super(arg0);
        this.cipher = arg0;
        this.blockSize = this.cipher.getBlockSize();
        this.IV = new byte[this.blockSize];
        this.counter = new byte[this.blockSize];
        this.counterOut = new byte[this.blockSize];
        this.byteCount = 0;
    }

    public int processBlock(byte[] arg0, int arg1, byte[] arg2, int arg3) throws DataLengthException, IllegalStateException {
        this.processBytes(arg0, arg1, this.blockSize, arg2, arg3);
        return this.blockSize;
    }

    public byte calculateByte(byte arg0) throws DataLengthException, IllegalStateException {
        if (this.byteCount == 0) {
            this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
            return (byte) (this.counterOut[this.byteCount++] ^ arg0);
        }
        byte var2 = (byte) (this.counterOut[this.byteCount++] ^ arg0);
        if (this.counter.length == this.byteCount) {
            this.byteCount = 0;
            this.incrementCounterAt(0);
            this.checkCounter();
        }
        return var2;
    }

    public void init(boolean arg0, CipherParameters arg1) throws IllegalArgumentException {
        if (!arg1 instanceof ParametersWithIV) {
            throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
        }
        ParametersWithIV var3 = (ParametersWithIV) arg1;
        this.IV = Arrays.clone(var3.getIV());
        if (this.blockSize < this.IV.length) {
            throw new IllegalArgumentException("CTR/SIC mode requires IV no greater than: " + this.blockSize + " bytes.");
        }
        int var4 = 8 > this.blockSize / 2 ? this.blockSize / 2 : 8;
        if (this.blockSize - this.IV.length > var4) {
            throw new IllegalArgumentException("CTR/SIC mode requires IV of at least: " + (this.blockSize - var4) + " bytes.");
        }
        if (var3.getParameters() != null) {
            this.cipher.init(true, var3.getParameters());
        }
        this.reset();
    }

    public void reset() {
        Arrays.fill((byte[]) this.counter, (byte) 0);
        System.arraycopy(this.IV, 0, this.counter, 0, this.IV.length);
        this.cipher.reset();
        this.byteCount = 0;
    }

    public void incrementCounterAt(int arg0) {
        int var2 = this.counter.length - arg0;
        do {
            var2--;
        } while (var2 >= 0 && ++this.counter[var2] == 0);
    }

    public void decrementCounterAt(int arg0) {
        int var2 = this.counter.length - arg0;
        do {
            var2--;
            if (var2 < 0) {
                return;
            }
        } while (--this.counter[var2] == -1);
    }

    public void adjustCounter(long arg0) {
        if (arg0 >= 0L) {
            long var3 = ((long) this.byteCount + arg0) / (long) this.blockSize;
            long var5 = var3;
            if (var3 > 255L) {
                for (int var7 = 5; var7 >= 1; var7--) {
                    long var8 = 0x1L << var7 * 8;
                    while (var5 >= var8) {
                        this.incrementCounterAt(var7);
                        var5 -= var8;
                    }
                }
            }
            this.incrementCounter((int) var5);
            this.byteCount = (int) ((long) this.byteCount + arg0 - (long) this.blockSize * var3);
            return;
        }
        long var10 = (-arg0 - (long) this.byteCount) / (long) this.blockSize;
        long var12 = var10;
        if (var10 > 255L) {
            for (int var14 = 5; var14 >= 1; var14--) {
                long var15 = 0x1L << var14 * 8;
                while (var12 > var15) {
                    this.decrementCounterAt(var14);
                    var12 -= var15;
                }
            }
        }
        for (long var17 = 0L; var17 != var12; var17++) {
            this.decrementCounterAt(0);
        }
        int var19 = (int) ((long) this.blockSize * var10 + (long) this.byteCount + arg0);
        if (var19 >= 0) {
            this.byteCount = 0;
        } else {
            this.decrementCounterAt(0);
            this.byteCount = this.blockSize + var19;
        }
    }

    public void checkCounter() {
        if (this.IV.length >= this.blockSize) {
            return;
        }
        for (int var1 = 0; var1 != this.IV.length; var1++) {
            if (this.counter[var1] != this.IV[var1]) {
                throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
            }
        }
    }

    public long skip(long arg0) {
        this.adjustCounter(arg0);
        this.checkCounter();
        this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
        return arg0;
    }

    public long seekTo(long arg0) {
        this.reset();
        return this.skip(arg0);
    }

    public long getPosition() {
        byte[] var1 = new byte[this.counter.length];
        System.arraycopy(this.counter, 0, var1, 0, var1.length);
        for (int var2 = var1.length - 1; var2 >= 1; var2--) {
            int var3;
            if (var2 < this.IV.length) {
                var3 = (var1[var2] & 0xFF) - (this.IV[var2] & 0xFF);
            } else {
                var3 = var1[var2] & 0xFF;
            }
            if (var3 < 0) {
                var1[var2 - 1]--;
                var3 += 256;
            }
            var1[var2] = (byte) var3;
        }
        return Pack.bigEndianToLong(var1, var1.length - 8) * (long) this.blockSize + (long) this.byteCount;
    }
}
