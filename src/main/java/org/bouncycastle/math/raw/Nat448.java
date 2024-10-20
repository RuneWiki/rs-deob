package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

public abstract class Nat448 {

    public static long[] create64() {
        return new long[7];
    }

    public static void copy64(long[] arg0, long[] arg1) {
        arg1[0] = arg0[0];
        arg1[1] = arg0[1];
        arg1[2] = arg0[2];
        arg1[3] = arg0[3];
        arg1[4] = arg0[4];
        arg1[5] = arg0[5];
        arg1[6] = arg0[6];
    }

    public static long[] createExt64() {
        return new long[14];
    }

    public static long[] fromBigInteger64(BigInteger arg0) {
        if (arg0.signum() < 0 || arg0.bitLength() > 448) {
            throw new IllegalArgumentException();
        }
        long[] var1 = create64();
        int var2 = 0;
        while (arg0.signum() != 0) {
            var1[var2++] = arg0.longValue();
            arg0 = arg0.shiftRight(64);
        }
        return var1;
    }

    public static boolean eq64(long[] arg0, long[] arg1) {
        for (int var2 = 6; var2 >= 0; var2--) {
            if (arg0[var2] != arg1[var2]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] arg0) {
        if (arg0[0] != 1L) {
            return false;
        }
        for (int var1 = 1; var1 < 7; var1++) {
            if (arg0[var1] != 0L) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] arg0) {
        for (int var1 = 0; var1 < 7; var1++) {
            if (arg0[var1] != 0L) {
                return false;
            }
        }
        return true;
    }

    public static BigInteger toBigInteger64(long[] arg0) {
        byte[] var1 = new byte[56];
        for (int var2 = 0; var2 < 7; var2++) {
            long var3 = arg0[var2];
            if (var3 != 0L) {
                Pack.longToBigEndian(var3, var1, 6 - var2 << 3);
            }
        }
        return new BigInteger(1, var1);
    }
}
