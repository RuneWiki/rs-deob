package org.bouncycastle.math.ec;

import java.math.BigInteger;

public class ZTauElement {

    public final BigInteger u;

    public final BigInteger v;

    public ZTauElement(BigInteger arg0, BigInteger arg1) {
        this.u = arg0;
        this.v = arg1;
    }
}
