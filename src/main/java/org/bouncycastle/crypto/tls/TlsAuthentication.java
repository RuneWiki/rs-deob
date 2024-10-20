package org.bouncycastle.crypto.tls;

import java.io.IOException;

public interface TlsAuthentication {

    TlsCredentials getClientCredentials(CertificateRequest arg0) throws IOException;

    void notifyServerCertificate(Certificate arg0) throws IOException;
}
