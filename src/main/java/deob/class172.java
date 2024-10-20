package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fa")
public class class172 extends class170 {

    @ObfuscatedName("fa.o")
    public Socket field2236;

    @ObfuscatedName("fa.k")
    public class164 field2237;

    @ObfuscatedName("fa.t")
    public class176 field2238;

    public class172(Socket arg0, int arg1, int arg2) throws IOException {
        this.field2236 = arg0;
        this.field2236.setSoTimeout(30000);
        this.field2236.setTcpNoDelay(true);
        this.field2236.setReceiveBufferSize(65536);
        this.field2236.setSendBufferSize(65536);
        this.field2237 = new class164(this.field2236.getInputStream(), arg1);
        this.field2238 = new class176(this.field2236.getOutputStream(), arg2);
    }

    @ObfuscatedName("fa.k(II)Z")
    public boolean method3010(int arg0) throws IOException {
        return this.field2237.method2945(arg0);
    }

    @ObfuscatedName("fa.t(B)I")
    public int method3028() throws IOException {
        return this.field2237.method2941();
    }

    @ObfuscatedName("fa.d(I)I")
    public int method3011() throws IOException {
        return this.field2237.method2948();
    }

    @ObfuscatedName("fa.h([BIII)I")
    public int method3024(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field2237.method2943(arg0, arg1, arg2);
    }

    @ObfuscatedName("fa.m([BIII)V")
    public void method3020(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field2238.method3065(arg0, arg1, arg2);
    }

    @ObfuscatedName("fa.z(I)V")
    public void method3014() {
        this.field2238.method3066();
        try {
            this.field2236.close();
        } catch (IOException var2) {
        }
        this.field2237.method2949();
    }

    public void finalize() {
        this.method3014();
    }
}
