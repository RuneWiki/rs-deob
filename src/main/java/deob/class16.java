package deob;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.security.Security;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.bouncycastle.crypto.tls.TlsClientProtocol;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

@ObfuscatedName("ax")
public class class16 extends SSLSocketFactory {

    @ObfuscatedName("ax.ak")
    public SecureRandom field77 = new SecureRandom();

    static {
        if (Security.getProvider("BC") == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
    }

    @ObfuscatedName("ax.ak(I)Lax;")
    public static class16 method178() {
        if (Statics.field76 == null) {
            Statics.field76 = new class16();
        }
        return Statics.field76;
    }

    public Socket createSocket(Socket arg0, String arg1, int arg2, boolean arg3) throws IOException {
        if (arg0 == null) {
            arg0 = new Socket();
        }
        if (!arg0.isConnected()) {
            arg0.connect(new InetSocketAddress(arg1, arg2));
        }
        TlsClientProtocol var5 = new TlsClientProtocol(arg0.getInputStream(), arg0.getOutputStream(), this.field77);
        return this.method192(arg1, var5);
    }

    public String[] getDefaultCipherSuites() {
        return null;
    }

    public String[] getSupportedCipherSuites() {
        return null;
    }

    public Socket createSocket(String arg0, int arg1) throws IOException, UnknownHostException {
        return null;
    }

    public Socket createSocket(InetAddress arg0, int arg1) throws IOException {
        return null;
    }

    public Socket createSocket(String arg0, int arg1, InetAddress arg2, int arg3) throws IOException, UnknownHostException {
        return null;
    }

    public Socket createSocket(InetAddress arg0, int arg1, InetAddress arg2, int arg3) throws IOException {
        return null;
    }

    @ObfuscatedName("ax.al(Ljava/lang/String;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;I)Ljavax/net/ssl/SSLSocket;")
    public SSLSocket method192(String arg0, TlsClientProtocol arg1) {
        return new class13(this, arg1, arg0);
    }
}
