package org.bouncycastle.crypto.encodings;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

public class PKCS1Encoding implements AsymmetricBlockCipher {

    public int pLen = -1;

    public byte[] fallback = null;

    public AsymmetricBlockCipher engine;

    public boolean useStrictLength;

    public static final int HEADER_LENGTH = 10;

    public static final String NOT_STRICT_LENGTH_ENABLED_PROPERTY = "org.bouncycastle.pkcs1.not_strict";

    /**
     * @deprecated
     */
    public static final String STRICT_LENGTH_ENABLED_PROPERTY = "org.bouncycastle.pkcs1.strict";

    public SecureRandom random;

    public boolean forEncryption;

    public boolean forPrivateKey;

    public byte[] blockBuffer;

    public boolean useStrict() {
        String var1 = (String) AccessController.doPrivileged(new PrivilegedAction() {

            public Object run() {
                return System.getProperty("org.bouncycastle.pkcs1.strict");
            }
        });
        String var2 = (String) AccessController.doPrivileged(new PrivilegedAction() {

            public Object run() {
                return System.getProperty("org.bouncycastle.pkcs1.not_strict");
            }
        });
        if (var2 == null) {
            return var1 == null || var1.equals("true");
        } else {
            return !var2.equals("true");
        }
    }

    public PKCS1Encoding(AsymmetricBlockCipher arg0, int arg1) {
        this.engine = arg0;
        this.useStrictLength = this.useStrict();
        this.pLen = arg1;
    }

    public PKCS1Encoding(AsymmetricBlockCipher arg0, byte[] arg1) {
        this.engine = arg0;
        this.useStrictLength = this.useStrict();
        this.fallback = arg1;
        this.pLen = arg1.length;
    }

    public void init(boolean arg0, CipherParameters arg1) {
        AsymmetricKeyParameter var4;
        if (arg1 instanceof ParametersWithRandom) {
            ParametersWithRandom var3 = (ParametersWithRandom) arg1;
            this.random = var3.getRandom();
            var4 = (AsymmetricKeyParameter) var3.getParameters();
        } else {
            var4 = (AsymmetricKeyParameter) arg1;
            if (!var4.isPrivate() && arg0) {
                this.random = new SecureRandom();
            }
        }
        this.engine.init(arg0, arg1);
        this.forPrivateKey = var4.isPrivate();
        this.forEncryption = arg0;
        this.blockBuffer = new byte[this.engine.getOutputBlockSize()];
        if (this.pLen > 0 && this.fallback == null && this.random == null) {
            throw new IllegalArgumentException("encoder requires random");
        }
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    public byte[] decodeBlock(byte[] arg0, int arg1, int arg2) throws InvalidCipherTextException {
        if (this.pLen != -1) {
            return this.decodeBlockOrRandom(arg0, arg1, arg2);
        }
        byte[] var4 = this.engine.processBlock(arg0, arg1, arg2);
        boolean var5 = this.useStrictLength & var4.length != this.engine.getOutputBlockSize();
        byte[] var6;
        if (var4.length < this.getOutputBlockSize()) {
            var6 = this.blockBuffer;
        } else {
            var6 = var4;
        }
        byte var7 = var6[0];
        boolean var8;
        if (this.forPrivateKey) {
            var8 = var7 != 2;
        } else {
            var8 = var7 != 1;
        }
        int var9 = this.findStart(var7, var6);
        int var11 = var9 + 1;
        if (var8 | var11 < 10) {
            Arrays.fill((byte[]) var6, (byte) 0);
            throw new InvalidCipherTextException("block incorrect");
        } else if (var5) {
            Arrays.fill((byte[]) var6, (byte) 0);
            throw new InvalidCipherTextException("block incorrect size");
        } else {
            byte[] var10 = new byte[var6.length - var11];
            System.arraycopy(var6, var11, var10, 0, var10.length);
            return var10;
        }
    }

    public int getInputBlockSize() {
        int var1 = this.engine.getInputBlockSize();
        return this.forEncryption ? var1 - 10 : var1;
    }

    public int getOutputBlockSize() {
        int var1 = this.engine.getOutputBlockSize();
        return this.forEncryption ? var1 : var1 - 10;
    }

    public byte[] decodeBlockOrRandom(byte[] arg0, int arg1, int arg2) throws InvalidCipherTextException {
        if (!this.forPrivateKey) {
            throw new InvalidCipherTextException("sorry, this method is only for decryption, not for signing");
        }
        byte[] var4 = this.engine.processBlock(arg0, arg1, arg2);
        byte[] var5;
        if (this.fallback == null) {
            var5 = new byte[this.pLen];
            this.random.nextBytes(var5);
        } else {
            var5 = this.fallback;
        }
        byte[] var6 = this.useStrictLength & var4.length != this.engine.getOutputBlockSize() ? this.blockBuffer : var4;
        int var7 = checkPkcs1Encoding(var6, this.pLen);
        byte[] var8 = new byte[this.pLen];
        for (int var9 = 0; var9 < this.pLen; var9++) {
            var8[var9] = (byte) (var6[var6.length - this.pLen + var9] & ~var7 | var5[var9] & var7);
        }
        Arrays.fill((byte[]) var6, (byte) 0);
        return var8;
    }

    public byte[] encodeBlock(byte[] arg0, int arg1, int arg2) throws InvalidCipherTextException {
        if (arg2 > this.getInputBlockSize()) {
            throw new IllegalArgumentException("input data too large");
        }
        byte[] var4 = new byte[this.engine.getInputBlockSize()];
        if (this.forPrivateKey) {
            var4[0] = 1;
            for (int var5 = 1; var5 != var4.length - arg2 - 1; var5++) {
                var4[var5] = -1;
            }
        } else {
            this.random.nextBytes(var4);
            var4[0] = 2;
            for (int var6 = 1; var6 != var4.length - arg2 - 1; var6++) {
                while (var4[var6] == 0) {
                    var4[var6] = (byte) this.random.nextInt();
                }
            }
        }
        var4[var4.length - arg2 - 1] = 0;
        System.arraycopy(arg0, arg1, var4, var4.length - arg2, arg2);
        return this.engine.processBlock(var4, 0, var4.length);
    }

    public static int checkPkcs1Encoding(byte[] arg0, int arg1) {
        byte var2 = 0;
        int var3 = var2 | arg0[0] ^ 0x2;
        int var4 = arg0.length - (arg1 + 1);
        for (int var5 = 1; var5 < var4; var5++) {
            byte var6 = arg0[var5];
            int var7 = var6 | var6 >> 1;
            int var8 = var7 | var7 >> 2;
            int var9 = var8 | var8 >> 4;
            var3 |= (var9 & 0x1) - 1;
        }
        int var10 = var3 | arg0[arg0.length - (arg1 + 1)];
        int var11 = var10 | var10 >> 1;
        int var12 = var11 | var11 >> 2;
        int var13 = var12 | var12 >> 4;
        return ~((var13 & 0x1) - 1);
    }

    public PKCS1Encoding(AsymmetricBlockCipher arg0) {
        this.engine = arg0;
        this.useStrictLength = this.useStrict();
    }

    public byte[] processBlock(byte[] arg0, int arg1, int arg2) throws InvalidCipherTextException {
        return this.forEncryption ? this.encodeBlock(arg0, arg1, arg2) : this.decodeBlock(arg0, arg1, arg2);
    }

    public int findStart(byte arg0, byte[] arg1) throws InvalidCipherTextException {
        int var3 = -1;
        boolean var4 = false;
        for (int var5 = 1; var5 != arg1.length; var5++) {
            byte var6 = arg1[var5];
            if (var6 == 0 & var3 < 0) {
                var3 = var5;
            }
            var4 |= arg0 == 1 & var3 < 0 & var6 != -1;
        }
        if (var4) {
            return -1;
        } else {
            return var3;
        }
    }
}
