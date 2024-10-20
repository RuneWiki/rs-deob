package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fq")
public class class161 extends class159 {

    @ObfuscatedName("fq.s")
    public class153 field2276;

    @ObfuscatedName("fq.c")
    public Socket field2279;

    @ObfuscatedName("fq.f")
    public class164 field2277;

    public class161(Socket arg0, int arg1) throws IOException {
        this.field2279 = arg0;
        this.field2279.setSoTimeout(30000);
        this.field2279.setTcpNoDelay(true);
        this.field2279.setReceiveBufferSize(65536);
        this.field2279.setSendBufferSize(65536);
        this.field2276 = new class153(this.field2279.getInputStream(), arg1);
        this.field2277 = new class164(this.field2279.getOutputStream(), arg1);
    }

    @ObfuscatedName("fq.s(IS)Z")
    public boolean method2790(int arg0) throws IOException {
        return this.field2276.method2736(arg0);
    }

    @ObfuscatedName("fq.c(I)I")
    public int method2802() throws IOException {
        return this.field2276.method2737();
    }

    @ObfuscatedName("fq.f(B)I")
    public int method2793() throws IOException {
        return this.field2276.method2727();
    }

    @ObfuscatedName("fq.m([BIII)I")
    public int method2801(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field2276.method2719(arg0, arg1, arg2);
    }

    @ObfuscatedName("fq.h([BIII)V")
    public void method2791(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field2277.method2834(arg0, arg1, arg2);
    }

    @ObfuscatedName("fq.t(I)V")
    public void method2794() {
        this.field2277.method2846();
        try {
            this.field2279.close();
        } catch (IOException var2) {
        }
        this.field2276.method2724();
    }

    public void finalize() {
        this.method2794();
    }
}
