package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

public class ConstructedOctetStream extends InputStream {

    public boolean _first = true;

    public final ASN1StreamParser _parser;

    public InputStream _currentStream;

    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this._currentStream == null) {
            if (!this._first) {
                return -1;
            }
            ASN1OctetStringParser var4 = (ASN1OctetStringParser) this._parser.readObject();
            if (var4 == null) {
                return -1;
            }
            this._first = false;
            this._currentStream = var4.getOctetStream();
        }
        int var5 = 0;
        do {
            while (true) {
                int var6 = this._currentStream.read(arg0, arg1 + var5, arg2 - var5);
                if (var6 >= 0) {
                    var5 += var6;
                    break;
                }
                ASN1OctetStringParser var7 = (ASN1OctetStringParser) this._parser.readObject();
                if (var7 == null) {
                    this._currentStream = null;
                    return var5 < 1 ? -1 : var5;
                }
                this._currentStream = var7.getOctetStream();
            }
        } while (arg2 != var5);
        return var5;
    }

    public int read() throws IOException {
        if (this._currentStream == null) {
            if (!this._first) {
                return -1;
            }
            ASN1OctetStringParser var1 = (ASN1OctetStringParser) this._parser.readObject();
            if (var1 == null) {
                return -1;
            }
            this._first = false;
            this._currentStream = var1.getOctetStream();
        }
        while (true) {
            int var2 = this._currentStream.read();
            if (var2 >= 0) {
                return var2;
            }
            ASN1OctetStringParser var3 = (ASN1OctetStringParser) this._parser.readObject();
            if (var3 == null) {
                this._currentStream = null;
                return -1;
            }
            this._currentStream = var3.getOctetStream();
        }
    }

    public ConstructedOctetStream(ASN1StreamParser arg0) {
        this._parser = arg0;
    }
}
