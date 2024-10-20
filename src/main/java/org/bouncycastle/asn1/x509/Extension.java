package org.bouncycastle.asn1.x509;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

public class Extension extends ASN1Object {

    public ASN1ObjectIdentifier extnId;

    public boolean critical;

    public ASN1OctetString value;

    public static final ASN1ObjectIdentifier subjectDirectoryAttributes = (new ASN1ObjectIdentifier("2.5.29.9")).intern();

    public static final ASN1ObjectIdentifier subjectKeyIdentifier = (new ASN1ObjectIdentifier("2.5.29.14")).intern();

    public static final ASN1ObjectIdentifier keyUsage = (new ASN1ObjectIdentifier("2.5.29.15")).intern();

    public static final ASN1ObjectIdentifier privateKeyUsagePeriod = (new ASN1ObjectIdentifier("2.5.29.16")).intern();

    public static final ASN1ObjectIdentifier subjectAlternativeName = (new ASN1ObjectIdentifier("2.5.29.17")).intern();

    public static final ASN1ObjectIdentifier issuerAlternativeName = (new ASN1ObjectIdentifier("2.5.29.18")).intern();

    public static final ASN1ObjectIdentifier basicConstraints = (new ASN1ObjectIdentifier("2.5.29.19")).intern();

    public static final ASN1ObjectIdentifier cRLNumber = (new ASN1ObjectIdentifier("2.5.29.20")).intern();

    public static final ASN1ObjectIdentifier reasonCode = (new ASN1ObjectIdentifier("2.5.29.21")).intern();

    public static final ASN1ObjectIdentifier instructionCode = (new ASN1ObjectIdentifier("2.5.29.23")).intern();

    public static final ASN1ObjectIdentifier invalidityDate = (new ASN1ObjectIdentifier("2.5.29.24")).intern();

    public static final ASN1ObjectIdentifier deltaCRLIndicator = (new ASN1ObjectIdentifier("2.5.29.27")).intern();

    public static final ASN1ObjectIdentifier issuingDistributionPoint = (new ASN1ObjectIdentifier("2.5.29.28")).intern();

    public static final ASN1ObjectIdentifier certificateIssuer = (new ASN1ObjectIdentifier("2.5.29.29")).intern();

    public static final ASN1ObjectIdentifier nameConstraints = (new ASN1ObjectIdentifier("2.5.29.30")).intern();

    public static final ASN1ObjectIdentifier cRLDistributionPoints = (new ASN1ObjectIdentifier("2.5.29.31")).intern();

    public static final ASN1ObjectIdentifier certificatePolicies = (new ASN1ObjectIdentifier("2.5.29.32")).intern();

    public static final ASN1ObjectIdentifier policyMappings = (new ASN1ObjectIdentifier("2.5.29.33")).intern();

    public static final ASN1ObjectIdentifier authorityKeyIdentifier = (new ASN1ObjectIdentifier("2.5.29.35")).intern();

    public static final ASN1ObjectIdentifier policyConstraints = (new ASN1ObjectIdentifier("2.5.29.36")).intern();

    public static final ASN1ObjectIdentifier extendedKeyUsage = (new ASN1ObjectIdentifier("2.5.29.37")).intern();

    public static final ASN1ObjectIdentifier freshestCRL = (new ASN1ObjectIdentifier("2.5.29.46")).intern();

    public static final ASN1ObjectIdentifier inhibitAnyPolicy = (new ASN1ObjectIdentifier("2.5.29.54")).intern();

    public static final ASN1ObjectIdentifier authorityInfoAccess = (new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.1")).intern();

    public static final ASN1ObjectIdentifier subjectInfoAccess = (new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.11")).intern();

    public static final ASN1ObjectIdentifier logoType = (new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.12")).intern();

    public static final ASN1ObjectIdentifier biometricInfo = (new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.2")).intern();

    public static final ASN1ObjectIdentifier qCStatements = (new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.3")).intern();

    public static final ASN1ObjectIdentifier auditIdentity = (new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.4")).intern();

    public static final ASN1ObjectIdentifier noRevAvail = (new ASN1ObjectIdentifier("2.5.29.56")).intern();

    public static final ASN1ObjectIdentifier targetInformation = (new ASN1ObjectIdentifier("2.5.29.55")).intern();

    public static final ASN1ObjectIdentifier expiredCertsOnCRL = (new ASN1ObjectIdentifier("2.5.29.60")).intern();

    public static ASN1Primitive convertValueToObject(Extension arg0) throws IllegalArgumentException {
        try {
            return ASN1Primitive.fromByteArray(arg0.getExtnValue().getOctets());
        } catch (IOException var2) {
            throw new IllegalArgumentException("can't convert extension: " + var2);
        }
    }

    public Extension(ASN1ObjectIdentifier arg0, boolean arg1, byte[] arg2) {
        this(arg0, arg1, (ASN1OctetString) (new DEROctetString(arg2)));
    }

    public Extension(ASN1ObjectIdentifier arg0, boolean arg1, ASN1OctetString arg2) {
        this.extnId = arg0;
        this.critical = arg1;
        this.value = arg2;
    }

    public Extension(ASN1Sequence arg0) {
        if (arg0.size() == 2) {
            this.extnId = ASN1ObjectIdentifier.getInstance(arg0.getObjectAt(0));
            this.critical = false;
            this.value = ASN1OctetString.getInstance(arg0.getObjectAt(1));
        } else if (arg0.size() == 3) {
            this.extnId = ASN1ObjectIdentifier.getInstance(arg0.getObjectAt(0));
            this.critical = ASN1Boolean.getInstance(arg0.getObjectAt(1)).isTrue();
            this.value = ASN1OctetString.getInstance(arg0.getObjectAt(2));
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + arg0.size());
        }
    }

    public static Extension getInstance(Object arg0) {
        if (arg0 instanceof Extension) {
            return (Extension) arg0;
        } else if (arg0 == null) {
            return null;
        } else {
            return new Extension(ASN1Sequence.getInstance(arg0));
        }
    }

    public ASN1ObjectIdentifier getExtnId() {
        return this.extnId;
    }

    public Extension(ASN1ObjectIdentifier arg0, ASN1Boolean arg1, ASN1OctetString arg2) {
        this(arg0, arg1.isTrue(), arg2);
    }

    public ASN1OctetString getExtnValue() {
        return this.value;
    }

    public ASN1Encodable getParsedValue() {
        return convertValueToObject(this);
    }

    public int hashCode() {
        return this.isCritical() ? this.getExtnValue().hashCode() ^ this.getExtnId().hashCode() : ~(this.getExtnValue().hashCode() ^ this.getExtnId().hashCode());
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof Extension)) {
            Extension var2 = (Extension) arg0;
            return var2.getExtnId().equals(this.getExtnId()) && var2.getExtnValue().equals(this.getExtnValue()) && var2.isCritical() == this.isCritical();
        } else {
            return false;
        }
    }

    public boolean ao(Object arg0) {
        if ((arg0 instanceof Extension)) {
            Extension var2 = (Extension) arg0;
            return var2.getExtnId().equals(this.getExtnId()) && var2.getExtnValue().equals(this.getExtnValue()) && var2.isCritical() == this.isCritical();
        } else {
            return false;
        }
    }

    public boolean isCritical() {
        return this.critical;
    }

    public int aca() {
        return this.isCritical() ? this.getExtnValue().hashCode() ^ this.getExtnId().hashCode() : ~(this.getExtnValue().hashCode() ^ this.getExtnId().hashCode());
    }

    public boolean am(Object arg0) {
        if ((arg0 instanceof Extension)) {
            Extension var2 = (Extension) arg0;
            return var2.getExtnId().equals(this.getExtnId()) && var2.getExtnValue().equals(this.getExtnValue()) && var2.isCritical() == this.isCritical();
        } else {
            return false;
        }
    }

    public boolean al(Object arg0) {
        if ((arg0 instanceof Extension)) {
            Extension var2 = (Extension) arg0;
            return var2.getExtnId().equals(this.getExtnId()) && var2.getExtnValue().equals(this.getExtnValue()) && var2.isCritical() == this.isCritical();
        } else {
            return false;
        }
    }

    public boolean ac(Object arg0) {
        if ((arg0 instanceof Extension)) {
            Extension var2 = (Extension) arg0;
            return var2.getExtnId().equals(this.getExtnId()) && var2.getExtnValue().equals(this.getExtnValue()) && var2.isCritical() == this.isCritical();
        } else {
            return false;
        }
    }

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector var1 = new ASN1EncodableVector();
        var1.add(this.extnId);
        if (this.critical) {
            var1.add(ASN1Boolean.getInstance(true));
        }
        var1.add(this.value);
        return new DERSequence(var1);
    }
}
