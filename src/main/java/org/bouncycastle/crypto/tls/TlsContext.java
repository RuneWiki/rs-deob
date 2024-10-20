package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.RandomGenerator;

public interface TlsContext {

    Object getUserObject();

    SecureRandom getSecureRandom();

    ProtocolVersion getServerVersion();

    TlsSession getResumableSession();

    ProtocolVersion getClientVersion();

    boolean isServer();

    RandomGenerator getNonceRandomGenerator();

    void setUserObject(Object arg0);

    SecurityParameters getSecurityParameters();

    byte[] exportKeyingMaterial(String arg0, byte[] arg1, int arg2);
}
