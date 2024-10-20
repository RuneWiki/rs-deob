package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.MaxBytesExceededException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.SkippingStreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.Strings;

public class Salsa20Engine implements SkippingStreamCipher {

    public int index;

    public int[] engineState;

    public int[] x;

    public byte[] keyStream;

    public boolean initialised;

    public int rounds;

    public static final int[] TAU_SIGMA = Pack.littleEndianToInt(Strings.toByteArray("expand 16-byte kexpand 32-byte k"), 0, 8);

    /**
     * @deprecated
     */
    public static final byte[] sigma = Strings.toByteArray("expand 32-byte k");

    /**
     * @deprecated
     */
    public static final byte[] tau = Strings.toByteArray("expand 16-byte k");

    public static final int DEFAULT_ROUNDS = 20;

    public static final int STATE_SIZE = 16;

    public int cW0;

    public int cW1;

    public int cW2;

    public void retreatCounter() {
        if (this.engineState[8] == 0 && this.engineState[9] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        } else if (--this.engineState[8] == -1) {
            int var10002 = this.engineState[9]--;
        }
    }

    public byte returnByte(byte arg0) {
        if (this.limitExceeded()) {
            throw new MaxBytesExceededException("2^70 byte limit per IV; Change IV");
        }
        byte var2 = (byte) (this.keyStream[this.index] ^ arg0);
        this.index = this.index + 1 & 0x3F;
        if (this.index == 0) {
            this.advanceCounter();
            this.generateKeyStream(this.keyStream);
        }
        return var2;
    }

    public static void salsaCore(int arg0, int[] arg1, int[] arg2) {
        if (arg1.length != 16) {
            throw new IllegalArgumentException();
        } else if (arg2.length != 16) {
            throw new IllegalArgumentException();
        } else if (arg0 % 2 == 0) {
            int var3 = arg1[0];
            int var4 = arg1[1];
            int var5 = arg1[2];
            int var6 = arg1[3];
            int var7 = arg1[4];
            int var8 = arg1[5];
            int var9 = arg1[6];
            int var10 = arg1[7];
            int var11 = arg1[8];
            int var12 = arg1[9];
            int var13 = arg1[10];
            int var14 = arg1[11];
            int var15 = arg1[12];
            int var16 = arg1[13];
            int var17 = arg1[14];
            int var18 = arg1[15];
            for (int var19 = arg0; var19 > 0; var19 -= 2) {
                int var20 = var7 ^ rotl(var3 + var15, 7);
                int var21 = var11 ^ rotl(var3 + var20, 9);
                int var22 = var15 ^ rotl(var20 + var21, 13);
                int var23 = var3 ^ rotl(var21 + var22, 18);
                int var24 = var12 ^ rotl(var4 + var8, 7);
                int var25 = var16 ^ rotl(var8 + var24, 9);
                int var26 = var4 ^ rotl(var24 + var25, 13);
                int var27 = var8 ^ rotl(var25 + var26, 18);
                int var28 = var17 ^ rotl(var9 + var13, 7);
                int var29 = var5 ^ rotl(var13 + var28, 9);
                int var30 = var9 ^ rotl(var28 + var29, 13);
                int var31 = var13 ^ rotl(var29 + var30, 18);
                int var32 = var6 ^ rotl(var14 + var18, 7);
                int var33 = var10 ^ rotl(var18 + var32, 9);
                int var34 = var14 ^ rotl(var32 + var33, 13);
                int var35 = var18 ^ rotl(var33 + var34, 18);
                var4 = var26 ^ rotl(var23 + var32, 7);
                var5 = var29 ^ rotl(var4 + var23, 9);
                var6 = var32 ^ rotl(var4 + var5, 13);
                var3 = var23 ^ rotl(var5 + var6, 18);
                var9 = var30 ^ rotl(var20 + var27, 7);
                var10 = var33 ^ rotl(var9 + var27, 9);
                var7 = var20 ^ rotl(var9 + var10, 13);
                var8 = var27 ^ rotl(var7 + var10, 18);
                var14 = var34 ^ rotl(var24 + var31, 7);
                var11 = var21 ^ rotl(var14 + var31, 9);
                var12 = var24 ^ rotl(var11 + var14, 13);
                var13 = var31 ^ rotl(var11 + var12, 18);
                var15 = var22 ^ rotl(var28 + var35, 7);
                var16 = var25 ^ rotl(var15 + var35, 9);
                var17 = var28 ^ rotl(var15 + var16, 13);
                var18 = var35 ^ rotl(var16 + var17, 18);
            }
            arg2[0] = arg1[0] + var3;
            arg2[1] = arg1[1] + var4;
            arg2[2] = arg1[2] + var5;
            arg2[3] = arg1[3] + var6;
            arg2[4] = arg1[4] + var7;
            arg2[5] = arg1[5] + var8;
            arg2[6] = arg1[6] + var9;
            arg2[7] = arg1[7] + var10;
            arg2[8] = arg1[8] + var11;
            arg2[9] = arg1[9] + var12;
            arg2[10] = arg1[10] + var13;
            arg2[11] = arg1[11] + var14;
            arg2[12] = arg1[12] + var15;
            arg2[13] = arg1[13] + var16;
            arg2[14] = arg1[14] + var17;
            arg2[15] = arg1[15] + var18;
        } else {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
    }

    public void init(boolean arg0, CipherParameters arg1) {
        if (!(arg1 instanceof ParametersWithIV)) {
            throw new IllegalArgumentException(this.getAlgorithmName() + " Init parameters must include an IV");
        }
        ParametersWithIV var3 = (ParametersWithIV) arg1;
        byte[] var4 = var3.getIV();
        if (var4 == null || var4.length != this.getNonceSize()) {
            throw new IllegalArgumentException(this.getAlgorithmName() + " requires exactly " + this.getNonceSize() + " bytes of IV");
        }
        CipherParameters var5 = var3.getParameters();
        if (var5 == null) {
            if (!this.initialised) {
                throw new IllegalStateException(this.getAlgorithmName() + " KeyParameter can not be null for first initialisation");
            }
            this.setKey((byte[]) null, var4);
        } else if ((var5 instanceof KeyParameter)) {
            this.setKey(((KeyParameter) var5).getKey(), var4);
        } else {
            throw new IllegalArgumentException(this.getAlgorithmName() + " Init parameters must contain a KeyParameter (or null for re-init)");
        }
        this.reset();
        this.initialised = true;
    }

    public void advanceCounter(long arg0) {
        int var3 = (int) (arg0 >>> 32);
        int var4 = (int) arg0;
        if (var3 > 0) {
            this.engineState[9] += var3;
        }
        int var5 = this.engineState[8];
        this.engineState[8] += var4;
        if (var5 != 0 && this.engineState[8] < var5) {
            int var10002 = this.engineState[9]++;
        }
    }

    public String getAlgorithmName() {
        String var1 = "Salsa20";
        if (this.rounds != 20) {
            var1 = var1 + "/" + this.rounds;
        }
        return var1;
    }

    public int getNonceSize() {
        return 8;
    }

    public Salsa20Engine(int arg0) {
        this.index = 0;
        this.engineState = new int[16];
        this.x = new int[16];
        this.keyStream = new byte[64];
        this.initialised = false;
        if (arg0 <= 0 || (arg0 & 0x1) != 0) {
            throw new IllegalArgumentException("'rounds' must be a positive, even number");
        }
        this.rounds = arg0;
    }

    public void advanceCounter() {
        if (++this.engineState[8] == 0) {
            int var10002 = this.engineState[9]++;
        }
    }

    public void retreatCounter(long arg0) {
        int var3 = (int) (arg0 >>> 32);
        int var4 = (int) arg0;
        if (var3 != 0) {
            if (((long) this.engineState[9] & 0xFFFFFFFFL) < ((long) var3 & 0xFFFFFFFFL)) {
                throw new IllegalStateException("attempt to reduce counter past zero.");
            }
            this.engineState[9] -= var3;
        }
        if (((long) this.engineState[8] & 0xFFFFFFFFL) >= ((long) var4 & 0xFFFFFFFFL)) {
            this.engineState[8] -= var4;
        } else if (this.engineState[9] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        } else {
            int var10002 = this.engineState[9]--;
            this.engineState[8] -= var4;
        }
    }

    public long seekTo(long arg0) {
        this.reset();
        return this.skip(arg0);
    }

    public int processBytes(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        if (!this.initialised) {
            throw new IllegalStateException(this.getAlgorithmName() + " not initialised");
        } else if (arg1 + arg2 > arg0.length) {
            throw new DataLengthException("input buffer too short");
        } else if (arg2 + arg4 > arg3.length) {
            throw new OutputLengthException("output buffer too short");
        } else if (this.limitExceeded(arg2)) {
            throw new MaxBytesExceededException("2^70 byte limit per IV would be exceeded; Change IV");
        } else {
            for (int var6 = 0; var6 < arg2; var6++) {
                arg3[arg4 + var6] = (byte) (this.keyStream[this.index] ^ arg0[arg1 + var6]);
                this.index = this.index + 1 & 0x3F;
                if (this.index == 0) {
                    this.advanceCounter();
                    this.generateKeyStream(this.keyStream);
                }
            }
            return arg2;
        }
    }

    public long skip(long arg0) {
        if (arg0 >= 0L) {
            long var3 = arg0;
            if (arg0 >= 64L) {
                long var5 = arg0 / 64L;
                this.advanceCounter(var5);
                var3 = arg0 - var5 * 64L;
            }
            int var7 = this.index;
            this.index = (int) var3 + this.index & 0x3F;
            if (this.index < var7) {
                this.advanceCounter();
            }
        } else {
            long var8 = -arg0;
            if (var8 >= 64L) {
                long var10 = var8 / 64L;
                this.retreatCounter(var10);
                var8 -= var10 * 64L;
            }
            for (long var12 = 0L; var12 < var8; var12++) {
                if (this.index == 0) {
                    this.retreatCounter();
                }
                this.index = this.index - 1 & 0x3F;
            }
        }
        this.generateKeyStream(this.keyStream);
        return arg0;
    }

    public void packTauOrSigma(int arg0, int[] arg1, int arg2) {
        int var4 = (arg0 - 16) / 4;
        arg1[arg2] = TAU_SIGMA[var4];
        arg1[arg2 + 1] = TAU_SIGMA[var4 + 1];
        arg1[arg2 + 2] = TAU_SIGMA[var4 + 2];
        arg1[arg2 + 3] = TAU_SIGMA[var4 + 3];
    }

    public long getPosition() {
        return this.getCounter() * 64L + (long) this.index;
    }

    public void reset() {
        this.index = 0;
        this.resetLimitCounter();
        this.resetCounter();
        this.generateKeyStream(this.keyStream);
    }

    public long getCounter() {
        return (long) this.engineState[9] << 32 | (long) this.engineState[8] & 0xFFFFFFFFL;
    }

    public void resetCounter() {
        this.engineState[8] = this.engineState[9] = 0;
    }

    public void setKey(byte[] arg0, byte[] arg1) {
        if (arg0 != null) {
            if (arg0.length != 16 && arg0.length != 32) {
                throw new IllegalArgumentException(this.getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            int var3 = (arg0.length - 16) / 4;
            this.engineState[0] = TAU_SIGMA[var3];
            this.engineState[5] = TAU_SIGMA[var3 + 1];
            this.engineState[10] = TAU_SIGMA[var3 + 2];
            this.engineState[15] = TAU_SIGMA[var3 + 3];
            Pack.littleEndianToInt(arg0, 0, this.engineState, 1, 4);
            Pack.littleEndianToInt(arg0, arg0.length - 16, this.engineState, 11, 4);
        }
        Pack.littleEndianToInt(arg1, 0, this.engineState, 6, 2);
    }

    public void generateKeyStream(byte[] arg0) {
        salsaCore(this.rounds, this.engineState, this.x);
        Pack.intToLittleEndian(this.x, arg0, 0);
    }

    public boolean limitExceeded() {
        if (++this.cW0 == 0 && ++this.cW1 == 0) {
            return (++this.cW2 & 0x20) != 0;
        } else {
            return false;
        }
    }

    public static int rotl(int arg0, int arg1) {
        return arg0 << arg1 | arg0 >>> -arg1;
    }

    public void resetLimitCounter() {
        this.cW0 = 0;
        this.cW1 = 0;
        this.cW2 = 0;
    }

    public Salsa20Engine() {
        this(20);
    }

    public boolean limitExceeded(int arg0) {
        this.cW0 += arg0;
        if (this.cW0 < arg0 && this.cW0 >= 0 && ++this.cW1 == 0) {
            return (++this.cW2 & 0x20) != 0;
        } else {
            return false;
        }
    }
}
