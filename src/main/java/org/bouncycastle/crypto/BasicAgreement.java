package org.bouncycastle.crypto;

import java.math.BigInteger;

public interface BasicAgreement {

    void init(CipherParameters arg0);

    int getFieldSize();

    BigInteger calculateAgreement(CipherParameters arg0);
}
