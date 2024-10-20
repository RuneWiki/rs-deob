package org.bouncycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Primitive;

public class Certificate {

    public org.bouncycastle.asn1.x509.Certificate[] certificateList;

    public static final Certificate EMPTY_CHAIN = new Certificate(new org.bouncycastle.asn1.x509.Certificate[0]);

    public org.bouncycastle.asn1.x509.Certificate getCertificateAt(int arg0) {
        return this.certificateList[arg0];
    }

    public org.bouncycastle.asn1.x509.Certificate[] getCertificateList() {
        return this.cloneCertificateList();
    }

    public org.bouncycastle.asn1.x509.Certificate[] cloneCertificateList() {
        org.bouncycastle.asn1.x509.Certificate[] var1 = new org.bouncycastle.asn1.x509.Certificate[this.certificateList.length];
        System.arraycopy(this.certificateList, 0, var1, 0, var1.length);
        return var1;
    }

    public static Certificate parse(InputStream arg0) throws IOException {
        int var1 = TlsUtils.readUint24(arg0);
        if (var1 == 0) {
            return EMPTY_CHAIN;
        }
        byte[] var2 = TlsUtils.readFully(var1, arg0);
        ByteArrayInputStream var3 = new ByteArrayInputStream(var2);
        Vector var4 = new Vector();
        while (var3.available() > 0) {
            byte[] var5 = TlsUtils.readOpaque24(var3);
            ASN1Primitive var6 = TlsUtils.readDERObject(var5);
            var4.addElement(org.bouncycastle.asn1.x509.Certificate.getInstance(var6));
        }
        org.bouncycastle.asn1.x509.Certificate[] var7 = new org.bouncycastle.asn1.x509.Certificate[var4.size()];
        for (int var8 = 0; var8 < var4.size(); var8++) {
            var7[var8] = (org.bouncycastle.asn1.x509.Certificate) var4.elementAt(var8);
        }
        return new Certificate(var7);
    }

    public boolean isEmpty() {
        return this.certificateList.length == 0;
    }

    public void encode(OutputStream arg0) throws IOException {
        Vector var2 = new Vector(this.certificateList.length);
        int var3 = 0;
        for (int var4 = 0; var4 < this.certificateList.length; var4++) {
            byte[] var5 = this.certificateList[var4].getEncoded("DER");
            var2.addElement(var5);
            var3 += var5.length + 3;
        }
        TlsUtils.checkUint24(var3);
        TlsUtils.writeUint24(var3, arg0);
        for (int var6 = 0; var6 < var2.size(); var6++) {
            byte[] var7 = (byte[]) ((byte[]) var2.elementAt(var6));
            TlsUtils.writeOpaque24(var7, arg0);
        }
    }

    public int getLength() {
        return this.certificateList.length;
    }

    public Certificate(org.bouncycastle.asn1.x509.Certificate[] arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("'certificateList' cannot be null");
        }
        this.certificateList = arg0;
    }
}
