package deob;

import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;

@ObfuscatedName("u")
public class class18 implements SSLSession {

    // $FF: synthetic field
    public final class13 this$1;

    public class18(class13 arg0) {
        this.this$1 = arg0;
    }

    public int getApplicationBufferSize() {
        return 0;
    }

    public String getCipherSuite() {
        throw new UnsupportedOperationException();
    }

    public long getCreationTime() {
        throw new UnsupportedOperationException();
    }

    public byte[] getId() {
        throw new UnsupportedOperationException();
    }

    public long getLastAccessedTime() {
        throw new UnsupportedOperationException();
    }

    public Certificate[] getLocalCertificates() {
        throw new UnsupportedOperationException();
    }

    public Principal getLocalPrincipal() {
        throw new UnsupportedOperationException();
    }

    public int getPacketBufferSize() {
        throw new UnsupportedOperationException();
    }

    public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
        return null;
    }

    public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
        return this.this$1.field68;
    }

    public String getPeerHost() {
        throw new UnsupportedOperationException();
    }

    public int getPeerPort() {
        return 0;
    }

    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        return null;
    }

    public String getProtocol() {
        throw new UnsupportedOperationException();
    }

    public SSLSessionContext getSessionContext() {
        throw new UnsupportedOperationException();
    }

    public Object getValue(String arg0) {
        throw new UnsupportedOperationException();
    }

    public String[] getValueNames() {
        throw new UnsupportedOperationException();
    }

    public void invalidate() {
        throw new UnsupportedOperationException();
    }

    public boolean isValid() {
        throw new UnsupportedOperationException();
    }

    public void putValue(String arg0, Object arg1) {
        throw new UnsupportedOperationException();
    }

    public void removeValue(String arg0) {
        throw new UnsupportedOperationException();
    }
}
