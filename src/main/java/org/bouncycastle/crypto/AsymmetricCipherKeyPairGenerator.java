package org.bouncycastle.crypto;

public interface AsymmetricCipherKeyPairGenerator {

    void init(KeyGenerationParameters arg0);

    AsymmetricCipherKeyPair generateKeyPair();
}
