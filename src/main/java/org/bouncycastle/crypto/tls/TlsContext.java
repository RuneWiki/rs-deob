package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.RandomGenerator;

public interface TlsContext {

    ProtocolVersion getServerVersion();

    SecureRandom getSecureRandom();

    SecurityParameters getSecurityParameters();

    Object getUserObject();

    RandomGenerator getNonceRandomGenerator();

    TlsSession getResumableSession();

    boolean isServer();

    ProtocolVersion getClientVersion();

    void setUserObject(Object arg0);

    byte[] exportKeyingMaterial(String arg0, byte[] arg1, int arg2);
}
