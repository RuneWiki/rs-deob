package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.RandomGenerator;

public interface TlsContext {

    SecurityParameters getSecurityParameters();

    RandomGenerator getNonceRandomGenerator();

    SecureRandom getSecureRandom();

    boolean isServer();

    ProtocolVersion getClientVersion();

    ProtocolVersion getServerVersion();

    TlsSession getResumableSession();

    Object getUserObject();

    void setUserObject(Object arg0);

    byte[] exportKeyingMaterial(String arg0, byte[] arg1, int arg2);
}
