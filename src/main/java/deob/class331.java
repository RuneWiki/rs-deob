package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("ll")
public class class331 extends class330 {

    @ObfuscatedName("ll.f")
    public Socket field3859;

    @ObfuscatedName("ll.e")
    public class332 field3860;

    @ObfuscatedName("ll.v")
    public class333 field3861;

    public class331(Socket arg0, int arg1, int arg2) throws IOException {
        this.field3859 = arg0;
        this.field3859.setSoTimeout(30000);
        this.field3859.setTcpNoDelay(true);
        this.field3859.setReceiveBufferSize(65536);
        this.field3859.setSendBufferSize(65536);
        this.field3860 = new class332(this.field3859.getInputStream(), arg1);
        this.field3861 = new class333(this.field3859.getOutputStream(), arg2);
    }

    @ObfuscatedName("ll.y(II)Z")
    public boolean method2384(int arg0) throws IOException {
        return this.field3860.method5289(arg0);
    }

    @ObfuscatedName("ll.v(I)I")
    public int method2366() throws IOException {
        return this.field3860.method5290();
    }

    @ObfuscatedName("ll.e(I)I")
    public int method2363() throws IOException {
        return this.field3860.method5291();
    }

    @ObfuscatedName("ll.j([BIII)I")
    public int method2368(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field3860.method5302(arg0, arg1, arg2);
    }

    @ObfuscatedName("ll.m([BIII)V")
    public void method2370(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field3861.method5316(arg0, arg1, arg2);
    }

    @ObfuscatedName("ll.f(I)V")
    public void method2364() {
        this.field3861.method5311();
        try {
            this.field3859.close();
        } catch (IOException var2) {
        }
        this.field3860.method5306();
    }

    public void finalize() {
        this.method2364();
    }
}
