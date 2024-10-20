package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.signers.GenericSigner;
import org.bouncycastle.crypto.signers.RSADigestSigner;

public class TlsRSASigner extends AbstractTlsSigner {

    public Signer makeSigner(SignatureAndHashAlgorithm arg0, boolean arg1, boolean arg2, CipherParameters arg3) {
        if (arg0 != null != TlsUtils.isTLSv12(this.context)) {
            throw new IllegalStateException();
        } else if (arg0 == null || arg0.getSignature() == 1) {
            Digest var5;
            if (arg1) {
                var5 = new NullDigest();
            } else if (arg0 == null) {
                var5 = new CombinedHash();
            } else {
                var5 = TlsUtils.createHash(arg0.getHash());
            }
            Object var6;
            if (arg0 == null) {
                var6 = new GenericSigner(this.createRSAImpl(), var5);
            } else {
                var6 = new RSADigestSigner(var5, TlsUtils.getOIDForHashAlgorithm(arg0.getHash()));
            }
            ((Signer) var6).init(arg2, arg3);
            return (Signer) var6;
        } else {
            throw new IllegalStateException();
        }
    }

    public byte[] generateRawSignature(SignatureAndHashAlgorithm arg0, AsymmetricKeyParameter arg1, byte[] arg2) throws CryptoException {
        Signer var4 = this.makeSigner(arg0, true, true, new ParametersWithRandom(arg1, this.context.getSecureRandom()));
        var4.update(arg2, 0, arg2.length);
        return var4.generateSignature();
    }

    public boolean verifyRawSignature(SignatureAndHashAlgorithm arg0, byte[] arg1, AsymmetricKeyParameter arg2, byte[] arg3) throws CryptoException {
        Signer var5 = this.makeSigner(arg0, true, false, arg2);
        var5.update(arg3, 0, arg3.length);
        return var5.verifySignature(arg1);
    }

    public boolean isValidPublicKey(AsymmetricKeyParameter arg0) {
        return arg0 instanceof RSAKeyParameters && !arg0.isPrivate();
    }

    public Signer createVerifyer(SignatureAndHashAlgorithm arg0, AsymmetricKeyParameter arg1) {
        return this.makeSigner(arg0, false, false, arg1);
    }

    public Signer createSigner(SignatureAndHashAlgorithm arg0, AsymmetricKeyParameter arg1) {
        return this.makeSigner(arg0, false, true, new ParametersWithRandom(arg1, this.context.getSecureRandom()));
    }

    public AsymmetricBlockCipher createRSAImpl() {
        return new PKCS1Encoding(new RSABlindedEngine());
    }
}
