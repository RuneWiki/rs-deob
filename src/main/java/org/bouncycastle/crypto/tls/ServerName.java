package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ServerName {

    public short nameType;

    public Object name;

    public String getHostName() {
        if (!isCorrectType((short) 0, this.name)) {
            throw new IllegalStateException("'name' is not a HostName string");
        }
        return (String) this.name;
    }

    public ServerName(short arg0, Object arg1) {
        if (!isCorrectType(arg0, arg1)) {
            throw new IllegalArgumentException("'name' is not an instance of the correct type");
        }
        this.nameType = arg0;
        this.name = arg1;
    }

    public Object getName() {
        return this.name;
    }

    public void encode(OutputStream arg0) throws IOException {
        TlsUtils.writeUint8(this.nameType, arg0);
        switch(this.nameType) {
            case 0:
                byte[] var2 = ((String) this.name).getBytes("ASCII");
                if (var2.length < 1) {
                    throw new TlsFatalAlert((short) 80);
                }
                TlsUtils.writeOpaque16(var2, arg0);
                return;
            default:
                throw new TlsFatalAlert((short) 80);
        }
    }

    public short getNameType() {
        return this.nameType;
    }

    public static ServerName parse(InputStream arg0) throws IOException {
        short var1 = TlsUtils.readUint8(arg0);
        switch(var1) {
            case 0:
                byte[] var2 = TlsUtils.readOpaque16(arg0);
                if (var2.length < 1) {
                    throw new TlsFatalAlert((short) 50);
                }
                String var3 = new String(var2, "ASCII");
                return new ServerName(var1, var3);
            default:
                throw new TlsFatalAlert((short) 50);
        }
    }

    public static boolean isCorrectType(short arg0, Object arg1) {
        switch(arg0) {
            case 0:
                return arg1 instanceof String;
            default:
                throw new IllegalArgumentException("'name' is an unsupported value");
        }
    }
}
