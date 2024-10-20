package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;

public interface AEADBlockCipher {

    String getAlgorithmName();

    byte[] getMac();

    BlockCipher getUnderlyingCipher();

    int processByte(byte arg0, byte[] arg1, int arg2) throws DataLengthException;

    void processAADBytes(byte[] arg0, int arg1, int arg2);

    void reset();

    int processBytes(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws DataLengthException;

    int doFinal(byte[] arg0, int arg1) throws IllegalStateException, InvalidCipherTextException;

    void processAADByte(byte arg0);

    int getUpdateOutputSize(int arg0);

    int getOutputSize(int arg0);

    void init(boolean arg0, CipherParameters arg1) throws IllegalArgumentException;
}
