package org.bouncycastle.crypto.signers;

import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

public class GenericSigner implements Signer {

    public final AsymmetricBlockCipher engine;

    public final Digest digest;

    public boolean forSigning;

    public void init(boolean arg0, CipherParameters arg1) {
        this.forSigning = arg0;
        AsymmetricKeyParameter var3;
        if (arg1 instanceof ParametersWithRandom) {
            var3 = (AsymmetricKeyParameter) ((ParametersWithRandom) arg1).getParameters();
        } else {
            var3 = (AsymmetricKeyParameter) arg1;
        }
        if (arg0 && !var3.isPrivate()) {
            throw new IllegalArgumentException("signing requires private key");
        } else if (!arg0 && var3.isPrivate()) {
            throw new IllegalArgumentException("verification requires public key");
        } else {
            this.reset();
            this.engine.init(arg0, arg1);
        }
    }

    public GenericSigner(AsymmetricBlockCipher arg0, Digest arg1) {
        this.engine = arg0;
        this.digest = arg1;
    }

    public void update(byte arg0) {
        this.digest.update(arg0);
    }

    public void update(byte[] arg0, int arg1, int arg2) {
        this.digest.update(arg0, arg1, arg2);
    }

    public byte[] generateSignature() throws CryptoException, DataLengthException {
        if (!this.forSigning) {
            throw new IllegalStateException("GenericSigner not initialised for signature generation.");
        }
        byte[] var1 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(var1, 0);
        return this.engine.processBlock(var1, 0, var1.length);
    }

    public boolean verifySignature(byte[] arg0) {
        if (this.forSigning) {
            throw new IllegalStateException("GenericSigner not initialised for verification");
        }
        byte[] var2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(var2, 0);
        try {
            byte[] var3 = this.engine.processBlock(arg0, 0, arg0.length);
            if (var3.length < var2.length) {
                byte[] var4 = new byte[var2.length];
                System.arraycopy(var3, 0, var4, var4.length - var3.length, var3.length);
                var3 = var4;
            }
            return Arrays.constantTimeAreEqual(var3, var2);
        } catch (Exception var6) {
            return false;
        }
    }

    public void reset() {
        this.digest.reset();
    }
}
