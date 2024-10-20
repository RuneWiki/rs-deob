package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

public class HMacDSAKCalculator implements DSAKCalculator {

    public static final BigInteger ZERO = BigInteger.valueOf(0L);

    public final HMac hMac;

    public final byte[] V;

    public final byte[] K;

    public BigInteger n;

    public boolean isDeterministic() {
        return true;
    }

    public void init(BigInteger arg0, SecureRandom arg1) {
        throw new IllegalStateException("Operation not supported");
    }

    public void init(BigInteger arg0, BigInteger arg1, byte[] arg2) {
        this.n = arg0;
        Arrays.fill((byte[]) this.V, (byte) 1);
        Arrays.fill((byte[]) this.K, (byte) 0);
        byte[] var4 = new byte[(arg0.bitLength() + 7) / 8];
        byte[] var5 = BigIntegers.asUnsignedByteArray(arg1);
        System.arraycopy(var5, 0, var4, var4.length - var5.length, var5.length);
        byte[] var6 = new byte[(arg0.bitLength() + 7) / 8];
        BigInteger var7 = this.bitsToInt(arg2);
        if (var7.compareTo(arg0) >= 0) {
            var7 = var7.subtract(arg0);
        }
        byte[] var8 = BigIntegers.asUnsignedByteArray(var7);
        System.arraycopy(var8, 0, var6, var6.length - var8.length, var8.length);
        this.hMac.init(new KeyParameter(this.K));
        this.hMac.update(this.V, 0, this.V.length);
        this.hMac.update((byte) 0);
        this.hMac.update(var4, 0, var4.length);
        this.hMac.update(var6, 0, var6.length);
        this.hMac.doFinal(this.K, 0);
        this.hMac.init(new KeyParameter(this.K));
        this.hMac.update(this.V, 0, this.V.length);
        this.hMac.doFinal(this.V, 0);
        this.hMac.update(this.V, 0, this.V.length);
        this.hMac.update((byte) 1);
        this.hMac.update(var4, 0, var4.length);
        this.hMac.update(var6, 0, var6.length);
        this.hMac.doFinal(this.K, 0);
        this.hMac.init(new KeyParameter(this.K));
        this.hMac.update(this.V, 0, this.V.length);
        this.hMac.doFinal(this.V, 0);
    }

    public HMacDSAKCalculator(Digest arg0) {
        this.hMac = new HMac(arg0);
        this.V = new byte[this.hMac.getMacSize()];
        this.K = new byte[this.hMac.getMacSize()];
    }

    public BigInteger bitsToInt(byte[] arg0) {
        BigInteger var2 = new BigInteger(1, arg0);
        if (arg0.length * 8 > this.n.bitLength()) {
            var2 = var2.shiftRight(arg0.length * 8 - this.n.bitLength());
        }
        return var2;
    }

    public BigInteger nextK() {
        byte[] var1 = new byte[(this.n.bitLength() + 7) / 8];
        while (true) {
            int var3;
            for (int var2 = 0; var2 < var1.length; var2 += var3) {
                this.hMac.update(this.V, 0, this.V.length);
                this.hMac.doFinal(this.V, 0);
                var3 = Math.min(var1.length - var2, this.V.length);
                System.arraycopy(this.V, 0, var1, var2, var3);
            }
            BigInteger var4 = this.bitsToInt(var1);
            if (var4.compareTo(ZERO) > 0 && var4.compareTo(this.n) < 0) {
                return var4;
            }
            this.hMac.update(this.V, 0, this.V.length);
            this.hMac.update((byte) 0);
            this.hMac.doFinal(this.K, 0);
            this.hMac.init(new KeyParameter(this.K));
            this.hMac.update(this.V, 0, this.V.length);
            this.hMac.doFinal(this.V, 0);
        }
    }
}
