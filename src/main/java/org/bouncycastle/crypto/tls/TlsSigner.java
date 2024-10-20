package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public interface TlsSigner {

    boolean verifyRawSignature(SignatureAndHashAlgorithm arg0, byte[] arg1, AsymmetricKeyParameter arg2, byte[] arg3) throws CryptoException;

    Signer createVerifyer(AsymmetricKeyParameter arg0);

    byte[] generateRawSignature(AsymmetricKeyParameter arg0, byte[] arg1) throws CryptoException;

    boolean verifyRawSignature(byte[] arg0, AsymmetricKeyParameter arg1, byte[] arg2) throws CryptoException;

    Signer createSigner(SignatureAndHashAlgorithm arg0, AsymmetricKeyParameter arg1);

    Signer createSigner(AsymmetricKeyParameter arg0);

    void init(TlsContext arg0);

    byte[] generateRawSignature(SignatureAndHashAlgorithm arg0, AsymmetricKeyParameter arg1, byte[] arg2) throws CryptoException;

    Signer createVerifyer(SignatureAndHashAlgorithm arg0, AsymmetricKeyParameter arg1);

    boolean isValidPublicKey(AsymmetricKeyParameter arg0);
}
