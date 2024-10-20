package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.RandomGenerator;

public interface TlsContext {

    void setUserObject(Object arg0);

    RandomGenerator getNonceRandomGenerator();

    ProtocolVersion getServerVersion();

    boolean isServer();

    ProtocolVersion getClientVersion();

    TlsSession getResumableSession();

    SecurityParameters getSecurityParameters();

    Object getUserObject();

    SecureRandom getSecureRandom();

    byte[] exportKeyingMaterial(String arg0, byte[] arg1, int arg2);
}
