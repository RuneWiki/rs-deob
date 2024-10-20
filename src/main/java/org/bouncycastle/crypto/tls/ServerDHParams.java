package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;

public class ServerDHParams {

    public DHPublicKeyParameters publicKey;

    public void encode(OutputStream arg0) throws IOException {
        DHParameters var2 = this.publicKey.getParameters();
        BigInteger var3 = this.publicKey.getY();
        TlsDHUtils.writeDHParameter(var2.getP(), arg0);
        TlsDHUtils.writeDHParameter(var2.getG(), arg0);
        TlsDHUtils.writeDHParameter(var3, arg0);
    }

    public DHPublicKeyParameters getPublicKey() {
        return this.publicKey;
    }

    public ServerDHParams(DHPublicKeyParameters arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("'publicKey' cannot be null");
        }
        this.publicKey = arg0;
    }

    public static ServerDHParams parse(InputStream arg0) throws IOException {
        BigInteger var1 = TlsDHUtils.readDHParameter(arg0);
        BigInteger var2 = TlsDHUtils.readDHParameter(arg0);
        BigInteger var3 = TlsDHUtils.readDHParameter(arg0);
        return new ServerDHParams(TlsDHUtils.validateDHPublicKey(new DHPublicKeyParameters(var3, new DHParameters(var1, var2))));
    }
}
