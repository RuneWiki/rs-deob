package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.RandomGenerator;

public interface TlsContext {

    byte[] exportKeyingMaterial(String arg0, byte[] arg1, int arg2);

    RandomGenerator getNonceRandomGenerator();

    void setUserObject(Object arg0);

    SecureRandom getSecureRandom();

    ProtocolVersion getClientVersion();

    ProtocolVersion getServerVersion();

    TlsSession getResumableSession();

    Object getUserObject();

    SecurityParameters getSecurityParameters();

    boolean isServer();
}
