package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.RandomGenerator;

public interface TlsContext {

    byte[] exportKeyingMaterial(String arg0, byte[] arg1, int arg2);

    SecureRandom getSecureRandom();

    TlsSession getResumableSession();

    boolean isServer();

    ProtocolVersion getClientVersion();

    ProtocolVersion getServerVersion();

    SecurityParameters getSecurityParameters();

    Object getUserObject();

    void setUserObject(Object arg0);

    RandomGenerator getNonceRandomGenerator();
}
