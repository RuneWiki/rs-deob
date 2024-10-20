package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.x500.X500Name;

public class TBSCertificate extends ASN1Object {

    public ASN1Sequence seq;

    public ASN1Integer version;

    public ASN1Integer serialNumber;

    public AlgorithmIdentifier signature;

    public X500Name issuer;

    public Time startDate;

    public Time endDate;

    public X500Name subject;

    public SubjectPublicKeyInfo subjectPublicKeyInfo;

    public Extensions extensions;

    public DERBitString subjectUniqueId;

    public DERBitString issuerUniqueId;

    public Time getEndDate() {
        return this.endDate;
    }

    public ASN1Integer getVersion() {
        return this.version;
    }

    public static TBSCertificate getInstance(ASN1TaggedObject arg0, boolean arg1) {
        return getInstance(ASN1Sequence.getInstance(arg0, arg1));
    }

    public int getVersionNumber() {
        return this.version.getValue().intValue() + 1;
    }

    public static TBSCertificate getInstance(Object arg0) {
        if (arg0 instanceof TBSCertificate) {
            return (TBSCertificate) arg0;
        } else if (arg0 == null) {
            return null;
        } else {
            return new TBSCertificate(ASN1Sequence.getInstance(arg0));
        }
    }

    public ASN1Integer getSerialNumber() {
        return this.serialNumber;
    }

    public AlgorithmIdentifier getSignature() {
        return this.signature;
    }

    public X500Name getIssuer() {
        return this.issuer;
    }

    public Time getStartDate() {
        return this.startDate;
    }

    public TBSCertificate(ASN1Sequence arg0) {
        byte var2 = 0;
        this.seq = arg0;
        if (arg0.getObjectAt(0) instanceof ASN1TaggedObject) {
            this.version = ASN1Integer.getInstance((ASN1TaggedObject) arg0.getObjectAt(0), true);
        } else {
            var2 = -1;
            this.version = new ASN1Integer(0L);
        }
        this.serialNumber = ASN1Integer.getInstance(arg0.getObjectAt(var2 + 1));
        this.signature = AlgorithmIdentifier.getInstance(arg0.getObjectAt(var2 + 2));
        this.issuer = X500Name.getInstance(arg0.getObjectAt(var2 + 3));
        ASN1Sequence var3 = (ASN1Sequence) arg0.getObjectAt(var2 + 4);
        this.startDate = Time.getInstance(var3.getObjectAt(0));
        this.endDate = Time.getInstance(var3.getObjectAt(1));
        this.subject = X500Name.getInstance(arg0.getObjectAt(var2 + 5));
        this.subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(arg0.getObjectAt(var2 + 6));
        for (int var4 = arg0.size() - (var2 + 6) - 1; var4 > 0; var4--) {
            ASN1TaggedObject var5 = (ASN1TaggedObject) arg0.getObjectAt(var2 + 6 + var4);
            switch(var5.getTagNo()) {
                case 1:
                    this.issuerUniqueId = DERBitString.getInstance(var5, false);
                    break;
                case 2:
                    this.subjectUniqueId = DERBitString.getInstance(var5, false);
                    break;
                case 3:
                    this.extensions = Extensions.getInstance(ASN1Sequence.getInstance(var5, true));
            }
        }
    }

    public X500Name getSubject() {
        return this.subject;
    }

    public SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return this.subjectPublicKeyInfo;
    }

    public DERBitString getIssuerUniqueId() {
        return this.issuerUniqueId;
    }

    public DERBitString getSubjectUniqueId() {
        return this.subjectUniqueId;
    }

    public Extensions getExtensions() {
        return this.extensions;
    }

    public ASN1Primitive toASN1Primitive() {
        return this.seq;
    }
}
