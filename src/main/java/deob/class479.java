package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("sb")
public class class479 extends class478 {

    @ObfuscatedName("sb.ak")
    public Socket field4960;

    @ObfuscatedName("sb.al")
    public class480 field4959;

    @ObfuscatedName("sb.aj")
    public class481 field4961;

    public class479(Socket arg0, int arg1, int arg2) throws IOException {
        this.field4960 = arg0;
        this.field4960.setSoTimeout(30000);
        this.field4960.setTcpNoDelay(true);
        this.field4960.setReceiveBufferSize(65536);
        this.field4960.setSendBufferSize(65536);
        this.field4959 = new class480(this.field4960.getInputStream(), arg1);
        this.field4961 = new class481(this.field4960.getOutputStream(), arg2);
    }

    @ObfuscatedName("sb.al(II)Z")
    public boolean method8027(int arg0) throws IOException {
        return this.field4959.method8059(arg0);
    }

    @ObfuscatedName("sb.aj(S)I")
    public int method8020() throws IOException {
        return this.field4959.method8046();
    }

    @ObfuscatedName("sb.az(I)I")
    public int method8021() throws IOException {
        return this.field4959.method8045();
    }

    @ObfuscatedName("sb.af([BIIB)I")
    public int method8022(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field4959.method8048(arg0, arg1, arg2);
    }

    @ObfuscatedName("sb.aa([BIII)V")
    public void method8023(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field4961.method8066(arg0, arg1, arg2);
    }

    @ObfuscatedName("sb.at(B)V")
    public void method8024() {
        this.field4961.method8077();
        try {
            this.field4960.close();
        } catch (IOException var2) {
        }
        this.field4959.method8049();
    }

    public void finalize() {
        this.method8024();
    }
}
