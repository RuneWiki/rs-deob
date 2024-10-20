package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("ni")
public class class379 extends class378 {

    @ObfuscatedName("ni.o")
    public Socket field4343;

    @ObfuscatedName("ni.q")
    public class380 field4342;

    @ObfuscatedName("ni.l")
    public class381 field4344;

    public class379(Socket arg0, int arg1, int arg2) throws IOException {
        this.field4343 = arg0;
        this.field4343.setSoTimeout(30000);
        this.field4343.setTcpNoDelay(true);
        this.field4343.setReceiveBufferSize(65536);
        this.field4343.setSendBufferSize(65536);
        this.field4342 = new class380(this.field4343.getInputStream(), arg1);
        this.field4344 = new class381(this.field4343.getOutputStream(), arg2);
    }

    @ObfuscatedName("ni.k(II)Z")
    public boolean method2928(int arg0) throws IOException {
        return this.field4342.method6107(arg0);
    }

    @ObfuscatedName("ni.l(I)I")
    public int method2941() throws IOException {
        return this.field4342.method6108();
    }

    @ObfuscatedName("ni.q(B)I")
    public int method2912() throws IOException {
        return this.field4342.method6109();
    }

    @ObfuscatedName("ni.a([BIII)I")
    public int method2915(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field4342.method6106(arg0, arg1, arg2);
    }

    @ObfuscatedName("ni.p([BIII)V")
    public void method2913(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field4344.method6141(arg0, arg1, arg2);
    }

    @ObfuscatedName("ni.o(I)V")
    public void method2910() {
        this.field4344.method6133();
        try {
            this.field4343.close();
        } catch (IOException var2) {
        }
        this.field4342.method6111();
    }

    public void finalize() {
        this.method2910();
    }
}
