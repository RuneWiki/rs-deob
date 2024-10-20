package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class IndefiniteLengthInputStream extends LimitedInputStream {

    public boolean _eofReached = false;

    public boolean _eofOn00 = true;

    public int _b1;

    public int _b2;

    public IndefiniteLengthInputStream(InputStream arg0, int arg1) throws IOException {
        super(arg0, arg1);
        this._b1 = arg0.read();
        this._b2 = arg0.read();
        if (this._b2 < 0) {
            throw new EOFException();
        }
        this.checkForEof();
    }

    public void setEofOn00(boolean arg0) {
        this._eofOn00 = arg0;
        this.checkForEof();
    }

    public boolean checkForEof() {
        if (!this._eofReached && this._eofOn00 && this._b1 == 0 && this._b2 == 0) {
            this._eofReached = true;
            this.setParentEofDetect(true);
        }
        return this._eofReached;
    }

    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this._eofOn00 || arg2 < 3) {
            return super.read(arg0, arg1, arg2);
        } else if (this._eofReached) {
            return -1;
        } else {
            int var4 = this._in.read(arg0, arg1 + 2, arg2 - 2);
            if (var4 < 0) {
                throw new EOFException();
            }
            arg0[arg1] = (byte) this._b1;
            arg0[arg1 + 1] = (byte) this._b2;
            this._b1 = this._in.read();
            this._b2 = this._in.read();
            if (this._b2 < 0) {
                throw new EOFException();
            }
            return var4 + 2;
        }
    }

    public int read() throws IOException {
        if (this.checkForEof()) {
            return -1;
        }
        int var1 = this._in.read();
        if (var1 < 0) {
            throw new EOFException();
        }
        int var2 = this._b1;
        this._b1 = this._b2;
        this._b2 = var1;
        return var2;
    }
}
