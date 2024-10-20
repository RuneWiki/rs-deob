package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.RandomGenerator;

public interface TlsContext {

    ProtocolVersion getServerVersion();

    SecureRandom getSecureRandom();

    SecurityParameters getSecurityParameters();

    boolean isServer();

    ProtocolVersion getClientVersion();

    byte[] exportKeyingMaterial(String arg0, byte[] arg1, int arg2);

    TlsSession getResumableSession();

    Object getUserObject();

    void setUserObject(Object arg0);

    RandomGenerator getNonceRandomGenerator();
}
