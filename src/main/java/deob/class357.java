package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("mg")
public class class357 extends class356 {

    @ObfuscatedName("mg.c")
    public Socket field4133;

    @ObfuscatedName("mg.b")
    public class358 field4132;

    @ObfuscatedName("mg.p")
    public class359 field4131;

    public class357(Socket arg0, int arg1, int arg2) throws IOException {
        this.field4133 = arg0;
        this.field4133.setSoTimeout(30000);
        this.field4133.setTcpNoDelay(true);
        this.field4133.setReceiveBufferSize(65536);
        this.field4133.setSendBufferSize(65536);
        this.field4132 = new class358(this.field4133.getInputStream(), arg1);
        this.field4131 = new class359(this.field4133.getOutputStream(), arg2);
    }

    @ObfuscatedName("mg.m(II)Z")
    public boolean method2816(int arg0) throws IOException {
        return this.field4132.method5874(arg0);
    }

    @ObfuscatedName("mg.p(I)I")
    public int method2815() throws IOException {
        return this.field4132.method5875();
    }

    @ObfuscatedName("mg.b(B)I")
    public int method2814() throws IOException {
        return this.field4132.method5876();
    }

    @ObfuscatedName("mg.t([BIIS)I")
    public int method2813(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field4132.method5877(arg0, arg1, arg2);
    }

    @ObfuscatedName("mg.j([BIII)V")
    public void method2834(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field4131.method5898(arg0, arg1, arg2);
    }

    @ObfuscatedName("mg.c(I)V")
    public void method2817() {
        this.field4131.method5895();
        try {
            this.field4133.close();
        } catch (IOException var2) {
        }
        this.field4132.method5878();
    }

    public void finalize() {
        this.method2817();
    }
}
