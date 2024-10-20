package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class BERApplicationSpecific extends ASN1ApplicationSpecific {

    public BERApplicationSpecific(int arg0, ASN1Encodable arg1) throws IOException {
        this(true, arg0, arg1);
    }

    public static byte[] getEncodedVector(ASN1EncodableVector arg0) {
        ByteArrayOutputStream var1 = new ByteArrayOutputStream();
        for (int var2 = 0; var2 != arg0.size(); var2++) {
            try {
                var1.write(((ASN1Object) arg0.get(var2)).getEncoded("BER"));
            } catch (IOException var4) {
                throw new ASN1ParsingException("malformed object: " + var4, var4);
            }
        }
        return var1.toByteArray();
    }

    public BERApplicationSpecific(boolean arg0, int arg1, ASN1Encodable arg2) throws IOException {
        super(arg0 || arg2.toASN1Primitive().isConstructed(), arg1, getEncoding(arg0, arg2));
    }

    public static byte[] getEncoding(boolean arg0, ASN1Encodable arg1) throws IOException {
        byte[] var2 = arg1.toASN1Primitive().getEncoded("BER");
        if (arg0) {
            return var2;
        } else {
            int var3 = getLengthOfHeader(var2);
            byte[] var4 = new byte[var2.length - var3];
            System.arraycopy(var2, var3, var4, 0, var4.length);
            return var4;
        }
    }

    public BERApplicationSpecific(int arg0, ASN1EncodableVector arg1) {
        super(true, arg0, getEncodedVector(arg1));
    }

    public BERApplicationSpecific(boolean arg0, int arg1, byte[] arg2) {
        super(arg0, arg1, arg2);
    }

    public void encode(ASN1OutputStream arg0) throws IOException {
        int var2 = 64;
        if (this.isConstructed) {
            var2 |= 0x20;
        }
        arg0.writeTag(var2, this.tag);
        arg0.write(128);
        arg0.write(this.octets);
        arg0.write(0);
        arg0.write(0);
    }
}
