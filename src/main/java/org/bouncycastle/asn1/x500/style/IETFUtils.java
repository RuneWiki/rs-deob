package org.bouncycastle.asn1.x500.style;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.DERUniversalString;
import org.bouncycastle.asn1.x500.AttributeTypeAndValue;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500NameBuilder;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

public class IETFUtils {

    public static int convertHex(char arg0) {
        if ('0' <= arg0 && arg0 <= '9') {
            return arg0 - '0';
        } else if ('a' <= arg0 && arg0 <= 'f') {
            return arg0 - 'a' + 10;
        } else {
            return arg0 - 'A' + 10;
        }
    }

    public static String unescape(String arg0) {
        if (arg0.length() == 0 || arg0.indexOf(92) < 0 && arg0.indexOf(34) < 0) {
            return arg0.trim();
        }
        char[] var1 = arg0.toCharArray();
        boolean var2 = false;
        boolean var3 = false;
        StringBuffer var4 = new StringBuffer(arg0.length());
        byte var5 = 0;
        if (var1[0] == '\\' && var1[1] == '#') {
            var5 = 2;
            var4.append("\\#");
        }
        boolean var6 = false;
        int var7 = 0;
        char var8 = 0;
        for (int var9 = var5; var9 != var1.length; var9++) {
            char var10 = var1[var9];
            if (var10 != ' ') {
                var6 = true;
            }
            if (var10 == '"') {
                if (var2) {
                    var4.append(var10);
                } else {
                    var3 = !var3;
                }
                var2 = false;
            } else if (var10 == '\\' && !var2 && !var3) {
                var2 = true;
                var7 = var4.length();
            } else if (var10 != ' ' || var2 || var6) {
                if (!var2 || !isHexDigit(var10)) {
                    var4.append(var10);
                    var2 = false;
                } else if (var8 == 0) {
                    var8 = var10;
                } else {
                    var4.append((char) (convertHex(var8) * 16 + convertHex(var10)));
                    var2 = false;
                    var8 = 0;
                }
            }
        }
        if (var4.length() > 0) {
            while (var4.charAt(var4.length() - 1) == ' ' && var7 != var4.length() - 1) {
                var4.setLength(var4.length() - 1);
            }
        }
        return var4.toString();
    }

    public static boolean isHexDigit(char arg0) {
        return '0' <= arg0 && arg0 <= '9' || 'a' <= arg0 && arg0 <= 'f' || 'A' <= arg0 && arg0 <= 'F';
    }

    public static ASN1Encodable valueFromHexString(String arg0, int arg1) throws IOException {
        byte[] var2 = new byte[(arg0.length() - arg1) / 2];
        for (int var3 = 0; var3 != var2.length; var3++) {
            char var4 = arg0.charAt(var3 * 2 + arg1);
            char var5 = arg0.charAt(var3 * 2 + arg1 + 1);
            var2[var3] = (byte) (convertHex(var4) << 4 | convertHex(var5));
        }
        return ASN1Primitive.fromByteArray(var2);
    }

    public static String[] toValueArray(Vector arg0) {
        String[] var1 = new String[arg0.size()];
        for (int var2 = 0; var2 != var1.length; var2++) {
            var1[var2] = (String) arg0.elementAt(var2);
        }
        return var1;
    }

    public static ASN1ObjectIdentifier[] toOIDArray(Vector arg0) {
        ASN1ObjectIdentifier[] var1 = new ASN1ObjectIdentifier[arg0.size()];
        for (int var2 = 0; var2 != var1.length; var2++) {
            var1[var2] = (ASN1ObjectIdentifier) arg0.elementAt(var2);
        }
        return var1;
    }

    public static String[] findAttrNamesForOID(ASN1ObjectIdentifier arg0, Hashtable arg1) {
        int var2 = 0;
        Enumeration var3 = arg1.elements();
        while (var3.hasMoreElements()) {
            if (arg0.equals(var3.nextElement())) {
                var2++;
            }
        }
        String[] var4 = new String[var2];
        int var5 = 0;
        Enumeration var6 = arg1.keys();
        while (var6.hasMoreElements()) {
            String var7 = (String) var6.nextElement();
            if (arg0.equals(arg1.get(var7))) {
                var4[var5++] = var7;
            }
        }
        return var4;
    }

    public static String stripInternalSpaces(String arg0) {
        StringBuffer var1 = new StringBuffer();
        if (arg0.length() != 0) {
            char var2 = arg0.charAt(0);
            var1.append(var2);
            for (int var3 = 1; var3 < arg0.length(); var3++) {
                char var4 = arg0.charAt(var3);
                if (var2 != ' ' || var4 != ' ') {
                    var1.append(var4);
                }
                var2 = var4;
            }
        }
        return var1.toString();
    }

    public static RDN[] rDNsFromString(String arg0, X500NameStyle arg1) {
        X500NameTokenizer var2 = new X500NameTokenizer(arg0);
        X500NameBuilder var3 = new X500NameBuilder(arg1);
        while (true) {
            while (true) {
                while (var2.hasMoreTokens()) {
                    String var4 = var2.nextToken();
                    if (var4.indexOf(43) > 0) {
                        X500NameTokenizer var5 = new X500NameTokenizer(var4, '+');
                        X500NameTokenizer var6 = new X500NameTokenizer(var5.nextToken(), '=');
                        String var7 = var6.nextToken();
                        if (!var6.hasMoreTokens()) {
                            throw new IllegalArgumentException("badly formatted directory string");
                        }
                        String var8 = var6.nextToken();
                        ASN1ObjectIdentifier var9 = arg1.attrNameToOID(var7.trim());
                        if (var5.hasMoreTokens()) {
                            Vector var10 = new Vector();
                            Vector var11 = new Vector();
                            var10.addElement(var9);
                            var11.addElement(unescape(var8));
                            while (var5.hasMoreTokens()) {
                                X500NameTokenizer var12 = new X500NameTokenizer(var5.nextToken(), '=');
                                String var13 = var12.nextToken();
                                if (!var12.hasMoreTokens()) {
                                    throw new IllegalArgumentException("badly formatted directory string");
                                }
                                String var14 = var12.nextToken();
                                ASN1ObjectIdentifier var15 = arg1.attrNameToOID(var13.trim());
                                var10.addElement(var15);
                                var11.addElement(unescape(var14));
                            }
                            var3.addMultiValuedRDN(toOIDArray(var10), toValueArray(var11));
                        } else {
                            var3.addRDN(var9, unescape(var8));
                        }
                    } else {
                        X500NameTokenizer var16 = new X500NameTokenizer(var4, '=');
                        String var17 = var16.nextToken();
                        if (!var16.hasMoreTokens()) {
                            throw new IllegalArgumentException("badly formatted directory string");
                        }
                        String var18 = var16.nextToken();
                        ASN1ObjectIdentifier var19 = arg1.attrNameToOID(var17.trim());
                        var3.addRDN(var19, unescape(var18));
                    }
                }
                return var3.build().getRDNs();
            }
        }
    }

    public static void appendRDN(StringBuffer arg0, RDN arg1, Hashtable arg2) {
        if (arg1.isMultiValued()) {
            AttributeTypeAndValue[] var3 = arg1.getTypesAndValues();
            boolean var4 = true;
            for (int var5 = 0; var5 != var3.length; var5++) {
                if (var4) {
                    var4 = false;
                } else {
                    arg0.append('+');
                }
                appendTypeAndValue(arg0, var3[var5], arg2);
            }
        } else if (arg1.getFirst() != null) {
            appendTypeAndValue(arg0, arg1.getFirst(), arg2);
        }
    }

    public static void appendTypeAndValue(StringBuffer arg0, AttributeTypeAndValue arg1, Hashtable arg2) {
        String var3 = (String) arg2.get(arg1.getType());
        if (var3 == null) {
            arg0.append(arg1.getType().getId());
        } else {
            arg0.append(var3);
        }
        arg0.append('=');
        arg0.append(valueToString(arg1.getValue()));
    }

    public static String valueToString(ASN1Encodable arg0) {
        StringBuffer var1 = new StringBuffer();
        if (arg0 instanceof ASN1String && !(arg0 instanceof DERUniversalString)) {
            String var2 = ((ASN1String) arg0).getString();
            if (var2.length() > 0 && var2.charAt(0) == '#') {
                var1.append("\\" + var2);
            } else {
                var1.append(var2);
            }
        } else {
            try {
                var1.append("#" + bytesToString(Hex.encode(arg0.toASN1Primitive().getEncoded("DER"))));
            } catch (IOException var8) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        }
        int var4 = var1.length();
        int var5 = 0;
        if (var1.length() >= 2 && var1.charAt(0) == '\\' && var1.charAt(1) == '#') {
            var5 += 2;
        }
        while (var4 != var5) {
            if (var1.charAt(var5) == ',' || var1.charAt(var5) == '"' || var1.charAt(var5) == '\\' || var1.charAt(var5) == '+' || var1.charAt(var5) == '=' || var1.charAt(var5) == '<' || var1.charAt(var5) == '>' || var1.charAt(var5) == ';') {
                var1.insert(var5, "\\");
                var5++;
                var4++;
            }
            var5++;
        }
        int var6 = 0;
        if (var1.length() > 0) {
            while (var1.length() > var6 && var1.charAt(var6) == ' ') {
                var1.insert(var6, "\\");
                var6 += 2;
            }
        }
        for (int var7 = var1.length() - 1; var7 >= 0 && var1.charAt(var7) == ' '; var7--) {
            var1.insert(var7, '\\');
        }
        return var1.toString();
    }

    public static boolean rDNAreEqual(RDN arg0, RDN arg1) {
        if (!arg0.isMultiValued()) {
            return arg1.isMultiValued() ? false : atvAreEqual(arg0.getFirst(), arg1.getFirst());
        } else if (arg1.isMultiValued()) {
            AttributeTypeAndValue[] var2 = arg0.getTypesAndValues();
            AttributeTypeAndValue[] var3 = arg1.getTypesAndValues();
            if (var2.length != var3.length) {
                return false;
            }
            for (int var4 = 0; var4 != var2.length; var4++) {
                if (!atvAreEqual(var2[var4], var3[var4])) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static String canonicalize(String arg0) {
        String var1 = Strings.toLowerCase(arg0);
        if (var1.length() > 0 && var1.charAt(0) == '#') {
            ASN1Primitive var2 = decodeObject(var1);
            if (var2 instanceof ASN1String) {
                var1 = Strings.toLowerCase(((ASN1String) var2).getString());
            }
        }
        if (var1.length() > 1) {
            int var3;
            for (var3 = 0; var3 + 1 < var1.length() && var1.charAt(var3) == '\\' && var1.charAt(var3 + 1) == ' '; var3 += 2) {
            }
            int var4;
            for (var4 = var1.length() - 1; var4 - 1 > 0 && var1.charAt(var4 - 1) == '\\' && var1.charAt(var4) == ' '; var4 -= 2) {
            }
            if (var3 > 0 || var4 < var1.length() - 1) {
                var1 = var1.substring(var3, var4 + 1);
            }
        }
        return stripInternalSpaces(var1);
    }

    public static ASN1Primitive decodeObject(String arg0) {
        try {
            return ASN1Primitive.fromByteArray(Hex.decode(arg0.substring(1)));
        } catch (IOException var2) {
            throw new IllegalStateException("unknown encoding in name: " + var2);
        }
    }

    public static String bytesToString(byte[] arg0) {
        char[] var1 = new char[arg0.length];
        for (int var2 = 0; var2 != var1.length; var2++) {
            var1[var2] = (char) (arg0[var2] & 0xFF);
        }
        return new String(var1);
    }

    public static ASN1ObjectIdentifier decodeAttrName(String arg0, Hashtable arg1) {
        if (Strings.toUpperCase(arg0).startsWith("OID.")) {
            return new ASN1ObjectIdentifier(arg0.substring(4));
        } else if (arg0.charAt(0) >= '0' && arg0.charAt(0) <= '9') {
            return new ASN1ObjectIdentifier(arg0);
        } else {
            ASN1ObjectIdentifier var2 = (ASN1ObjectIdentifier) arg1.get(Strings.toLowerCase(arg0));
            if (var2 == null) {
                throw new IllegalArgumentException("Unknown object id - " + arg0 + " - passed to distinguished name");
            }
            return var2;
        }
    }

    public static boolean atvAreEqual(AttributeTypeAndValue arg0, AttributeTypeAndValue arg1) {
        if (arg0 == arg1) {
            return true;
        } else if (arg0 == null) {
            return false;
        } else if (arg1 == null) {
            return false;
        } else {
            ASN1ObjectIdentifier var2 = arg0.getType();
            ASN1ObjectIdentifier var3 = arg1.getType();
            if (var2.equals(var3)) {
                String var4 = canonicalize(valueToString(arg0.getValue()));
                String var5 = canonicalize(valueToString(arg1.getValue()));
                return var4.equals(var5);
            } else {
                return false;
            }
        }
    }
}
