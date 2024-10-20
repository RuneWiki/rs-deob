package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.RandomGenerator;

public interface TlsContext {

    SecurityParameters getSecurityParameters();

    TlsSession getResumableSession();

    SecureRandom getSecureRandom();

    boolean isServer();

    ProtocolVersion getClientVersion();

    ProtocolVersion getServerVersion();

    Object getUserObject();

    RandomGenerator getNonceRandomGenerator();

    void setUserObject(Object arg0);

    byte[] exportKeyingMaterial(String arg0, byte[] arg1, int arg2);
}
