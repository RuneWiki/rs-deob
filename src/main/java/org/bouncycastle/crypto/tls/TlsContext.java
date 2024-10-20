package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.RandomGenerator;

public interface TlsContext {

    Object getUserObject();

    SecureRandom getSecureRandom();

    boolean isServer();

    void setUserObject(Object arg0);

    ProtocolVersion getClientVersion();

    RandomGenerator getNonceRandomGenerator();

    TlsSession getResumableSession();

    ProtocolVersion getServerVersion();

    SecurityParameters getSecurityParameters();

    byte[] exportKeyingMaterial(String arg0, byte[] arg1, int arg2);
}
