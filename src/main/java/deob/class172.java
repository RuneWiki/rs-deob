package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fx")
public class class172 extends class170 {

    @ObfuscatedName("fx.c")
    public Socket field2225;

    @ObfuscatedName("fx.i")
    public class164 field2224;

    @ObfuscatedName("fx.o")
    public class176 field2223;

    public class172(Socket arg0, int arg1, int arg2) throws IOException {
        this.field2225 = arg0;
        this.field2225.setSoTimeout(30000);
        this.field2225.setTcpNoDelay(true);
        this.field2225.setReceiveBufferSize(65536);
        this.field2225.setSendBufferSize(65536);
        this.field2224 = new class164(this.field2225.getInputStream(), arg1);
        this.field2223 = new class176(this.field2225.getOutputStream(), arg2);
    }

    @ObfuscatedName("fx.i(IB)Z")
    public boolean method3029(int arg0) throws IOException {
        return this.field2224.method2966(arg0);
    }

    @ObfuscatedName("fx.o(I)I")
    public int method3018() throws IOException {
        return this.field2224.method2967();
    }

    @ObfuscatedName("fx.j(I)I")
    public int method3019() throws IOException {
        return this.field2224.method2970();
    }

    @ObfuscatedName("fx.k([BIII)I")
    public int method3026(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field2224.method2969(arg0, arg1, arg2);
    }

    @ObfuscatedName("fx.x([BIII)V")
    public void method3021(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field2223.method3066(arg0, arg1, arg2);
    }

    @ObfuscatedName("fx.z(I)V")
    public void method3022() {
        this.field2223.method3064();
        try {
            this.field2225.close();
        } catch (IOException var2) {
        }
        this.field2224.method2981();
    }

    public void finalize() {
        this.method3022();
    }
}
