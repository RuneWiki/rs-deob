package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.RandomGenerator;

public interface TlsContext {

    RandomGenerator getNonceRandomGenerator();

    SecurityParameters getSecurityParameters();

    ProtocolVersion getServerVersion();

    boolean isServer();

    ProtocolVersion getClientVersion();

    SecureRandom getSecureRandom();

    TlsSession getResumableSession();

    Object getUserObject();

    void setUserObject(Object arg0);

    byte[] exportKeyingMaterial(String arg0, byte[] arg1, int arg2);
}
