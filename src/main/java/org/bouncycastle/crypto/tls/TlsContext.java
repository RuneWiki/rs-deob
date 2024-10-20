package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.RandomGenerator;

public interface TlsContext {

    SecureRandom getSecureRandom();

    RandomGenerator getNonceRandomGenerator();

    byte[] exportKeyingMaterial(String arg0, byte[] arg1, int arg2);

    boolean isServer();

    ProtocolVersion getClientVersion();

    ProtocolVersion getServerVersion();

    TlsSession getResumableSession();

    Object getUserObject();

    void setUserObject(Object arg0);

    SecurityParameters getSecurityParameters();
}
