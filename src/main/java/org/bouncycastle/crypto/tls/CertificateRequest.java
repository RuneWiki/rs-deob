package org.bouncycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x500.X500Name;

public class CertificateRequest {

    public short[] certificateTypes;

    public Vector supportedSignatureAlgorithms;

    public Vector certificateAuthorities;

    public short[] getCertificateTypes() {
        return this.certificateTypes;
    }

    public static CertificateRequest parse(TlsContext arg0, InputStream arg1) throws IOException {
        short var2 = TlsUtils.readUint8(arg1);
        short[] var3 = new short[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = TlsUtils.readUint8(arg1);
        }
        Vector var5 = null;
        if (TlsUtils.isTLSv12(arg0)) {
            var5 = TlsUtils.parseSupportedSignatureAlgorithms(false, arg1);
        }
        Vector var6 = new Vector();
        byte[] var7 = TlsUtils.readOpaque16(arg1);
        ByteArrayInputStream var8 = new ByteArrayInputStream(var7);
        while (var8.available() > 0) {
            byte[] var9 = TlsUtils.readOpaque16(var8);
            ASN1Primitive var10 = TlsUtils.readDERObject(var9);
            var6.addElement(X500Name.getInstance(var10));
        }
        return new CertificateRequest(var3, var5, var6);
    }

    public Vector getSupportedSignatureAlgorithms() {
        return this.supportedSignatureAlgorithms;
    }

    public Vector getCertificateAuthorities() {
        return this.certificateAuthorities;
    }

    public void encode(OutputStream arg0) throws IOException {
        if (this.certificateTypes == null || this.certificateTypes.length == 0) {
            TlsUtils.writeUint8((int) 0, arg0);
        } else {
            TlsUtils.writeUint8ArrayWithUint8Length(this.certificateTypes, arg0);
        }
        if (this.supportedSignatureAlgorithms != null) {
            TlsUtils.encodeSupportedSignatureAlgorithms(this.supportedSignatureAlgorithms, false, arg0);
        }
        if (this.certificateAuthorities == null || this.certificateAuthorities.isEmpty()) {
            TlsUtils.writeUint16(0, arg0);
            return;
        }
        Vector var2 = new Vector(this.certificateAuthorities.size());
        int var3 = 0;
        for (int var4 = 0; var4 < this.certificateAuthorities.size(); var4++) {
            X500Name var5 = (X500Name) this.certificateAuthorities.elementAt(var4);
            byte[] var6 = var5.getEncoded("DER");
            var2.addElement(var6);
            var3 += var6.length + 2;
        }
        TlsUtils.checkUint16(var3);
        TlsUtils.writeUint16(var3, arg0);
        for (int var7 = 0; var7 < var2.size(); var7++) {
            byte[] var8 = (byte[]) ((byte[]) var2.elementAt(var7));
            TlsUtils.writeOpaque16(var8, arg0);
        }
    }

    public CertificateRequest(short[] arg0, Vector arg1, Vector arg2) {
        this.certificateTypes = arg0;
        this.supportedSignatureAlgorithms = arg1;
        this.certificateAuthorities = arg2;
    }
}
