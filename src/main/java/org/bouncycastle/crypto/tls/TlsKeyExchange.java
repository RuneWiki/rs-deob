package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface TlsKeyExchange {

    void skipClientCredentials() throws IOException;

    void skipServerCredentials() throws IOException;

    void processClientKeyExchange(InputStream arg0) throws IOException;

    void processClientCertificate(Certificate arg0) throws IOException;

    boolean requiresServerKeyExchange();

    byte[] generateServerKeyExchange() throws IOException;

    void skipServerKeyExchange() throws IOException;

    void processServerKeyExchange(InputStream arg0) throws IOException;

    void validateCertificateRequest(CertificateRequest arg0) throws IOException;

    void generateClientKeyExchange(OutputStream arg0) throws IOException;

    void processClientCredentials(TlsCredentials arg0) throws IOException;

    void init(TlsContext arg0);

    void processServerCredentials(TlsCredentials arg0) throws IOException;

    void processServerCertificate(Certificate arg0) throws IOException;

    byte[] generatePremasterSecret() throws IOException;
}
