package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.ec.WNafUtil;
import org.bouncycastle.util.BigIntegers;

public class DHKeyGeneratorHelper {

    public static final DHKeyGeneratorHelper INSTANCE = new DHKeyGeneratorHelper();

    public static final BigInteger ONE = BigInteger.valueOf(1L);

    public static final BigInteger TWO = BigInteger.valueOf(2L);

    public BigInteger calculatePrivate(DHParameters arg0, SecureRandom arg1) {
        int var3 = arg0.getL();
        if (var3 != 0) {
            int var4 = var3 >>> 2;
            BigInteger var5;
            do {
                var5 = (new BigInteger(var3, arg1)).setBit(var3 - 1);
            } while (WNafUtil.getNafWeight(var5) < var4);
            return var5;
        }
        BigInteger var6 = TWO;
        int var7 = arg0.getM();
        if (var7 != 0) {
            var6 = ONE.shiftLeft(var7 - 1);
        }
        BigInteger var8 = arg0.getQ();
        if (var8 == null) {
            var8 = arg0.getP();
        }
        BigInteger var9 = var8.subtract(TWO);
        int var10 = var9.bitLength() >>> 2;
        BigInteger var11;
        do {
            var11 = BigIntegers.createRandomInRange(var6, var9, arg1);
        } while (WNafUtil.getNafWeight(var11) < var10);
        return var11;
    }

    public BigInteger calculatePublic(DHParameters arg0, BigInteger arg1) {
        return arg0.getG().modPow(arg1, arg0.getP());
    }
}
