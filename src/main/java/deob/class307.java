package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("kb")
public class class307 extends class306 {

    @ObfuscatedName("kb.q")
    public Socket field3792;

    @ObfuscatedName("kb.w")
    public class310 field3790;

    @ObfuscatedName("kb.e")
    public class308 field3791;

    public class307(Socket arg0, int arg1, int arg2) throws IOException {
        this.field3792 = arg0;
        this.field3792.setSoTimeout(30000);
        this.field3792.setTcpNoDelay(true);
        this.field3792.setReceiveBufferSize(65536);
        this.field3792.setSendBufferSize(65536);
        this.field3790 = new class310(this.field3792.getInputStream(), arg1);
        this.field3791 = new class308(this.field3792.getOutputStream(), arg2);
    }

    @ObfuscatedName("kb.p(II)Z")
    public boolean method3216(int arg0) throws IOException {
        return this.field3790.method5403(arg0);
    }

    @ObfuscatedName("kb.e(B)I")
    public int method3206() throws IOException {
        return this.field3790.method5406();
    }

    @ObfuscatedName("kb.w(B)I")
    public int method3205() throws IOException {
        return this.field3790.method5405();
    }

    @ObfuscatedName("kb.k([BIIB)I")
    public int method3208(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field3790.method5408(arg0, arg1, arg2);
    }

    @ObfuscatedName("kb.b([BIII)V")
    public void method3210(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field3791.method5386(arg0, arg1, arg2);
    }

    @ObfuscatedName("kb.q(I)V")
    public void method3204() {
        this.field3791.method5382();
        try {
            this.field3792.close();
        } catch (IOException var2) {
        }
        this.field3790.method5419();
    }

    public void finalize() {
        this.method3204();
    }
}
