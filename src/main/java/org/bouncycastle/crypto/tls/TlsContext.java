package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.RandomGenerator;

public interface TlsContext {

    TlsSession getResumableSession();

    RandomGenerator getNonceRandomGenerator();

    byte[] exportKeyingMaterial(String arg0, byte[] arg1, int arg2);

    SecurityParameters getSecurityParameters();

    ProtocolVersion getClientVersion();

    ProtocolVersion getServerVersion();

    Object getUserObject();

    boolean isServer();

    void setUserObject(Object arg0);

    SecureRandom getSecureRandom();
}
