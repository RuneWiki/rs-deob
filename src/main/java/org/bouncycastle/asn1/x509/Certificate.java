package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.x500.X500Name;

public class Certificate extends ASN1Object {

    public ASN1Sequence seq;

    public TBSCertificate tbsCert;

    public AlgorithmIdentifier sigAlgId;

    public DERBitString sig;

    public static Certificate getInstance(ASN1TaggedObject arg0, boolean arg1) {
        return getInstance(ASN1Sequence.getInstance(arg0, arg1));
    }

    public ASN1Integer getSerialNumber() {
        return this.tbsCert.getSerialNumber();
    }

    public SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return this.tbsCert.getSubjectPublicKeyInfo();
    }

    public TBSCertificate getTBSCertificate() {
        return this.tbsCert;
    }

    public ASN1Integer getVersion() {
        return this.tbsCert.getVersion();
    }

    public int getVersionNumber() {
        return this.tbsCert.getVersionNumber();
    }

    public Certificate(ASN1Sequence arg0) {
        this.seq = arg0;
        if (arg0.size() != 3) {
            throw new IllegalArgumentException("sequence wrong size for a certificate");
        }
        this.tbsCert = TBSCertificate.getInstance(arg0.getObjectAt(0));
        this.sigAlgId = AlgorithmIdentifier.getInstance(arg0.getObjectAt(1));
        this.sig = DERBitString.getInstance(arg0.getObjectAt(2));
    }

    public X500Name getIssuer() {
        return this.tbsCert.getIssuer();
    }

    public Time getStartDate() {
        return this.tbsCert.getStartDate();
    }

    public Time getEndDate() {
        return this.tbsCert.getEndDate();
    }

    public X500Name getSubject() {
        return this.tbsCert.getSubject();
    }

    public static Certificate getInstance(Object arg0) {
        if (arg0 instanceof Certificate) {
            return (Certificate) arg0;
        } else if (arg0 == null) {
            return null;
        } else {
            return new Certificate(ASN1Sequence.getInstance(arg0));
        }
    }

    public AlgorithmIdentifier getSignatureAlgorithm() {
        return this.sigAlgId;
    }

    public DERBitString getSignature() {
        return this.sig;
    }

    public ASN1Primitive toASN1Primitive() {
        return this.seq;
    }
}
