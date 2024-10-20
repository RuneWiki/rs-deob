package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.signers.DSADigestSigner;

public abstract class TlsDSASigner extends AbstractTlsSigner {

    public byte[] generateRawSignature(SignatureAndHashAlgorithm arg0, AsymmetricKeyParameter arg1, byte[] arg2) throws CryptoException {
        Signer var4 = this.makeSigner(arg0, true, true, new ParametersWithRandom(arg1, this.context.getSecureRandom()));
        if (arg0 == null) {
            var4.update(arg2, 16, 20);
        } else {
            var4.update(arg2, 0, arg2.length);
        }
        return var4.generateSignature();
    }

    public boolean verifyRawSignature(SignatureAndHashAlgorithm arg0, byte[] arg1, AsymmetricKeyParameter arg2, byte[] arg3) throws CryptoException {
        Signer var5 = this.makeSigner(arg0, true, false, arg2);
        if (arg0 == null) {
            var5.update(arg3, 16, 20);
        } else {
            var5.update(arg3, 0, arg3.length);
        }
        return var5.verifySignature(arg1);
    }

    public Signer createSigner(SignatureAndHashAlgorithm arg0, AsymmetricKeyParameter arg1) {
        return this.makeSigner(arg0, false, true, arg1);
    }

    public Signer createVerifyer(SignatureAndHashAlgorithm arg0, AsymmetricKeyParameter arg1) {
        return this.makeSigner(arg0, false, false, arg1);
    }

    public Signer makeSigner(SignatureAndHashAlgorithm arg0, boolean arg1, boolean arg2, CipherParameters arg3) {
        if (arg0 != null != TlsUtils.isTLSv12(this.context)) {
            throw new IllegalStateException();
        } else if (arg0 == null || arg0.getSignature() == this.getSignatureAlgorithm()) {
            short var5 = arg0 == null ? 2 : arg0.getHash();
            Digest var6 = arg1 ? new NullDigest() : TlsUtils.createHash(var5);
            DSADigestSigner var7 = new DSADigestSigner(this.createDSAImpl(var5), var6);
            var7.init(arg2, this.makeInitParameters(arg2, arg3));
            return var7;
        } else {
            throw new IllegalStateException();
        }
    }

    public CipherParameters makeInitParameters(boolean arg0, CipherParameters arg1) {
        return arg1;
    }

    public abstract short getSignatureAlgorithm();

    public abstract DSA createDSAImpl(short arg0);
}
