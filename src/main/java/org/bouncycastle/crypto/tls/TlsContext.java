package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.RandomGenerator;

public interface TlsContext {

    ProtocolVersion getClientVersion();

    SecureRandom getSecureRandom();

    Object getUserObject();

    boolean isServer();

    byte[] exportKeyingMaterial(String arg0, byte[] arg1, int arg2);

    SecurityParameters getSecurityParameters();

    TlsSession getResumableSession();

    ProtocolVersion getServerVersion();

    void setUserObject(Object arg0);

    RandomGenerator getNonceRandomGenerator();
}
