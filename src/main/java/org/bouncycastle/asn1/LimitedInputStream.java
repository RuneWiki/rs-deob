package org.bouncycastle.asn1;

import java.io.InputStream;

public abstract class LimitedInputStream extends InputStream {

    public final InputStream _in;

    public int _limit;

    public int getRemaining() {
        return this._limit;
    }

    public void setParentEofDetect(boolean arg0) {
        if (this._in instanceof IndefiniteLengthInputStream) {
            ((IndefiniteLengthInputStream) this._in).setEofOn00(arg0);
        }
    }

    public LimitedInputStream(InputStream arg0, int arg1) {
        this._in = arg0;
        this._limit = arg1;
    }
}
