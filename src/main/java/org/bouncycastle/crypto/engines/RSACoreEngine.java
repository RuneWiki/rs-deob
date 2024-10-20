package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;

public class RSACoreEngine {

    public RSAKeyParameters key;

    public boolean forEncryption;

    public int getOutputBlockSize() {
        int var1 = this.key.getModulus().bitLength();
        return this.forEncryption ? (var1 + 7) / 8 : (var1 + 7) / 8 - 1;
    }

    public void init(boolean arg0, CipherParameters arg1) {
        if (arg1 instanceof ParametersWithRandom) {
            ParametersWithRandom var3 = (ParametersWithRandom) arg1;
            this.key = (RSAKeyParameters) var3.getParameters();
        } else {
            this.key = (RSAKeyParameters) arg1;
        }
        this.forEncryption = arg0;
    }

    public int getInputBlockSize() {
        int var1 = this.key.getModulus().bitLength();
        return this.forEncryption ? (var1 + 7) / 8 - 1 : (var1 + 7) / 8;
    }

    public byte[] convertOutput(BigInteger arg0) {
        byte[] var2 = arg0.toByteArray();
        if (this.forEncryption) {
            if (var2[0] == 0 && var2.length > this.getOutputBlockSize()) {
                byte[] var3 = new byte[var2.length - 1];
                System.arraycopy(var2, 1, var3, 0, var3.length);
                return var3;
            }
            if (var2.length < this.getOutputBlockSize()) {
                byte[] var4 = new byte[this.getOutputBlockSize()];
                System.arraycopy(var2, 0, var4, var4.length - var2.length, var2.length);
                return var4;
            }
        } else if (var2[0] == 0) {
            byte[] var5 = new byte[var2.length - 1];
            System.arraycopy(var2, 1, var5, 0, var5.length);
            return var5;
        }
        return var2;
    }

    public BigInteger convertInput(byte[] arg0, int arg1, int arg2) {
        if (arg2 > this.getInputBlockSize() + 1) {
            throw new DataLengthException("input too large for RSA cipher.");
        } else if (arg2 == this.getInputBlockSize() + 1 && !this.forEncryption) {
            throw new DataLengthException("input too large for RSA cipher.");
        } else {
            byte[] var4;
            if (arg1 == 0 && arg0.length == arg2) {
                var4 = arg0;
            } else {
                var4 = new byte[arg2];
                System.arraycopy(arg0, arg1, var4, 0, arg2);
            }
            BigInteger var5 = new BigInteger(1, var4);
            if (var5.compareTo(this.key.getModulus()) >= 0) {
                throw new DataLengthException("input too large for RSA cipher.");
            }
            return var5;
        }
    }

    public BigInteger processBlock(BigInteger arg0) {
        if (!this.key instanceof RSAPrivateCrtKeyParameters) {
            return arg0.modPow(this.key.getExponent(), this.key.getModulus());
        }
        RSAPrivateCrtKeyParameters var2 = (RSAPrivateCrtKeyParameters) this.key;
        BigInteger var3 = var2.getP();
        BigInteger var4 = var2.getQ();
        BigInteger var5 = var2.getDP();
        BigInteger var6 = var2.getDQ();
        BigInteger var7 = var2.getQInv();
        BigInteger var8 = arg0.remainder(var3).modPow(var5, var3);
        BigInteger var9 = arg0.remainder(var4).modPow(var6, var4);
        BigInteger var10 = var8.subtract(var9);
        BigInteger var11 = var10.multiply(var7);
        BigInteger var12 = var11.mod(var3);
        BigInteger var13 = var12.multiply(var4);
        return var13.add(var9);
    }
}
