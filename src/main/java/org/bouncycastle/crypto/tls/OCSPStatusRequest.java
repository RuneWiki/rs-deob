package org.bouncycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.bouncycastle.asn1.ocsp.ResponderID;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.util.io.Streams;

public class OCSPStatusRequest {

    public Vector responderIDList;

    public Extensions requestExtensions;

    public Extensions getRequestExtensions() {
        return this.requestExtensions;
    }

    public static OCSPStatusRequest parse(InputStream arg0) throws IOException {
        Vector var1 = new Vector();
        int var2 = TlsUtils.readUint16(arg0);
        if (var2 > 0) {
            byte[] var3 = TlsUtils.readFully(var2, arg0);
            ByteArrayInputStream var4 = new ByteArrayInputStream(var3);
            do {
                byte[] var5 = TlsUtils.readOpaque16(var4);
                ResponderID var6 = ResponderID.getInstance(TlsUtils.readDERObject(var5));
                var1.addElement(var6);
            } while (var4.available() > 0);
        }
        Extensions var7 = null;
        int var8 = TlsUtils.readUint16(arg0);
        if (var8 > 0) {
            byte[] var9 = TlsUtils.readFully(var8, arg0);
            var7 = Extensions.getInstance(TlsUtils.readDERObject(var9));
        }
        return new OCSPStatusRequest(var1, var7);
    }

    public Vector getResponderIDList() {
        return this.responderIDList;
    }

    public void encode(OutputStream arg0) throws IOException {
        if (this.responderIDList == null || this.responderIDList.isEmpty()) {
            TlsUtils.writeUint16(0, arg0);
        } else {
            ByteArrayOutputStream var2 = new ByteArrayOutputStream();
            for (int var3 = 0; var3 < this.responderIDList.size(); var3++) {
                ResponderID var4 = (ResponderID) this.responderIDList.elementAt(var3);
                byte[] var5 = var4.getEncoded("DER");
                TlsUtils.writeOpaque16(var5, var2);
            }
            TlsUtils.checkUint16(var2.size());
            TlsUtils.writeUint16(var2.size(), arg0);
            Streams.writeBufTo(var2, arg0);
        }
        if (this.requestExtensions == null) {
            TlsUtils.writeUint16(0, arg0);
        } else {
            byte[] var6 = this.requestExtensions.getEncoded("DER");
            TlsUtils.checkUint16(var6.length);
            TlsUtils.writeUint16(var6.length, arg0);
            arg0.write(var6);
        }
    }

    public OCSPStatusRequest(Vector arg0, Extensions arg1) {
        this.responderIDList = arg0;
        this.requestExtensions = arg1;
    }
}
