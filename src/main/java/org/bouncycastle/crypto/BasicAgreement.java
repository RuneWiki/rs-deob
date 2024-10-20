package org.bouncycastle.crypto;

import java.math.BigInteger;

public interface BasicAgreement {

    BigInteger calculateAgreement(CipherParameters arg0);

    int getFieldSize();

    void init(CipherParameters arg0);
}
