package org.bouncycastle.asn1.x500;

import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x500.style.BCStyle;

public class X500NameBuilder {

    public Vector rdns;

    public X500NameStyle template;

    public X500NameBuilder(X500NameStyle arg0) {
        this.rdns = new Vector();
        this.template = arg0;
    }

    public X500NameBuilder() {
        this(BCStyle.INSTANCE);
    }

    public X500NameBuilder addRDN(ASN1ObjectIdentifier arg0, String arg1) {
        this.addRDN(arg0, this.template.stringToValue(arg0, arg1));
        return this;
    }

    public X500NameBuilder addMultiValuedRDN(ASN1ObjectIdentifier[] arg0, String[] arg1) {
        ASN1Encodable[] var3 = new ASN1Encodable[arg1.length];
        for (int var4 = 0; var4 != var3.length; var4++) {
            var3[var4] = this.template.stringToValue(arg0[var4], arg1[var4]);
        }
        return this.addMultiValuedRDN(arg0, var3);
    }

    public X500NameBuilder addRDN(AttributeTypeAndValue arg0) {
        this.rdns.addElement(new RDN(arg0));
        return this;
    }

    public X500NameBuilder addRDN(ASN1ObjectIdentifier arg0, ASN1Encodable arg1) {
        this.rdns.addElement(new RDN(arg0, arg1));
        return this;
    }

    public X500NameBuilder addMultiValuedRDN(ASN1ObjectIdentifier[] arg0, ASN1Encodable[] arg1) {
        AttributeTypeAndValue[] var3 = new AttributeTypeAndValue[arg0.length];
        for (int var4 = 0; var4 != arg0.length; var4++) {
            var3[var4] = new AttributeTypeAndValue(arg0[var4], arg1[var4]);
        }
        return this.addMultiValuedRDN(var3);
    }

    public X500NameBuilder addMultiValuedRDN(AttributeTypeAndValue[] arg0) {
        this.rdns.addElement(new RDN(arg0));
        return this;
    }

    public X500Name build() {
        RDN[] var1 = new RDN[this.rdns.size()];
        for (int var2 = 0; var2 != var1.length; var2++) {
            var1[var2] = (RDN) this.rdns.elementAt(var2);
        }
        return new X500Name(this.template, var1);
    }
}
