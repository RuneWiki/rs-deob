package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.RandomGenerator;

public interface TlsContext {

    SecureRandom getSecureRandom();

    byte[] exportKeyingMaterial(String arg0, byte[] arg1, int arg2);

    RandomGenerator getNonceRandomGenerator();

    boolean isServer();

    void setUserObject(Object arg0);

    ProtocolVersion getServerVersion();

    ProtocolVersion getClientVersion();

    Object getUserObject();

    SecurityParameters getSecurityParameters();

    TlsSession getResumableSession();
}
