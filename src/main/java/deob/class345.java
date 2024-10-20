package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("mn")
public class class345 extends class344 {

    @ObfuscatedName("mn.l")
    public Socket field3984;

    @ObfuscatedName("mn.q")
    public class346 field3983;

    @ObfuscatedName("mn.f")
    public class347 field3985;

    public class345(Socket arg0, int arg1, int arg2) throws IOException {
        this.field3984 = arg0;
        this.field3984.setSoTimeout(30000);
        this.field3984.setTcpNoDelay(true);
        this.field3984.setReceiveBufferSize(65536);
        this.field3984.setSendBufferSize(65536);
        this.field3983 = new class346(this.field3984.getInputStream(), arg1);
        this.field3985 = new class347(this.field3984.getOutputStream(), arg2);
    }

    @ObfuscatedName("mn.j(II)Z")
    public boolean method2592(int arg0) throws IOException {
        return this.field3983.method5628(arg0);
    }

    @ObfuscatedName("mn.f(I)I")
    public int method2603() throws IOException {
        return this.field3983.method5624();
    }

    @ObfuscatedName("mn.q(I)I")
    public int method2590() throws IOException {
        return this.field3983.method5625();
    }

    @ObfuscatedName("mn.m([BIIB)I")
    public int method2588(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field3983.method5626(arg0, arg1, arg2);
    }

    @ObfuscatedName("mn.t([BIII)V")
    public void method2596(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field3985.method5647(arg0, arg1, arg2);
    }

    @ObfuscatedName("mn.l(B)V")
    public void method2615() {
        this.field3985.method5648();
        try {
            this.field3984.close();
        } catch (IOException var2) {
        }
        this.field3983.method5627();
    }

    public void finalize() {
        this.method2615();
    }
}
