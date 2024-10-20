package org.bouncycastle.crypto;

import java.math.BigInteger;

public interface BasicAgreement {

    int getFieldSize();

    void init(CipherParameters arg0);

    BigInteger calculateAgreement(CipherParameters arg0);
}
