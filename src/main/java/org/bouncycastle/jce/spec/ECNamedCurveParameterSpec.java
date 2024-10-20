package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

public class ECNamedCurveParameterSpec extends ECParameterSpec {

    public String name;

    public String getName() {
        return this.name;
    }

    public ECNamedCurveParameterSpec(String arg0, ECCurve arg1, ECPoint arg2, BigInteger arg3, BigInteger arg4) {
        super(arg1, arg2, arg3, arg4);
        this.name = arg0;
    }

    public ECNamedCurveParameterSpec(String arg0, ECCurve arg1, ECPoint arg2, BigInteger arg3) {
        super(arg1, arg2, arg3);
        this.name = arg0;
    }

    public ECNamedCurveParameterSpec(String arg0, ECCurve arg1, ECPoint arg2, BigInteger arg3, BigInteger arg4, byte[] arg5) {
        super(arg1, arg2, arg3, arg4, arg5);
        this.name = arg0;
    }
}
