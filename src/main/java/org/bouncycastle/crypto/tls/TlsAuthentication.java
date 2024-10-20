package org.bouncycastle.crypto.tls;

import java.io.IOException;

public interface TlsAuthentication {

    void notifyServerCertificate(Certificate arg0) throws IOException;

    TlsCredentials getClientCredentials(CertificateRequest arg0) throws IOException;
}
