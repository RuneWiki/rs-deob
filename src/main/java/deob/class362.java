package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("mr")
public class class362 extends class361 {

    @ObfuscatedName("mr.c")
    public Socket field4185;

    @ObfuscatedName("mr.l")
    public class363 field4183;

    @ObfuscatedName("mr.s")
    public class364 field4184;

    public class362(Socket arg0, int arg1, int arg2) throws IOException {
        this.field4185 = arg0;
        this.field4185.setSoTimeout(30000);
        this.field4185.setTcpNoDelay(true);
        this.field4185.setReceiveBufferSize(65536);
        this.field4185.setSendBufferSize(65536);
        this.field4183 = new class363(this.field4185.getInputStream(), arg1);
        this.field4184 = new class364(this.field4185.getOutputStream(), arg2);
    }

    @ObfuscatedName("mr.e(IB)Z")
    public boolean method2784(int arg0) throws IOException {
        return this.field4183.method5889(arg0);
    }

    @ObfuscatedName("mr.s(I)I")
    public int method2810() throws IOException {
        return this.field4183.method5883();
    }

    @ObfuscatedName("mr.l(B)I")
    public int method2782() throws IOException {
        return this.field4183.method5884();
    }

    @ObfuscatedName("mr.r([BIII)I")
    public int method2781(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field4183.method5895(arg0, arg1, arg2);
    }

    @ObfuscatedName("mr.i([BIII)V")
    public void method2788(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field4184.method5905(arg0, arg1, arg2);
    }

    @ObfuscatedName("mr.c(I)V")
    public void method2780() {
        this.field4184.method5906();
        try {
            this.field4185.close();
        } catch (IOException var2) {
        }
        this.field4183.method5886();
    }

    public void finalize() {
        this.method2780();
    }
}
