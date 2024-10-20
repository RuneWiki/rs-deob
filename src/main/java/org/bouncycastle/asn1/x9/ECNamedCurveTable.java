package org.bouncycastle.asn1.x9;

import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.anssi.ANSSINamedCurves;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.nist.NISTNamedCurves;
import org.bouncycastle.asn1.sec.SECNamedCurves;
import org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves;

public class ECNamedCurveTable {

    public static ASN1ObjectIdentifier getOID(String arg0) {
        ASN1ObjectIdentifier var1 = X962NamedCurves.getOID(arg0);
        if (var1 == null) {
            var1 = SECNamedCurves.getOID(arg0);
        }
        if (var1 == null) {
            var1 = NISTNamedCurves.getOID(arg0);
        }
        if (var1 == null) {
            var1 = TeleTrusTNamedCurves.getOID(arg0);
        }
        if (var1 == null) {
            var1 = ANSSINamedCurves.getOID(arg0);
        }
        return var1;
    }

    public static X9ECParameters getByName(String arg0) {
        X9ECParameters var1 = X962NamedCurves.getByName(arg0);
        if (var1 == null) {
            var1 = SECNamedCurves.getByName(arg0);
        }
        if (var1 == null) {
            var1 = NISTNamedCurves.getByName(arg0);
        }
        if (var1 == null) {
            var1 = TeleTrusTNamedCurves.getByName(arg0);
        }
        if (var1 == null) {
            var1 = ANSSINamedCurves.getByName(arg0);
        }
        return var1;
    }

    public static String getName(ASN1ObjectIdentifier arg0) {
        String var1 = NISTNamedCurves.getName(arg0);
        if (var1 == null) {
            var1 = SECNamedCurves.getName(arg0);
        }
        if (var1 == null) {
            var1 = TeleTrusTNamedCurves.getName(arg0);
        }
        if (var1 == null) {
            var1 = X962NamedCurves.getName(arg0);
        }
        if (var1 == null) {
            var1 = ECGOST3410NamedCurves.getName(arg0);
        }
        return var1;
    }

    public static X9ECParameters getByOID(ASN1ObjectIdentifier arg0) {
        X9ECParameters var1 = X962NamedCurves.getByOID(arg0);
        if (var1 == null) {
            var1 = SECNamedCurves.getByOID(arg0);
        }
        if (var1 == null) {
            var1 = TeleTrusTNamedCurves.getByOID(arg0);
        }
        if (var1 == null) {
            var1 = ANSSINamedCurves.getByOID(arg0);
        }
        return var1;
    }

    public static Enumeration getNames() {
        Vector var0 = new Vector();
        addEnumeration(var0, X962NamedCurves.getNames());
        addEnumeration(var0, SECNamedCurves.getNames());
        addEnumeration(var0, NISTNamedCurves.getNames());
        addEnumeration(var0, TeleTrusTNamedCurves.getNames());
        addEnumeration(var0, ANSSINamedCurves.getNames());
        return var0.elements();
    }

    public static void addEnumeration(Vector arg0, Enumeration arg1) {
        while (arg1.hasMoreElements()) {
            arg0.addElement(arg1.nextElement());
        }
    }
}
