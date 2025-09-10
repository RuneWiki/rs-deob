package org.bouncycastle.crypto;

public interface Digest {

	int getDigestSize();

	void reset();

	String getAlgorithmName();

	void update(byte[] arg0, int arg1, int arg2);

	void update(byte arg0);

	int doFinal(byte[] arg0, int arg1);
}
