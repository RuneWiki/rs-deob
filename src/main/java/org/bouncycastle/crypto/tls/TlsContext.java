package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.RandomGenerator;

public interface TlsContext {

    RandomGenerator getNonceRandomGenerator();

    SecureRandom getSecureRandom();

    SecurityParameters getSecurityParameters();

    TlsSession getResumableSession();

    ProtocolVersion getClientVersion();

    ProtocolVersion getServerVersion();

    boolean isServer();

    Object getUserObject();

    byte[] exportKeyingMaterial(String arg0, byte[] arg1, int arg2);

    void setUserObject(Object arg0);
}
