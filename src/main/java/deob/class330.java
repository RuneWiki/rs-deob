package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("lg")
public class class330 extends class329 {

    @ObfuscatedName("lg.v")
    public Socket field3864;

    @ObfuscatedName("lg.n")
    public class331 field3863;

    @ObfuscatedName("lg.f")
    public class332 field3865;

    public class330(Socket arg0, int arg1, int arg2) throws IOException {
        this.field3864 = arg0;
        this.field3864.setSoTimeout(30000);
        this.field3864.setTcpNoDelay(true);
        this.field3864.setReceiveBufferSize(65536);
        this.field3864.setSendBufferSize(65536);
        this.field3863 = new class331(this.field3864.getInputStream(), arg1);
        this.field3865 = new class332(this.field3864.getOutputStream(), arg2);
    }

    @ObfuscatedName("lg.y(II)Z")
    public boolean method2342(int arg0) throws IOException {
        return this.field3863.method5371(arg0);
    }

    @ObfuscatedName("lg.f(I)I")
    public int method2327() throws IOException {
        return this.field3863.method5372();
    }

    @ObfuscatedName("lg.n(I)I")
    public int method2328() throws IOException {
        return this.field3863.method5375();
    }

    @ObfuscatedName("lg.p([BIII)I")
    public int method2352(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field3863.method5373(arg0, arg1, arg2);
    }

    @ObfuscatedName("lg.r([BIII)V")
    public void method2333(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field3865.method5398(arg0, arg1, arg2);
    }

    @ObfuscatedName("lg.v(I)V")
    public void method2357() {
        this.field3865.method5396();
        try {
            this.field3864.close();
        } catch (IOException var2) {
        }
        this.field3863.method5369();
    }

    public void finalize() {
        this.method2357();
    }
}
