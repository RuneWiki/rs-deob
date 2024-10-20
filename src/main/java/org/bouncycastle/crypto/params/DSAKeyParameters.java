package org.bouncycastle.crypto.params;

public class DSAKeyParameters extends AsymmetricKeyParameter {

    public DSAParameters params;

    public DSAParameters getParameters() {
        return this.params;
    }

    public DSAKeyParameters(boolean arg0, DSAParameters arg1) {
        super(arg0);
        this.params = arg1;
    }
}
