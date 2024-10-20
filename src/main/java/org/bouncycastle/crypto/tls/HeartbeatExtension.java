package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class HeartbeatExtension {

    public short mode;

    public HeartbeatExtension(short arg0) {
        if (!HeartbeatMode.isValid(arg0)) {
            throw new IllegalArgumentException("'mode' is not a valid HeartbeatMode value");
        }
        this.mode = arg0;
    }

    public short getMode() {
        return this.mode;
    }

    public static HeartbeatExtension parse(InputStream arg0) throws IOException {
        short var1 = TlsUtils.readUint8(arg0);
        if (!HeartbeatMode.isValid(var1)) {
            throw new TlsFatalAlert((short) 47);
        }
        return new HeartbeatExtension(var1);
    }

    public void encode(OutputStream arg0) throws IOException {
        TlsUtils.writeUint8(this.mode, arg0);
    }
}
