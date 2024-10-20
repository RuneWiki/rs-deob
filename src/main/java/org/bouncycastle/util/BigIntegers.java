package org.bouncycastle.util;

import java.math.BigInteger;
import java.security.SecureRandom;

public final class BigIntegers {

    public static final BigInteger ZERO = BigInteger.valueOf(0L);

    public static final int MAX_ITERATIONS = 1000;

    public static BigInteger fromUnsignedByteArray(byte[] arg0) {
        return new BigInteger(1, arg0);
    }

    public static byte[] asUnsignedByteArray(int arg0, BigInteger arg1) {
        byte[] var2 = arg1.toByteArray();
        if (var2.length == arg0) {
            return var2;
        }
        int var3 = var2[0] == 0 ? 1 : 0;
        int var4 = var2.length - var3;
        if (var4 > arg0) {
            throw new IllegalArgumentException("standard length exceeded for value");
        }
        byte[] var5 = new byte[arg0];
        System.arraycopy(var2, var3, var5, var5.length - var4, var4);
        return var5;
    }

    public static BigInteger createRandomInRange(BigInteger arg0, BigInteger arg1, SecureRandom arg2) {
        int var3 = arg0.compareTo(arg1);
        if (var3 >= 0) {
            if (var3 > 0) {
                throw new IllegalArgumentException("'min' may not be greater than 'max'");
            }
            return arg0;
        } else if (arg0.bitLength() > arg1.bitLength() / 2) {
            return createRandomInRange(ZERO, arg1.subtract(arg0), arg2).add(arg0);
        } else {
            for (int var4 = 0; var4 < 1000; var4++) {
                BigInteger var5 = new BigInteger(arg1.bitLength(), arg2);
                if (var5.compareTo(arg0) >= 0 && var5.compareTo(arg1) <= 0) {
                    return var5;
                }
            }
            return (new BigInteger(arg1.subtract(arg0).bitLength() - 1, arg2)).add(arg0);
        }
    }

    public static BigInteger fromUnsignedByteArray(byte[] arg0, int arg1, int arg2) {
        byte[] var3 = arg0;
        if (arg1 != 0 || arg0.length != arg2) {
            var3 = new byte[arg2];
            System.arraycopy(arg0, arg1, var3, 0, arg2);
        }
        return new BigInteger(1, var3);
    }

    public static byte[] asUnsignedByteArray(BigInteger arg0) {
        byte[] var1 = arg0.toByteArray();
        if (var1[0] == 0) {
            byte[] var2 = new byte[var1.length - 1];
            System.arraycopy(var1, 1, var2, 0, var2.length);
            return var2;
        } else {
            return var1;
        }
    }
}
