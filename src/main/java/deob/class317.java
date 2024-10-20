package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("le")
public class class317 extends class316 {

    @ObfuscatedName("le.h")
    public Socket field3808;

    @ObfuscatedName("le.v")
    public class320 field3809;

    @ObfuscatedName("le.x")
    public class318 field3812;

    public class317(Socket arg0, int arg1, int arg2) throws IOException {
        this.field3808 = arg0;
        this.field3808.setSoTimeout(30000);
        this.field3808.setTcpNoDelay(true);
        this.field3808.setReceiveBufferSize(65536);
        this.field3808.setSendBufferSize(65536);
        this.field3809 = new class320(this.field3808.getInputStream(), arg1);
        this.field3812 = new class318(this.field3808.getOutputStream(), arg2);
    }

    @ObfuscatedName("le.w(IB)Z")
    public boolean method3292(int arg0) throws IOException {
        return this.field3809.method5448(arg0);
    }

    @ObfuscatedName("le.x(I)I")
    public int method3291() throws IOException {
        return this.field3809.method5449();
    }

    @ObfuscatedName("le.v(B)I")
    public int method3290() throws IOException {
        return this.field3809.method5459();
    }

    @ObfuscatedName("le.t([BIIB)I")
    public int method3305(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field3809.method5451(arg0, arg1, arg2);
    }

    @ObfuscatedName("le.n([BIII)V")
    public void method3307(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field3812.method5425(arg0, arg1, arg2);
    }

    @ObfuscatedName("le.h(B)V")
    public void method3288() {
        this.field3812.method5433();
        try {
            this.field3808.close();
        } catch (IOException var2) {
        }
        this.field3809.method5457();
    }

    public void finalize() {
        this.method3288();
    }
}
