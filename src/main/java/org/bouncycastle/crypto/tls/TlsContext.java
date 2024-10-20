package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.RandomGenerator;

public interface TlsContext {

    void setUserObject(Object arg0);

    TlsSession getResumableSession();

    SecurityParameters getSecurityParameters();

    boolean isServer();

    ProtocolVersion getClientVersion();

    ProtocolVersion getServerVersion();

    RandomGenerator getNonceRandomGenerator();

    Object getUserObject();

    SecureRandom getSecureRandom();

    byte[] exportKeyingMaterial(String arg0, byte[] arg1, int arg2);
}
