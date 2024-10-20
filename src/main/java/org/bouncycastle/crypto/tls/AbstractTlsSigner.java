package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public abstract class AbstractTlsSigner implements TlsSigner {

    public TlsContext context;

    public boolean verifyRawSignature(byte[] arg0, AsymmetricKeyParameter arg1, byte[] arg2) throws CryptoException {
        return this.verifyRawSignature((SignatureAndHashAlgorithm) null, arg0, arg1, arg2);
    }

    public byte[] generateRawSignature(AsymmetricKeyParameter arg0, byte[] arg1) throws CryptoException {
        return this.generateRawSignature((SignatureAndHashAlgorithm) null, arg0, arg1);
    }

    public Signer createVerifyer(AsymmetricKeyParameter arg0) {
        return this.createVerifyer((SignatureAndHashAlgorithm) null, arg0);
    }

    public Signer createSigner(AsymmetricKeyParameter arg0) {
        return this.createSigner((SignatureAndHashAlgorithm) null, arg0);
    }

    public void init(TlsContext arg0) {
        this.context = arg0;
    }
}
