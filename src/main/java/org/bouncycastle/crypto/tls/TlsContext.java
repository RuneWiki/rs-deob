package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.RandomGenerator;

public interface TlsContext {

    SecurityParameters getSecurityParameters();

    SecureRandom getSecureRandom();

    TlsSession getResumableSession();

    ProtocolVersion getServerVersion();

    ProtocolVersion getClientVersion();

    Object getUserObject();

    boolean isServer();

    void setUserObject(Object arg0);

    RandomGenerator getNonceRandomGenerator();

    byte[] exportKeyingMaterial(String arg0, byte[] arg1, int arg2);
}
