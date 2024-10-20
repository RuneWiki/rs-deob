package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.params.DSAKeyParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;

public class DSASigner implements DSA {

    public final DSAKCalculator kCalculator;

    public SecureRandom random;

    public DSAKeyParameters key;

    public boolean verifySignature(byte[] arg0, BigInteger arg1, BigInteger arg2) {
        DSAParameters var4 = this.key.getParameters();
        BigInteger var5 = var4.getQ();
        BigInteger var6 = this.calculateE(var5, arg0);
        BigInteger var7 = BigInteger.valueOf(0L);
        if (var7.compareTo(arg1) >= 0 || var5.compareTo(arg1) <= 0) {
            return false;
        } else if (var7.compareTo(arg2) < 0 && var5.compareTo(arg2) > 0) {
            BigInteger var8 = arg2.modInverse(var5);
            BigInteger var9 = var6.multiply(var8).mod(var5);
            BigInteger var10 = arg1.multiply(var8).mod(var5);
            BigInteger var11 = var4.getP();
            BigInteger var12 = var4.getG().modPow(var9, var11);
            BigInteger var13 = ((DSAPublicKeyParameters) this.key).getY().modPow(var10, var11);
            BigInteger var14 = var12.multiply(var13).mod(var11).mod(var5);
            return var14.equals(arg1);
        } else {
            return false;
        }
    }

    public DSASigner(DSAKCalculator arg0) {
        this.kCalculator = arg0;
    }

    public void init(boolean arg0, CipherParameters arg1) {
        SecureRandom var3 = null;
        if (!arg0) {
            this.key = (DSAPublicKeyParameters) arg1;
        } else if (arg1 instanceof ParametersWithRandom) {
            ParametersWithRandom var4 = (ParametersWithRandom) arg1;
            this.key = (DSAPrivateKeyParameters) var4.getParameters();
            var3 = var4.getRandom();
        } else {
            this.key = (DSAPrivateKeyParameters) arg1;
        }
        this.random = this.initSecureRandom(arg0 && !this.kCalculator.isDeterministic(), var3);
    }

    public BigInteger[] generateSignature(byte[] arg0) {
        DSAParameters var2 = this.key.getParameters();
        BigInteger var3 = var2.getQ();
        BigInteger var4 = this.calculateE(var3, arg0);
        BigInteger var5 = ((DSAPrivateKeyParameters) this.key).getX();
        if (this.kCalculator.isDeterministic()) {
            this.kCalculator.init(var3, var5, arg0);
        } else {
            this.kCalculator.init(var3, this.random);
        }
        BigInteger var6 = this.kCalculator.nextK();
        BigInteger var7 = var2.getG().modPow(var6.add(this.getRandomizer(var3, this.random)), var2.getP()).mod(var3);
        BigInteger var8 = var6.modInverse(var3).multiply(var4.add(var5.multiply(var7)));
        BigInteger var9 = var8.mod(var3);
        return new BigInteger[] { var7, var9 };
    }

    public BigInteger getRandomizer(BigInteger arg0, SecureRandom arg1) {
        byte var3 = 7;
        return (new BigInteger(var3, arg1 == null ? new SecureRandom() : arg1)).add(BigInteger.valueOf(128L)).multiply(arg0);
    }

    public BigInteger calculateE(BigInteger arg0, byte[] arg1) {
        if (arg0.bitLength() >= arg1.length * 8) {
            return new BigInteger(1, arg1);
        } else {
            byte[] var3 = new byte[arg0.bitLength() / 8];
            System.arraycopy(arg1, 0, var3, 0, var3.length);
            return new BigInteger(1, var3);
        }
    }

    public SecureRandom initSecureRandom(boolean arg0, SecureRandom arg1) {
        return arg0 ? (arg1 == null ? new SecureRandom() : arg1) : null;
    }

    public DSASigner() {
        this.kCalculator = new RandomDSAKCalculator();
    }
}
