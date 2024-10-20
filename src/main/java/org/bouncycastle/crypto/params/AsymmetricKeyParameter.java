package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

public class AsymmetricKeyParameter implements CipherParameters {

    public boolean privateKey;

    public AsymmetricKeyParameter(boolean arg0) {
        this.privateKey = arg0;
    }

    public boolean isPrivate() {
        return this.privateKey;
    }
}
