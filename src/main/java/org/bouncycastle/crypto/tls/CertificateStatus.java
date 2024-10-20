package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.ocsp.OCSPResponse;

public class CertificateStatus {

    public short statusType;

    public Object response;

    public static boolean isCorrectType(short arg0, Object arg1) {
        switch(arg0) {
            case 1:
                return arg1 instanceof OCSPResponse;
            default:
                throw new IllegalArgumentException("'statusType' is an unsupported value");
        }
    }

    public short getStatusType() {
        return this.statusType;
    }

    public Object getResponse() {
        return this.response;
    }

    public OCSPResponse getOCSPResponse() {
        if (!isCorrectType((short) 1, this.response)) {
            throw new IllegalStateException("'response' is not an OCSPResponse");
        }
        return (OCSPResponse) this.response;
    }

    public void encode(OutputStream arg0) throws IOException {
        TlsUtils.writeUint8(this.statusType, arg0);
        switch(this.statusType) {
            case 1:
                byte[] var2 = ((OCSPResponse) this.response).getEncoded("DER");
                TlsUtils.writeOpaque24(var2, arg0);
                return;
            default:
                throw new TlsFatalAlert((short) 80);
        }
    }

    public static CertificateStatus parse(InputStream arg0) throws IOException {
        short var1 = TlsUtils.readUint8(arg0);
        switch(var1) {
            case 1:
                byte[] var2 = TlsUtils.readOpaque24(arg0);
                OCSPResponse var3 = OCSPResponse.getInstance(TlsUtils.readDERObject(var2));
                return new CertificateStatus(var1, var3);
            default:
                throw new TlsFatalAlert((short) 50);
        }
    }

    public CertificateStatus(short arg0, Object arg1) {
        if (!isCorrectType(arg0, arg1)) {
            throw new IllegalArgumentException("'response' is not an instance of the correct type");
        }
        this.statusType = arg0;
        this.response = arg1;
    }
}
