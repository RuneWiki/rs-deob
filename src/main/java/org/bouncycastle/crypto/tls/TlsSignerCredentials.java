package org.bouncycastle.crypto.tls;

import java.io.IOException;

public interface TlsSignerCredentials extends TlsCredentials {

    byte[] generateCertificateSignature(byte[] arg0) throws IOException;

    SignatureAndHashAlgorithm getSignatureAndHashAlgorithm();
}
