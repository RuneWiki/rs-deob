package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.RandomGenerator;

public interface TlsContext {

    ProtocolVersion getServerVersion();

    SecureRandom getSecureRandom();

    SecurityParameters getSecurityParameters();

    RandomGenerator getNonceRandomGenerator();

    boolean isServer();

    TlsSession getResumableSession();

    ProtocolVersion getClientVersion();

    Object getUserObject();

    void setUserObject(Object arg0);

    byte[] exportKeyingMaterial(String arg0, byte[] arg1, int arg2);
}
