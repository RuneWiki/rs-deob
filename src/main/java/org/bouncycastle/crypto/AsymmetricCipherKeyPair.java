package org.bouncycastle.crypto;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public class AsymmetricCipherKeyPair {

    public AsymmetricKeyParameter publicParam;

    public AsymmetricKeyParameter privateParam;

    /**
     * @deprecated
     */
    public AsymmetricCipherKeyPair(CipherParameters arg0, CipherParameters arg1) {
        this.publicParam = (AsymmetricKeyParameter) arg0;
        this.privateParam = (AsymmetricKeyParameter) arg1;
    }

    public AsymmetricKeyParameter getPublic() {
        return this.publicParam;
    }

    public AsymmetricCipherKeyPair(AsymmetricKeyParameter arg0, AsymmetricKeyParameter arg1) {
        this.publicParam = arg0;
        this.privateParam = arg1;
    }

    public AsymmetricKeyParameter getPrivate() {
        return this.privateParam;
    }
}
