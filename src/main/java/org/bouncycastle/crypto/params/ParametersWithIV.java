package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

public class ParametersWithIV implements CipherParameters {

    public byte[] iv;

    public CipherParameters parameters;

    public byte[] getIV() {
        return this.iv;
    }

    public CipherParameters getParameters() {
        return this.parameters;
    }

    public ParametersWithIV(CipherParameters arg0, byte[] arg1, int arg2, int arg3) {
        this.iv = new byte[arg3];
        this.parameters = arg0;
        System.arraycopy(arg1, arg2, this.iv, 0, arg3);
    }

    public ParametersWithIV(CipherParameters arg0, byte[] arg1) {
        this(arg0, arg1, 0, arg1.length);
    }
}
