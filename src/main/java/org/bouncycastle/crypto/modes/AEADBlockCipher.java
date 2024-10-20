package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;

public interface AEADBlockCipher {

    void processAADBytes(byte[] arg0, int arg1, int arg2);

    String getAlgorithmName();

    void init(boolean arg0, CipherParameters arg1) throws IllegalArgumentException;

    int doFinal(byte[] arg0, int arg1) throws IllegalStateException, InvalidCipherTextException;

    BlockCipher getUnderlyingCipher();

    int processByte(byte arg0, byte[] arg1, int arg2) throws DataLengthException;

    int processBytes(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws DataLengthException;

    void processAADByte(byte arg0);

    byte[] getMac();

    int getUpdateOutputSize(int arg0);

    int getOutputSize(int arg0);

    void reset();
}
