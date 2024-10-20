package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("no")
public class class378 extends class377 {

    @ObfuscatedName("no.v")
    public Socket field4281;

    @ObfuscatedName("no.c")
    public class379 field4278;

    @ObfuscatedName("no.i")
    public class380 field4279;

    public class378(Socket arg0, int arg1, int arg2) throws IOException {
        this.field4281 = arg0;
        this.field4281.setSoTimeout(30000);
        this.field4281.setTcpNoDelay(true);
        this.field4281.setReceiveBufferSize(65536);
        this.field4281.setSendBufferSize(65536);
        this.field4278 = new class379(this.field4281.getInputStream(), arg1);
        this.field4279 = new class380(this.field4281.getOutputStream(), arg2);
    }

    @ObfuscatedName("no.f(IB)Z")
    public boolean method2987(int arg0) throws IOException {
        return this.field4278.method6227(arg0);
    }

    @ObfuscatedName("no.i(B)I")
    public int method2974() throws IOException {
        return this.field4278.method6242();
    }

    @ObfuscatedName("no.c(I)I")
    public int method2971() throws IOException {
        return this.field4278.method6229();
    }

    @ObfuscatedName("no.b([BIIB)I")
    public int method2988(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field4278.method6230(arg0, arg1, arg2);
    }

    @ObfuscatedName("no.s([BIII)V")
    public void method2992(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field4279.method6249(arg0, arg1, arg2);
    }

    @ObfuscatedName("no.v(S)V")
    public void method2972() {
        this.field4279.method6251();
        try {
            this.field4281.close();
        } catch (IOException var2) {
        }
        this.field4278.method6231();
    }

    public void finalize() {
        this.method2972();
    }
}
