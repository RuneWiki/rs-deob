package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class DSAPrivateKeyParameters extends DSAKeyParameters {

    public BigInteger x;

    public DSAPrivateKeyParameters(BigInteger arg0, DSAParameters arg1) {
        super(true, arg1);
        this.x = arg0;
    }

    public BigInteger getX() {
        return this.x;
    }
}
