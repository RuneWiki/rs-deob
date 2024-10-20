package org.bouncycastle.asn1.nist;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.sec.SECNamedCurves;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.util.Strings;

public class NISTNamedCurves {

    public static final Hashtable objIds = new Hashtable();

    public static final Hashtable names = new Hashtable();

    public static void defineCurve(String arg0, ASN1ObjectIdentifier arg1) {
        objIds.put(arg0, arg1);
        names.put(arg1, arg0);
    }

    static {
        defineCurve("B-571", SECObjectIdentifiers.sect571r1);
        defineCurve("B-409", SECObjectIdentifiers.sect409r1);
        defineCurve("B-283", SECObjectIdentifiers.sect283r1);
        defineCurve("B-233", SECObjectIdentifiers.sect233r1);
        defineCurve("B-163", SECObjectIdentifiers.sect163r2);
        defineCurve("K-571", SECObjectIdentifiers.sect571k1);
        defineCurve("K-409", SECObjectIdentifiers.sect409k1);
        defineCurve("K-283", SECObjectIdentifiers.sect283k1);
        defineCurve("K-233", SECObjectIdentifiers.sect233k1);
        defineCurve("K-163", SECObjectIdentifiers.sect163k1);
        defineCurve("P-521", SECObjectIdentifiers.secp521r1);
        defineCurve("P-384", SECObjectIdentifiers.secp384r1);
        defineCurve("P-256", SECObjectIdentifiers.secp256r1);
        defineCurve("P-224", SECObjectIdentifiers.secp224r1);
        defineCurve("P-192", SECObjectIdentifiers.secp192r1);
    }

    public static X9ECParameters getByOID(ASN1ObjectIdentifier arg0) {
        return SECNamedCurves.getByOID(arg0);
    }

    public static ASN1ObjectIdentifier getOID(String arg0) {
        return (ASN1ObjectIdentifier) objIds.get(Strings.toUpperCase(arg0));
    }

    public static String getName(ASN1ObjectIdentifier arg0) {
        return (String) names.get(arg0);
    }

    public static Enumeration getNames() {
        return objIds.keys();
    }

    public static X9ECParameters getByName(String arg0) {
        ASN1ObjectIdentifier var1 = (ASN1ObjectIdentifier) objIds.get(Strings.toUpperCase(arg0));
        return var1 == null ? null : getByOID(var1);
    }
}
