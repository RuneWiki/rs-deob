package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

public class AEADParameters implements CipherParameters {

    public KeyParameter key;

    public byte[] nonce;

    public int macSize;

    public byte[] associatedText;

    public byte[] getAssociatedText() {
        return this.associatedText;
    }

    public int getMacSize() {
        return this.macSize;
    }

    public KeyParameter getKey() {
        return this.key;
    }

    public AEADParameters(KeyParameter arg0, int arg1, byte[] arg2) {
        this(arg0, arg1, arg2, (byte[]) null);
    }

    public AEADParameters(KeyParameter arg0, int arg1, byte[] arg2, byte[] arg3) {
        this.key = arg0;
        this.nonce = arg2;
        this.macSize = arg1;
        this.associatedText = arg3;
    }

    public byte[] getNonce() {
        return this.nonce;
    }
}
