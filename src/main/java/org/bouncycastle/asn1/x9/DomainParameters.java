package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

public class DomainParameters extends ASN1Object {

    public final ASN1Integer p;

    public final ASN1Integer g;

    public final ASN1Integer q;

    public final ASN1Integer j;

    public final ValidationParams validationParams;

    public BigInteger getG() {
        return this.g.getPositiveValue();
    }

    public static DomainParameters getInstance(ASN1TaggedObject arg0, boolean arg1) {
        return getInstance(ASN1Sequence.getInstance(arg0, arg1));
    }

    public DomainParameters(BigInteger arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3, ValidationParams arg4) {
        if (arg0 == null) {
            throw new IllegalArgumentException("'p' cannot be null");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("'g' cannot be null");
        } else if (arg2 == null) {
            throw new IllegalArgumentException("'q' cannot be null");
        } else {
            this.p = new ASN1Integer(arg0);
            this.g = new ASN1Integer(arg1);
            this.q = new ASN1Integer(arg2);
            if (arg3 == null) {
                this.j = null;
            } else {
                this.j = new ASN1Integer(arg3);
            }
            this.validationParams = arg4;
        }
    }

    public DomainParameters(ASN1Sequence arg0) {
        if (arg0.size() < 3 || arg0.size() > 5) {
            throw new IllegalArgumentException("Bad sequence size: " + arg0.size());
        }
        Enumeration var2 = arg0.getObjects();
        this.p = ASN1Integer.getInstance(var2.nextElement());
        this.g = ASN1Integer.getInstance(var2.nextElement());
        this.q = ASN1Integer.getInstance(var2.nextElement());
        ASN1Encodable var3 = getNext(var2);
        if (var3 != null && var3 instanceof ASN1Integer) {
            this.j = ASN1Integer.getInstance(var3);
            var3 = getNext(var2);
        } else {
            this.j = null;
        }
        if (var3 == null) {
            this.validationParams = null;
        } else {
            this.validationParams = ValidationParams.getInstance(var3.toASN1Primitive());
        }
    }

    public static ASN1Encodable getNext(Enumeration arg0) {
        return arg0.hasMoreElements() ? (ASN1Encodable) arg0.nextElement() : null;
    }

    public BigInteger getP() {
        return this.p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.q.getPositiveValue();
    }

    public static DomainParameters getInstance(Object arg0) {
        if (arg0 instanceof DomainParameters) {
            return (DomainParameters) arg0;
        } else if (arg0 == null) {
            return null;
        } else {
            return new DomainParameters(ASN1Sequence.getInstance(arg0));
        }
    }

    public BigInteger getJ() {
        return this.j == null ? null : this.j.getPositiveValue();
    }

    public ValidationParams getValidationParams() {
        return this.validationParams;
    }

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector var1 = new ASN1EncodableVector();
        var1.add(this.p);
        var1.add(this.g);
        var1.add(this.q);
        if (this.j != null) {
            var1.add(this.j);
        }
        if (this.validationParams != null) {
            var1.add(this.validationParams);
        }
        return new DERSequence(var1);
    }
}
