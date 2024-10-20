package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CertificateStatusRequest {

    public short statusType;

    public Object request;

    public static boolean isCorrectType(short arg0, Object arg1) {
        switch(arg0) {
            case 1:
                return arg1 instanceof OCSPStatusRequest;
            default:
                throw new IllegalArgumentException("'statusType' is an unsupported value");
        }
    }

    public void encode(OutputStream arg0) throws IOException {
        TlsUtils.writeUint8(this.statusType, arg0);
        switch(this.statusType) {
            case 1:
                ((OCSPStatusRequest) this.request).encode(arg0);
                return;
            default:
                throw new TlsFatalAlert((short) 80);
        }
    }

    public short getStatusType() {
        return this.statusType;
    }

    public OCSPStatusRequest getOCSPStatusRequest() {
        if (!isCorrectType((short) 1, this.request)) {
            throw new IllegalStateException("'request' is not an OCSPStatusRequest");
        }
        return (OCSPStatusRequest) this.request;
    }

    public CertificateStatusRequest(short arg0, Object arg1) {
        if (!isCorrectType(arg0, arg1)) {
            throw new IllegalArgumentException("'request' is not an instance of the correct type");
        }
        this.statusType = arg0;
        this.request = arg1;
    }

    public static CertificateStatusRequest parse(InputStream arg0) throws IOException {
        short var1 = TlsUtils.readUint8(arg0);
        switch(var1) {
            case 1:
                OCSPStatusRequest var2 = OCSPStatusRequest.parse(arg0);
                return new CertificateStatusRequest(var1, var2);
            default:
                throw new TlsFatalAlert((short) 50);
        }
    }

    public Object getRequest() {
        return this.request;
    }
}
