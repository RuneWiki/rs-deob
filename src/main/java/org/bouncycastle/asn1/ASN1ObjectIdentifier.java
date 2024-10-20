package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.bouncycastle.util.Arrays;

public class ASN1ObjectIdentifier extends ASN1Primitive {

    public final String identifier;

    public byte[] body;

    public static final ConcurrentMap pool = new ConcurrentHashMap();

    public static final long LONG_LIMIT = 72057594037927808L;

    public boolean on(ASN1ObjectIdentifier arg0) {
        String var2 = this.getId();
        String var3 = arg0.getId();
        return var2.length() > var3.length() && var2.charAt(var3.length()) == '.' && var2.startsWith(var3);
    }

    public static ASN1ObjectIdentifier getInstance(ASN1TaggedObject arg0, boolean arg1) {
        ASN1Primitive var2 = arg0.getObject();
        return arg1 || (var2 instanceof ASN1ObjectIdentifier) ? getInstance(var2) : fromOctetString(ASN1OctetString.getInstance(arg0.getObject()).getOctets());
    }

    public static ASN1ObjectIdentifier fromOctetString(byte[] arg0) {
        ASN1ObjectIdentifier.OidHandle var1 = new ASN1ObjectIdentifier.OidHandle(arg0);
        ASN1ObjectIdentifier var2 = (ASN1ObjectIdentifier) pool.get(var1);
        return var2 == null ? new ASN1ObjectIdentifier(arg0) : var2;
    }

    public ASN1ObjectIdentifier(String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("'identifier' cannot be null");
        } else if (isValidIdentifier(arg0)) {
            this.identifier = arg0;
        } else {
            throw new IllegalArgumentException("string " + arg0 + " not an OID");
        }
    }

    public int encodedLength() throws IOException {
        int var1 = this.getBody().length;
        return 1 + StreamUtil.calculateBodyLength(var1) + var1;
    }

    public String getId() {
        return this.identifier;
    }

    public ASN1ObjectIdentifier branch(String arg0) {
        return new ASN1ObjectIdentifier(this, arg0);
    }

    public ASN1ObjectIdentifier(byte[] arg0) {
        StringBuffer var2 = new StringBuffer();
        long var3 = 0L;
        BigInteger var5 = null;
        boolean var6 = true;
        for (int var7 = 0; var7 != arg0.length; var7++) {
            int var8 = arg0[var7] & 0xFF;
            if (var3 <= 72057594037927808L) {
                long var9 = (long) (var8 & 0x7F) + var3;
                if ((var8 & 0x80) == 0) {
                    if (var6) {
                        if (var9 < 40L) {
                            var2.append('0');
                        } else if (var9 < 80L) {
                            var2.append('1');
                            var9 -= 40L;
                        } else {
                            var2.append('2');
                            var9 -= 80L;
                        }
                        var6 = false;
                    }
                    var2.append('.');
                    var2.append(var9);
                    var3 = 0L;
                } else {
                    var3 = var9 << 7;
                }
            } else {
                if (var5 == null) {
                    var5 = BigInteger.valueOf(var3);
                }
                BigInteger var11 = var5.or(BigInteger.valueOf((long) (var8 & 0x7F)));
                if ((var8 & 0x80) == 0) {
                    if (var6) {
                        var2.append('2');
                        var11 = var11.subtract(BigInteger.valueOf(80L));
                        var6 = false;
                    }
                    var2.append('.');
                    var2.append(var11);
                    var5 = null;
                    var3 = 0L;
                } else {
                    var5 = var11.shiftLeft(7);
                }
            }
        }
        this.identifier = var2.toString();
        this.body = Arrays.clone(arg0);
    }

    public void writeField(ByteArrayOutputStream arg0, long arg1) {
        byte[] var4 = new byte[9];
        int var5 = 8;
        var4[var5] = (byte) ((int) arg1 & 0x7F);
        while (arg1 >= 128L) {
            arg1 >>= 0x7;
            var5--;
            var4[var5] = (byte) ((int) arg1 & 0x7F | 0x80);
        }
        arg0.write(var4, var5, 9 - var5);
    }

    public void writeField(ByteArrayOutputStream arg0, BigInteger arg1) {
        int var3 = (arg1.bitLength() + 6) / 7;
        if (var3 == 0) {
            arg0.write(0);
            return;
        }
        BigInteger var4 = arg1;
        byte[] var5 = new byte[var3];
        for (int var6 = var3 - 1; var6 >= 0; var6--) {
            var5[var6] = (byte) (var4.intValue() & 0x7F | 0x80);
            var4 = var4.shiftRight(7);
        }
        var5[var3 - 1] = (byte) (var5[var3 - 1] & 0x7F);
        arg0.write(var5, 0, var5.length);
    }

    public void doOutput(ByteArrayOutputStream arg0) {
        OIDTokenizer var2 = new OIDTokenizer(this.identifier);
        int var3 = Integer.parseInt(var2.nextToken()) * 40;
        String var4 = var2.nextToken();
        if (var4.length() <= 18) {
            this.writeField(arg0, (long) var3 + Long.parseLong(var4));
        } else {
            this.writeField(arg0, (new BigInteger(var4)).add(BigInteger.valueOf((long) var3)));
        }
        while (var2.hasMoreTokens()) {
            String var5 = var2.nextToken();
            if (var5.length() <= 18) {
                this.writeField(arg0, Long.parseLong(var5));
            } else {
                this.writeField(arg0, new BigInteger(var5));
            }
        }
    }

    public int aja() {
        return this.identifier.hashCode();
    }

    public boolean isConstructed() {
        return false;
    }

    public String ajz() {
        return this.getId();
    }

    public void encode(ASN1OutputStream arg0) throws IOException {
        byte[] var2 = this.getBody();
        arg0.write(6);
        arg0.writeLength(var2.length);
        arg0.write(var2);
    }

    public int hashCode() {
        return this.identifier.hashCode();
    }

    public boolean asn1Equals(ASN1Primitive arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof ASN1ObjectIdentifier)) {
            return this.identifier.equals(((ASN1ObjectIdentifier) arg0).identifier);
        } else {
            return false;
        }
    }

    public String toString() {
        return this.getId();
    }

    public static boolean isValidBranchID(String arg0, int arg1) {
        boolean var2 = false;
        int var3 = arg0.length();
        while (true) {
            while (true) {
                var3--;
                if (var3 < arg1) {
                    return var2;
                }
                char var4 = arg0.charAt(var3);
                if ('0' <= var4 && var4 <= '9') {
                    var2 = true;
                } else if (var4 == '.') {
                    if (!var2) {
                        return false;
                    }
                    var2 = false;
                } else {
                    return false;
                }
            }
        }
    }

    public static boolean isValidIdentifier(String arg0) {
        if (arg0.length() >= 3 && arg0.charAt(1) == '.') {
            char var1 = arg0.charAt(0);
            return var1 >= '0' && var1 <= '2' ? isValidBranchID(arg0, 2) : false;
        } else {
            return false;
        }
    }

    public ASN1ObjectIdentifier intern() {
        ASN1ObjectIdentifier.OidHandle var1 = new ASN1ObjectIdentifier.OidHandle(this.getBody());
        ASN1ObjectIdentifier var2 = (ASN1ObjectIdentifier) pool.get(var1);
        if (var2 == null) {
            var2 = (ASN1ObjectIdentifier) pool.putIfAbsent(var1, this);
            if (var2 == null) {
                var2 = this;
            }
        }
        return var2;
    }

    public synchronized byte[] getBody() {
        if (this.body == null) {
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            this.doOutput(var1);
            this.body = var1.toByteArray();
        }
        return this.body;
    }

    public int ajj() {
        return this.identifier.hashCode();
    }

    public static ASN1ObjectIdentifier getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof ASN1ObjectIdentifier)) {
            return (ASN1ObjectIdentifier) arg0;
        } else if (arg0 instanceof ASN1Encodable && ((ASN1Encodable) arg0).toASN1Primitive() instanceof ASN1ObjectIdentifier) {
            return (ASN1ObjectIdentifier) ((ASN1Encodable) arg0).toASN1Primitive();
        } else if (arg0 instanceof byte[]) {
            byte[] var1 = (byte[]) ((byte[]) arg0);
            try {
                return (ASN1ObjectIdentifier) fromByteArray(var1);
            } catch (IOException var3) {
                throw new IllegalArgumentException("failed to construct object identifier from byte[]: " + var3.getMessage());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + arg0.getClass().getName());
        }
    }

    public int ajd() {
        return this.identifier.hashCode();
    }

    public String ajv() {
        return this.getId();
    }

    public ASN1ObjectIdentifier(ASN1ObjectIdentifier arg0, String arg1) {
        if (!isValidBranchID(arg1, 0)) {
            throw new IllegalArgumentException("string " + arg1 + " not a valid OID branch");
        }
        this.identifier = arg0.getId() + "." + arg1;
    }

    static class OidHandle {

        public final int key;

        public final byte[] enc;

        public int aja() {
            return this.key;
        }

        public int ajj() {
            return this.key;
        }

        public boolean equals(Object arg0) {
            return arg0 instanceof ASN1ObjectIdentifier.OidHandle ? Arrays.areEqual(this.enc, ((ASN1ObjectIdentifier.OidHandle) arg0).enc) : false;
        }

        public boolean gi(Object arg0) {
            return arg0 instanceof ASN1ObjectIdentifier.OidHandle ? Arrays.areEqual(this.enc, ((ASN1ObjectIdentifier.OidHandle) arg0).enc) : false;
        }

        public int hashCode() {
            return this.key;
        }

        public OidHandle(byte[] arg0) {
            this.key = Arrays.hashCode(arg0);
            this.enc = arg0;
        }

        public int ajd() {
            return this.key;
        }
    }
}
