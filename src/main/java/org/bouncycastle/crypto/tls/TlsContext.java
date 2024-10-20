package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.RandomGenerator;

public interface TlsContext {

    byte[] exportKeyingMaterial(String arg0, byte[] arg1, int arg2);

    SecureRandom getSecureRandom();

    RandomGenerator getNonceRandomGenerator();

    Object getUserObject();

    ProtocolVersion getClientVersion();

    SecurityParameters getSecurityParameters();

    boolean isServer();

    ProtocolVersion getServerVersion();

    void setUserObject(Object arg0);

    TlsSession getResumableSession();
}
