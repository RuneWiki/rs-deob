package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.RandomGenerator;

public interface TlsContext {

    RandomGenerator getNonceRandomGenerator();

    SecureRandom getSecureRandom();

    boolean isServer();

    TlsSession getResumableSession();

    ProtocolVersion getClientVersion();

    ProtocolVersion getServerVersion();

    SecurityParameters getSecurityParameters();

    Object getUserObject();

    void setUserObject(Object arg0);

    byte[] exportKeyingMaterial(String arg0, byte[] arg1, int arg2);
}
