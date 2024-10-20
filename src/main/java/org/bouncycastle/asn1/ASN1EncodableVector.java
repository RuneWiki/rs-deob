package org.bouncycastle.asn1;

import java.util.Enumeration;
import java.util.Vector;

public class ASN1EncodableVector {

    public final Vector v = new Vector();

    public void add(ASN1Encodable arg0) {
        this.v.addElement(arg0);
    }

    public void addAll(ASN1EncodableVector arg0) {
        Enumeration var2 = arg0.v.elements();
        while (var2.hasMoreElements()) {
            this.v.addElement(var2.nextElement());
        }
    }

    public ASN1Encodable get(int arg0) {
        return (ASN1Encodable) this.v.elementAt(arg0);
    }

    public int size() {
        return this.v.size();
    }
}
