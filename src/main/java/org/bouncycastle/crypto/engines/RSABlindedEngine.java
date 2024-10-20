package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.util.BigIntegers;

public class RSABlindedEngine implements AsymmetricBlockCipher {

    public RSACoreEngine core = new RSACoreEngine();

    public static final BigInteger ONE = BigInteger.valueOf(1L);

    public SecureRandom random;

    public RSAKeyParameters key;

    public void init(boolean arg0, CipherParameters arg1) {
        this.core.init(arg0, arg1);
        if (arg1 instanceof ParametersWithRandom) {
            ParametersWithRandom var3 = (ParametersWithRandom) arg1;
            this.key = (RSAKeyParameters) var3.getParameters();
            this.random = var3.getRandom();
        } else {
            this.key = (RSAKeyParameters) arg1;
            this.random = new SecureRandom();
        }
    }

    public int getInputBlockSize() {
        return this.core.getInputBlockSize();
    }

    public byte[] processBlock(byte[] arg0, int arg1, int arg2) {
        if (this.key == null) {
            throw new IllegalStateException("RSA engine not initialised");
        }
        BigInteger var4 = this.core.convertInput(arg0, arg1, arg2);
        BigInteger var12;
        if (this.key instanceof RSAPrivateCrtKeyParameters) {
            RSAPrivateCrtKeyParameters var5 = (RSAPrivateCrtKeyParameters) this.key;
            BigInteger var6 = var5.getPublicExponent();
            if (var6 == null) {
                var12 = this.core.processBlock(var4);
            } else {
                BigInteger var7 = var5.getModulus();
                BigInteger var8 = BigIntegers.createRandomInRange(ONE, var7.subtract(ONE), this.random);
                BigInteger var9 = var8.modPow(var6, var7).multiply(var4).mod(var7);
                BigInteger var10 = this.core.processBlock(var9);
                BigInteger var11 = var8.modInverse(var7);
                var12 = var10.multiply(var11).mod(var7);
                if (!var4.equals(var12.modPow(var6, var7))) {
                    throw new IllegalStateException("RSA engine faulty decryption/signing detected");
                }
            }
        } else {
            var12 = this.core.processBlock(var4);
        }
        return this.core.convertOutput(var12);
    }

    public int getOutputBlockSize() {
        return this.core.getOutputBlockSize();
    }
}
