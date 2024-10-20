package org.bouncycastle.crypto.engines;

import org.bouncycastle.util.Pack;

public class ChaCha7539Engine extends Salsa20Engine {

    public void retreatCounter() {
        if (this.engineState[12] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        int var10002 = this.engineState[12]--;
    }

    public String getAlgorithmName() {
        return "ChaCha7539-" + this.rounds;
    }

    public int getNonceSize() {
        return 12;
    }

    public void advanceCounter(long arg0) {
        int var3 = (int) (arg0 >>> 32);
        int var4 = (int) arg0;
        if (var3 > 0) {
            throw new IllegalStateException("attempt to increase counter past 2^32.");
        }
        int var5 = this.engineState[12];
        this.engineState[12] += var4;
        if (var5 != 0 && this.engineState[12] < var5) {
            throw new IllegalStateException("attempt to increase counter past 2^32.");
        }
    }

    public long getCounter() {
        return (long) this.engineState[12] & 0xFFFFFFFFL;
    }

    public void advanceCounter() {
        if (++this.engineState[12] == 0) {
            throw new IllegalStateException("attempt to increase counter past 2^32.");
        }
    }

    public void retreatCounter(long arg0) {
        int var3 = (int) (arg0 >>> 32);
        int var4 = (int) arg0;
        if (var3 != 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        } else if (((long) this.engineState[12] & 0xFFFFFFFFL) >= ((long) var4 & 0xFFFFFFFFL)) {
            this.engineState[12] -= var4;
        } else {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
    }

    public void resetCounter() {
        this.engineState[12] = 0;
    }

    public void setKey(byte[] arg0, byte[] arg1) {
        if (arg0 != null) {
            if (arg0.length != 32) {
                throw new IllegalArgumentException(this.getAlgorithmName() + " requires 256 bit key");
            }
            this.packTauOrSigma(arg0.length, this.engineState, 0);
            Pack.littleEndianToInt(arg0, 0, this.engineState, 4, 8);
        }
        Pack.littleEndianToInt(arg1, 0, this.engineState, 13, 3);
    }

    public void generateKeyStream(byte[] arg0) {
        ChaChaEngine.chachaCore(this.rounds, this.engineState, this.x);
        Pack.intToLittleEndian(this.x, arg0, 0);
    }
}
