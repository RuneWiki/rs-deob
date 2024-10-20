package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public interface TlsSigner {

    boolean verifyRawSignature(byte[] arg0, AsymmetricKeyParameter arg1, byte[] arg2) throws CryptoException;

    byte[] generateRawSignature(AsymmetricKeyParameter arg0, byte[] arg1) throws CryptoException;

    byte[] generateRawSignature(SignatureAndHashAlgorithm arg0, AsymmetricKeyParameter arg1, byte[] arg2) throws CryptoException;

    Signer createSigner(SignatureAndHashAlgorithm arg0, AsymmetricKeyParameter arg1);

    boolean verifyRawSignature(SignatureAndHashAlgorithm arg0, byte[] arg1, AsymmetricKeyParameter arg2, byte[] arg3) throws CryptoException;

    boolean isValidPublicKey(AsymmetricKeyParameter arg0);

    Signer createVerifyer(AsymmetricKeyParameter arg0);

    Signer createSigner(AsymmetricKeyParameter arg0);

    Signer createVerifyer(SignatureAndHashAlgorithm arg0, AsymmetricKeyParameter arg1);

    void init(TlsContext arg0);
}
