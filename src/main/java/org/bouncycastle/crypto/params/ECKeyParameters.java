package org.bouncycastle.crypto.params;

public class ECKeyParameters extends AsymmetricKeyParameter {

    public ECDomainParameters params;

    public ECDomainParameters getParameters() {
        return this.params;
    }

    public ECKeyParameters(boolean arg0, ECDomainParameters arg1) {
        super(arg0);
        this.params = arg1;
    }
}
