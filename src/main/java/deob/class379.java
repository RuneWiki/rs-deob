package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("na")
public class class379 extends class378 {

    @ObfuscatedName("na.s")
    public class380 field4336;

    @ObfuscatedName("na.h")
    public Socket field4334;

    @ObfuscatedName("na.w")
    public class381 field4333;

    public class379(Socket arg0, int arg1, int arg2) throws IOException {
        this.field4334 = arg0;
        this.field4334.setSoTimeout(30000);
        this.field4334.setTcpNoDelay(true);
        this.field4334.setReceiveBufferSize(65536);
        this.field4334.setSendBufferSize(65536);
        this.field4336 = new class380(this.field4334.getInputStream(), arg1);
        this.field4333 = new class381(this.field4334.getOutputStream(), arg2);
    }

    @ObfuscatedName("na.h(II)Z")
    public boolean method6108(int arg0) throws IOException {
        return this.field4336.method6132(arg0);
    }

    @ObfuscatedName("na.w(B)I")
    public int method6109() throws IOException {
        return this.field4336.method6133();
    }

    @ObfuscatedName("na.v(I)I")
    public int method6110() throws IOException {
        return this.field4336.method6134();
    }

    @ObfuscatedName("na.c([BIIB)I")
    public int method6122(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field4336.method6141(arg0, arg1, arg2);
    }

    @ObfuscatedName("na.q([BIIS)V")
    public void method6112(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field4333.method6151(arg0, arg1, arg2);
    }

    @ObfuscatedName("na.i(I)V")
    public void method6121() {
        this.field4333.method6152();
        try {
            this.field4334.close();
        } catch (IOException var2) {
        }
        this.field4336.method6136();
    }

    public void finalize() {
        this.method6121();
    }
}
