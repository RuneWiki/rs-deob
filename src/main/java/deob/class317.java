package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("lx")
public class class317 extends class316 {

    @ObfuscatedName("lx.f")
    public Socket field3804;

    @ObfuscatedName("lx.b")
    public class320 field3801;

    @ObfuscatedName("lx.l")
    public class318 field3803;

    public class317(Socket arg0, int arg1, int arg2) throws IOException {
        this.field3804 = arg0;
        this.field3804.setSoTimeout(30000);
        this.field3804.setTcpNoDelay(true);
        this.field3804.setReceiveBufferSize(65536);
        this.field3804.setSendBufferSize(65536);
        this.field3801 = new class320(this.field3804.getInputStream(), arg1);
        this.field3803 = new class318(this.field3804.getOutputStream(), arg2);
    }

    @ObfuscatedName("lx.m(II)Z")
    public boolean method3338(int arg0) throws IOException {
        return this.field3801.method5514(arg0);
    }

    @ObfuscatedName("lx.l(I)I")
    public int method3337() throws IOException {
        return this.field3801.method5518();
    }

    @ObfuscatedName("lx.b(B)I")
    public int method3336() throws IOException {
        return this.field3801.method5513();
    }

    @ObfuscatedName("lx.z([BIII)I")
    public int method3339(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field3801.method5516(arg0, arg1, arg2);
    }

    @ObfuscatedName("lx.k([BIII)V")
    public void method3341(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field3803.method5490(arg0, arg1, arg2);
    }

    @ObfuscatedName("lx.f(I)V")
    public void method3334() {
        this.field3803.method5491();
        try {
            this.field3804.close();
        } catch (IOException var2) {
        }
        this.field3801.method5517();
    }

    public void finalize() {
        this.method3334();
    }
}
