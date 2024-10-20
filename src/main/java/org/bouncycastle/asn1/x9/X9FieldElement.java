package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.math.ec.ECFieldElement;

public class X9FieldElement extends ASN1Object {

    public static X9IntegerConverter converter = new X9IntegerConverter();

    public ECFieldElement f;

    public X9FieldElement(BigInteger arg0, ASN1OctetString arg1) {
        this(new ECFieldElement.Fp(arg0, new BigInteger(1, arg1.getOctets())));
    }

    public X9FieldElement(ECFieldElement arg0) {
        this.f = arg0;
    }

    public ECFieldElement getValue() {
        return this.f;
    }

    public ASN1Primitive toASN1Primitive() {
        int var1 = converter.getByteLength(this.f);
        byte[] var2 = converter.integerToBytes(this.f.toBigInteger(), var1);
        return new DEROctetString(var2);
    }

    public X9FieldElement(int arg0, int arg1, int arg2, int arg3, ASN1OctetString arg4) {
        this(new ECFieldElement.F2m(arg0, arg1, arg2, arg3, new BigInteger(1, arg4.getOctets())));
    }
}
