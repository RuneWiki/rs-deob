package org.bouncycastle.asn1.x500.style;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.x500.AttributeTypeAndValue;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;

public abstract class AbstractX500NameStyle implements X500NameStyle {

    public static Hashtable copyHashTable(Hashtable arg0) {
        Hashtable var1 = new Hashtable();
        Enumeration var2 = arg0.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, arg0.get(var3));
        }
        return var1;
    }

    public int calcHashCode(ASN1Encodable arg0) {
        String var2 = IETFUtils.valueToString(arg0);
        String var3 = IETFUtils.canonicalize(var2);
        return var3.hashCode();
    }

    public int calculateHashCode(X500Name arg0) {
        int var2 = 0;
        RDN[] var3 = arg0.getRDNs();
        for (int var4 = 0; var4 != var3.length; var4++) {
            if (var3[var4].isMultiValued()) {
                AttributeTypeAndValue[] var5 = var3[var4].getTypesAndValues();
                for (int var6 = 0; var6 != var5.length; var6++) {
                    int var7 = var2 ^ var5[var6].getType().hashCode();
                    var2 = var7 ^ this.calcHashCode(var5[var6].getValue());
                }
            } else {
                int var8 = var2 ^ var3[var4].getFirst().getType().hashCode();
                var2 = var8 ^ this.calcHashCode(var3[var4].getFirst().getValue());
            }
        }
        return var2;
    }

    public ASN1Encodable stringToValue(ASN1ObjectIdentifier arg0, String arg1) {
        if (arg1.length() == 0 || arg1.charAt(0) != '#') {
            if (arg1.length() != 0 && arg1.charAt(0) == '\\') {
                arg1 = arg1.substring(1);
            }
            return this.encodeStringValue(arg0, arg1);
        }
        try {
            return IETFUtils.valueFromHexString(arg1, 1);
        } catch (IOException var4) {
            throw new ASN1ParsingException("can't recode value for oid " + arg0.getId());
        }
    }

    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier arg0, String arg1) {
        return new DERUTF8String(arg1);
    }

    public boolean foundMatch(boolean arg0, RDN arg1, RDN[] arg2) {
        if (arg0) {
            for (int var4 = arg2.length - 1; var4 >= 0; var4--) {
                if (arg2[var4] != null && this.rdnAreEqual(arg1, arg2[var4])) {
                    arg2[var4] = null;
                    return true;
                }
            }
        } else {
            for (int var5 = 0; var5 != arg2.length; var5++) {
                if (arg2[var5] != null && this.rdnAreEqual(arg1, arg2[var5])) {
                    arg2[var5] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean areEqual(X500Name arg0, X500Name arg1) {
        RDN[] var3 = arg0.getRDNs();
        RDN[] var4 = arg1.getRDNs();
        if (var3.length != var4.length) {
            return false;
        }
        boolean var5 = false;
        if (var3[0].getFirst() != null && var4[0].getFirst() != null) {
            var5 = !var3[0].getFirst().getType().equals(var4[0].getFirst().getType());
        }
        for (int var6 = 0; var6 != var3.length; var6++) {
            if (!this.foundMatch(var5, var3[var6], var4)) {
                return false;
            }
        }
        return true;
    }

    public boolean rdnAreEqual(RDN arg0, RDN arg1) {
        return IETFUtils.rDNAreEqual(arg0, arg1);
    }
}
