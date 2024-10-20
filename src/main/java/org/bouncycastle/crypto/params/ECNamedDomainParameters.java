package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

public class ECNamedDomainParameters extends ECDomainParameters {

    public ASN1ObjectIdentifier name;

    public ECNamedDomainParameters(ASN1ObjectIdentifier arg0, ECCurve arg1, ECPoint arg2, BigInteger arg3, BigInteger arg4) {
        this(arg0, arg1, arg2, arg3, arg4, (byte[]) null);
    }

    public ASN1ObjectIdentifier getName() {
        return this.name;
    }

    public ECNamedDomainParameters(ASN1ObjectIdentifier arg0, ECCurve arg1, ECPoint arg2, BigInteger arg3, BigInteger arg4, byte[] arg5) {
        super(arg1, arg2, arg3, arg4, arg5);
        this.name = arg0;
    }

    public ECNamedDomainParameters(ASN1ObjectIdentifier arg0, ECCurve arg1, ECPoint arg2, BigInteger arg3) {
        this(arg0, arg1, arg2, arg3, (BigInteger) null, (byte[]) null);
    }
}
