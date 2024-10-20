package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class ECPrivateKeyParameters extends ECKeyParameters {

    public BigInteger d;

    public ECPrivateKeyParameters(BigInteger arg0, ECDomainParameters arg1) {
        super(true, arg1);
        this.d = arg0;
    }

    public BigInteger getD() {
        return this.d;
    }
}
