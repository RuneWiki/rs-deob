package org.bouncycastle.crypto.params;

import org.bouncycastle.math.ec.ECPoint;

public class ECPublicKeyParameters extends ECKeyParameters {

    public final ECPoint Q;

    public ECPoint getQ() {
        return this.Q;
    }

    public ECPoint validate(ECPoint arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("point has null value");
        } else if (arg0.isInfinity()) {
            throw new IllegalArgumentException("point at infinity");
        } else {
            ECPoint var2 = arg0.normalize();
            if (!var2.isValid()) {
                throw new IllegalArgumentException("point not on curve");
            }
            return var2;
        }
    }

    public ECPublicKeyParameters(ECPoint arg0, ECDomainParameters arg1) {
        super(false, arg1);
        this.Q = this.validate(arg0);
    }
}
