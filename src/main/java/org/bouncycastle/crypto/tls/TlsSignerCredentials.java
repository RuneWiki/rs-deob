package org.bouncycastle.crypto.tls;

import java.io.IOException;

public interface TlsSignerCredentials extends TlsCredentials {

    SignatureAndHashAlgorithm getSignatureAndHashAlgorithm();

    byte[] generateCertificateSignature(byte[] arg0) throws IOException;
}
