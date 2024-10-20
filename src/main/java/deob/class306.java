package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("kw")
public class class306 extends class305 {

    @ObfuscatedName("kw.f")
    public Socket field3763;

    @ObfuscatedName("kw.i")
    public class309 field3765;

    @ObfuscatedName("kw.y")
    public class307 field3764;

    public class306(Socket arg0, int arg1, int arg2) throws IOException {
        this.field3763 = arg0;
        this.field3763.setSoTimeout(30000);
        this.field3763.setTcpNoDelay(true);
        this.field3763.setReceiveBufferSize(65536);
        this.field3763.setSendBufferSize(65536);
        this.field3765 = new class309(this.field3763.getInputStream(), arg1);
        this.field3764 = new class307(this.field3763.getOutputStream(), arg2);
    }

    @ObfuscatedName("kw.w(II)Z")
    public boolean method3194(int arg0) throws IOException {
        return this.field3765.method5431(arg0);
    }

    @ObfuscatedName("kw.y(I)I")
    public int method3193() throws IOException {
        return this.field3765.method5429();
    }

    @ObfuscatedName("kw.i(I)I")
    public int method3215() throws IOException {
        return this.field3765.method5433();
    }

    @ObfuscatedName("kw.p([BIII)I")
    public int method3195(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field3765.method5434(arg0, arg1, arg2);
    }

    @ObfuscatedName("kw.e([BIII)V")
    public void method3197(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field3764.method5406(arg0, arg1, arg2);
    }

    @ObfuscatedName("kw.f(I)V")
    public void method3191() {
        this.field3764.method5411();
        try {
            this.field3763.close();
        } catch (IOException var2) {
        }
        this.field3765.method5438();
    }

    public void finalize() {
        this.method3191();
    }
}
