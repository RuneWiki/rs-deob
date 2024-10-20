package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.io.Streams;

public class DefiniteLengthInputStream extends LimitedInputStream {

    public static final byte[] EMPTY_BYTES = new byte[0];

    public final int _originalLength;

    public int _remaining;

    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this._remaining == 0) {
            return -1;
        }
        int var4 = Math.min(arg2, this._remaining);
        int var5 = this._in.read(arg0, arg1, var4);
        if (var5 < 0) {
            throw new EOFException("DEF length " + this._originalLength + " object truncated by " + this._remaining);
        }
        if ((this._remaining -= var5) == 0) {
            this.setParentEofDetect(true);
        }
        return var5;
    }

    public int getRemaining() {
        return this._remaining;
    }

    public byte[] toByteArray() throws IOException {
        if (this._remaining == 0) {
            return EMPTY_BYTES;
        }
        byte[] var1 = new byte[this._remaining];
        if ((this._remaining -= Streams.readFully(this._in, var1)) != 0) {
            throw new EOFException("DEF length " + this._originalLength + " object truncated by " + this._remaining);
        }
        this.setParentEofDetect(true);
        return var1;
    }

    public int read() throws IOException {
        if (this._remaining == 0) {
            return -1;
        }
        int var1 = this._in.read();
        if (var1 < 0) {
            throw new EOFException("DEF length " + this._originalLength + " object truncated by " + this._remaining);
        }
        if (--this._remaining == 0) {
            this.setParentEofDetect(true);
        }
        return var1;
    }

    public DefiniteLengthInputStream(InputStream arg0, int arg1) {
        super(arg0, arg1);
        if (arg1 < 0) {
            throw new IllegalArgumentException("negative lengths not allowed");
        }
        this._originalLength = arg1;
        this._remaining = arg1;
        if (arg1 == 0) {
            this.setParentEofDetect(true);
        }
    }
}
