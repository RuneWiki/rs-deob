package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("mw")
public class class345 extends class344 {

    @ObfuscatedName("mw.i")
    public Socket field3975;

    @ObfuscatedName("mw.w")
    public class346 field3976;

    @ObfuscatedName("mw.s")
    public class347 field3977;

    public class345(Socket arg0, int arg1, int arg2) throws IOException {
        this.field3975 = arg0;
        this.field3975.setSoTimeout(30000);
        this.field3975.setTcpNoDelay(true);
        this.field3975.setReceiveBufferSize(65536);
        this.field3975.setSendBufferSize(65536);
        this.field3976 = new class346(this.field3975.getInputStream(), arg1);
        this.field3977 = new class347(this.field3975.getOutputStream(), arg2);
    }

    @ObfuscatedName("mw.a(II)Z")
    public boolean method2616(int arg0) throws IOException {
        return this.field3976.method5604(arg0);
    }

    @ObfuscatedName("mw.s(I)I")
    public int method2615() throws IOException {
        return this.field3976.method5609();
    }

    @ObfuscatedName("mw.w(I)I")
    public int method2612() throws IOException {
        return this.field3976.method5603();
    }

    @ObfuscatedName("mw.o([BIII)I")
    public int method2617(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field3976.method5619(arg0, arg1, arg2);
    }

    @ObfuscatedName("mw.e([BIII)V")
    public void method2642(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field3977.method5624(arg0, arg1, arg2);
    }

    @ObfuscatedName("mw.i(B)V")
    public void method2613() {
        this.field3977.method5625();
        try {
            this.field3975.close();
        } catch (IOException var2) {
        }
        this.field3976.method5601();
    }

    public void finalize() {
        this.method2613();
    }
}
