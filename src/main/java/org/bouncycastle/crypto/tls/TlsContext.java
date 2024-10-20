package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.RandomGenerator;

public interface TlsContext {

    boolean isServer();

    SecureRandom getSecureRandom();

    SecurityParameters getSecurityParameters();

    byte[] exportKeyingMaterial(String arg0, byte[] arg1, int arg2);

    ProtocolVersion getClientVersion();

    ProtocolVersion getServerVersion();

    TlsSession getResumableSession();

    RandomGenerator getNonceRandomGenerator();

    Object getUserObject();

    void setUserObject(Object arg0);
}
