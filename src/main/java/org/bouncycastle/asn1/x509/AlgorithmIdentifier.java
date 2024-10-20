package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

public class AlgorithmIdentifier extends ASN1Object {

    public ASN1ObjectIdentifier algorithm;

    public ASN1Encodable parameters;

    public ASN1ObjectIdentifier getAlgorithm() {
        return this.algorithm;
    }

    public static AlgorithmIdentifier getInstance(ASN1TaggedObject arg0, boolean arg1) {
        return getInstance(ASN1Sequence.getInstance(arg0, arg1));
    }

    public AlgorithmIdentifier(ASN1ObjectIdentifier arg0) {
        this.algorithm = arg0;
    }

    public AlgorithmIdentifier(ASN1ObjectIdentifier arg0, ASN1Encodable arg1) {
        this.algorithm = arg0;
        this.parameters = arg1;
    }

    public AlgorithmIdentifier(ASN1Sequence arg0) {
        if (arg0.size() < 1 || arg0.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + arg0.size());
        }
        this.algorithm = ASN1ObjectIdentifier.getInstance(arg0.getObjectAt(0));
        if (arg0.size() == 2) {
            this.parameters = arg0.getObjectAt(1);
        } else {
            this.parameters = null;
        }
    }

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector var1 = new ASN1EncodableVector();
        var1.add(this.algorithm);
        if (this.parameters != null) {
            var1.add(this.parameters);
        }
        return new DERSequence(var1);
    }

    public ASN1Encodable getParameters() {
        return this.parameters;
    }

    public static AlgorithmIdentifier getInstance(Object arg0) {
        if (arg0 instanceof AlgorithmIdentifier) {
            return (AlgorithmIdentifier) arg0;
        } else if (arg0 == null) {
            return null;
        } else {
            return new AlgorithmIdentifier(ASN1Sequence.getInstance(arg0));
        }
    }
}
