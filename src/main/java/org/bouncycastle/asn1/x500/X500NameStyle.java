package org.bouncycastle.asn1.x500;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

public interface X500NameStyle {

    ASN1Encodable stringToValue(ASN1ObjectIdentifier arg0, String arg1);

    ASN1ObjectIdentifier attrNameToOID(String arg0);

    RDN[] fromString(String arg0);

    int calculateHashCode(X500Name arg0);

    String toString(X500Name arg0);

    boolean areEqual(X500Name arg0, X500Name arg1);

    String oidToDisplayName(ASN1ObjectIdentifier arg0);

    String[] oidToAttrNames(ASN1ObjectIdentifier arg0);
}
