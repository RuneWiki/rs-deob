package org.bouncycastle.asn1.x500;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.style.BCStyle;

public class X500Name extends ASN1Object implements ASN1Choice {

    public X500NameStyle style;

    public RDN[] rdns;

    public static X500NameStyle defaultStyle = BCStyle.INSTANCE;

    public int hashCodeValue;

    public boolean isHashCodeCalculated;

    public ASN1ObjectIdentifier[] getAttributeTypes() {
        int var1 = 0;
        for (int var2 = 0; var2 != this.rdns.length; var2++) {
            RDN var3 = this.rdns[var2];
            var1 += var3.size();
        }
        ASN1ObjectIdentifier[] var4 = new ASN1ObjectIdentifier[var1];
        int var5 = 0;
        for (int var6 = 0; var6 != this.rdns.length; var6++) {
            RDN var7 = this.rdns[var6];
            if (var7.isMultiValued()) {
                AttributeTypeAndValue[] var8 = var7.getTypesAndValues();
                for (int var9 = 0; var9 != var8.length; var9++) {
                    var4[var5++] = var8[var9].getType();
                }
            } else if (var7.size() != 0) {
                var4[var5++] = var7.getFirst().getType();
            }
        }
        return var4;
    }

    public static X500Name getInstance(ASN1TaggedObject arg0, boolean arg1) {
        return getInstance(ASN1Sequence.getInstance(arg0, true));
    }

    public X500Name(X500NameStyle arg0, ASN1Sequence arg1) {
        this.style = arg0;
        this.rdns = new RDN[arg1.size()];
        int var3 = 0;
        Enumeration var4 = arg1.getObjects();
        while (var4.hasMoreElements()) {
            this.rdns[var3++] = RDN.getInstance(var4.nextElement());
        }
    }

    public RDN[] getRDNs() {
        RDN[] var1 = new RDN[this.rdns.length];
        System.arraycopy(this.rdns, 0, var1, 0, var1.length);
        return var1;
    }

    public X500Name(ASN1Sequence arg0) {
        this(defaultStyle, arg0);
    }

    public static X500Name getInstance(X500NameStyle arg0, Object arg1) {
        if (arg1 instanceof X500Name) {
            return new X500Name(arg0, (X500Name) arg1);
        } else if (arg1 == null) {
            return null;
        } else {
            return new X500Name(arg0, ASN1Sequence.getInstance(arg1));
        }
    }

    public X500Name(RDN[] arg0) {
        this(defaultStyle, arg0);
    }

    public X500Name(X500NameStyle arg0, RDN[] arg1) {
        this.rdns = arg1;
        this.style = arg0;
    }

    public X500Name(String arg0) {
        this(defaultStyle, arg0);
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof X500Name) || (arg0 instanceof ASN1Sequence)) {
            ASN1Primitive var2 = ((ASN1Encodable) arg0).toASN1Primitive();
            if (this.toASN1Primitive().equals(var2)) {
                return true;
            }
            try {
                return this.style.areEqual(this, new X500Name(ASN1Sequence.getInstance(((ASN1Encodable) arg0).toASN1Primitive())));
            } catch (Exception var4) {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean gy(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof X500Name) || (arg0 instanceof ASN1Sequence)) {
            ASN1Primitive var2 = ((ASN1Encodable) arg0).toASN1Primitive();
            if (this.toASN1Primitive().equals(var2)) {
                return true;
            }
            try {
                return this.style.areEqual(this, new X500Name(ASN1Sequence.getInstance(((ASN1Encodable) arg0).toASN1Primitive())));
            } catch (Exception var4) {
                return false;
            }
        } else {
            return false;
        }
    }

    public static X500Name getInstance(Object arg0) {
        if (arg0 instanceof X500Name) {
            return (X500Name) arg0;
        } else if (arg0 == null) {
            return null;
        } else {
            return new X500Name(ASN1Sequence.getInstance(arg0));
        }
    }

    public X500Name(X500NameStyle arg0, String arg1) {
        this(arg0.fromString(arg1));
        this.style = arg0;
    }

    public String ajh() {
        return this.style.toString(this);
    }

    public int hashCode() {
        if (this.isHashCodeCalculated) {
            return this.hashCodeValue;
        } else {
            this.isHashCodeCalculated = true;
            this.hashCodeValue = this.style.calculateHashCode(this);
            return this.hashCodeValue;
        }
    }

    /**
     * @deprecated
     */
    public X500Name(X500NameStyle arg0, X500Name arg1) {
        this.rdns = arg1.rdns;
        this.style = arg0;
    }

    public String toString() {
        return this.style.toString(this);
    }

    public static void setDefaultStyle(X500NameStyle arg0) {
        if (arg0 == null) {
            throw new NullPointerException("cannot set style to null");
        }
        defaultStyle = arg0;
    }

    public static X500NameStyle getDefaultStyle() {
        return defaultStyle;
    }

    public int ajw() {
        if (this.isHashCodeCalculated) {
            return this.hashCodeValue;
        } else {
            this.isHashCodeCalculated = true;
            this.hashCodeValue = this.style.calculateHashCode(this);
            return this.hashCodeValue;
        }
    }

    public boolean gn(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof X500Name) || (arg0 instanceof ASN1Sequence)) {
            ASN1Primitive var2 = ((ASN1Encodable) arg0).toASN1Primitive();
            if (this.toASN1Primitive().equals(var2)) {
                return true;
            }
            try {
                return this.style.areEqual(this, new X500Name(ASN1Sequence.getInstance(((ASN1Encodable) arg0).toASN1Primitive())));
            } catch (Exception var4) {
                return false;
            }
        } else {
            return false;
        }
    }

    public RDN[] getRDNs(ASN1ObjectIdentifier arg0) {
        RDN[] var2 = new RDN[this.rdns.length];
        int var3 = 0;
        for (int var4 = 0; var4 != this.rdns.length; var4++) {
            RDN var5 = this.rdns[var4];
            if (var5.isMultiValued()) {
                AttributeTypeAndValue[] var6 = var5.getTypesAndValues();
                for (int var7 = 0; var7 != var6.length; var7++) {
                    if (var6[var7].getType().equals(arg0)) {
                        var2[var3++] = var5;
                        break;
                    }
                }
            } else if (var5.getFirst().getType().equals(arg0)) {
                var2[var3++] = var5;
            }
        }
        RDN[] var8 = new RDN[var3];
        System.arraycopy(var2, 0, var8, 0, var8.length);
        return var8;
    }

    public int aja() {
        if (this.isHashCodeCalculated) {
            return this.hashCodeValue;
        } else {
            this.isHashCodeCalculated = true;
            this.hashCodeValue = this.style.calculateHashCode(this);
            return this.hashCodeValue;
        }
    }

    public int ajf() {
        if (this.isHashCodeCalculated) {
            return this.hashCodeValue;
        } else {
            this.isHashCodeCalculated = true;
            this.hashCodeValue = this.style.calculateHashCode(this);
            return this.hashCodeValue;
        }
    }

    public String ajp() {
        return this.style.toString(this);
    }

    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.rdns);
    }

    public String ajc() {
        return this.style.toString(this);
    }
}
