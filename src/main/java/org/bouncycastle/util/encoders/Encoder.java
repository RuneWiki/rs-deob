package org.bouncycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;

public interface Encoder {

    int encode(byte[] arg0, int arg1, int arg2, OutputStream arg3) throws IOException;

    int decode(byte[] arg0, int arg1, int arg2, OutputStream arg3) throws IOException;

    int decode(String arg0, OutputStream arg1) throws IOException;
}
