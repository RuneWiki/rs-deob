package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

public class KeyParameter implements CipherParameters {

    public byte[] key;

    public byte[] getKey() {
        return this.key;
    }

    public KeyParameter(byte[] arg0) {
        this(arg0, 0, arg0.length);
    }

    public KeyParameter(byte[] arg0, int arg1, int arg2) {
        this.key = new byte[arg2];
        System.arraycopy(arg0, arg1, this.key, 0, arg2);
    }
}
