package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("ot")
public class class401 extends class400 {

    @ObfuscatedName("ot.h")
    public Socket field4551;

    @ObfuscatedName("ot.e")
    public class402 field4554;

    @ObfuscatedName("ot.v")
    public class403 field4553;

    public class401(Socket arg0, int arg1, int arg2) throws IOException {
        this.field4551 = arg0;
        this.field4551.setSoTimeout(30000);
        this.field4551.setTcpNoDelay(true);
        this.field4551.setReceiveBufferSize(65536);
        this.field4551.setSendBufferSize(65536);
        this.field4554 = new class402(this.field4551.getInputStream(), arg1);
        this.field4553 = new class403(this.field4551.getOutputStream(), arg2);
    }

    @ObfuscatedName("ot.h(II)Z")
    public boolean method6955(int arg0) throws IOException {
        return this.field4554.method6964(arg0);
    }

    @ObfuscatedName("ot.e(B)I")
    public int method6945() throws IOException {
        return this.field4554.method6967();
    }

    @ObfuscatedName("ot.v(I)I")
    public int method6947() throws IOException {
        return this.field4554.method6966();
    }

    @ObfuscatedName("ot.x([BIII)I")
    public int method6943(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field4554.method6976(arg0, arg1, arg2);
    }

    @ObfuscatedName("ot.m([BIIB)V")
    public void method6944(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field4553.method6994(arg0, arg1, arg2);
    }

    @ObfuscatedName("ot.q(I)V")
    public void method6948() {
        this.field4553.method6985();
        try {
            this.field4551.close();
        } catch (IOException var2) {
        }
        this.field4554.method6968();
    }

    public void finalize() {
        this.method6948();
    }
}
