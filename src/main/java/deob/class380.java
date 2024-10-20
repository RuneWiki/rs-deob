package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("no")
public class class380 extends class379 {

    @ObfuscatedName("no.c")
    public Socket field4378;

    @ObfuscatedName("no.p")
    public class381 field4374;

    @ObfuscatedName("no.f")
    public class382 field4373;

    public class380(Socket arg0, int arg1, int arg2) throws IOException {
        this.field4378 = arg0;
        this.field4378.setSoTimeout(30000);
        this.field4378.setTcpNoDelay(true);
        this.field4378.setReceiveBufferSize(65536);
        this.field4378.setSendBufferSize(65536);
        this.field4374 = new class381(this.field4378.getInputStream(), arg1);
        this.field4373 = new class382(this.field4378.getOutputStream(), arg2);
    }

    @ObfuscatedName("no.c(IS)Z")
    public boolean method6340(int arg0) throws IOException {
        return this.field4374.method6372(arg0);
    }

    @ObfuscatedName("no.p(I)I")
    public int method6341() throws IOException {
        return this.field4374.method6364();
    }

    @ObfuscatedName("no.f(B)I")
    public int method6342() throws IOException {
        return this.field4374.method6365();
    }

    @ObfuscatedName("no.n([BIII)I")
    public int method6343(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field4374.method6366(arg0, arg1, arg2);
    }

    @ObfuscatedName("no.k([BIII)V")
    public void method6356(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field4373.method6384(arg0, arg1, arg2);
    }

    @ObfuscatedName("no.w(I)V")
    public void method6345() {
        this.field4373.method6388();
        try {
            this.field4378.close();
        } catch (IOException var2) {
        }
        this.field4374.method6367();
    }

    public void finalize() {
        this.method6345();
    }
}
