package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fj")
public class class162 extends class160 {

    @ObfuscatedName("fj.f")
    public Socket field2053;

    @ObfuscatedName("fj.l")
    public class154 field2052;

    @ObfuscatedName("fj.w")
    public class166 field2051;

    public class162(Socket arg0, int arg1, int arg2) throws IOException {
        this.field2053 = arg0;
        this.field2053.setSoTimeout(30000);
        this.field2053.setTcpNoDelay(true);
        this.field2053.setReceiveBufferSize(65536);
        this.field2053.setSendBufferSize(65536);
        this.field2052 = new class154(this.field2053.getInputStream(), arg1);
        this.field2051 = new class166(this.field2053.getOutputStream(), arg2);
    }

    @ObfuscatedName("fj.l(II)Z")
    public boolean method3119(int arg0) throws IOException {
        return this.field2052.method3046(arg0);
    }

    @ObfuscatedName("fj.w(I)I")
    public int method3108() throws IOException {
        return this.field2052.method3064();
    }

    @ObfuscatedName("fj.s(I)I")
    public int method3110() throws IOException {
        return this.field2052.method3044();
    }

    @ObfuscatedName("fj.e([BIIS)I")
    public int method3111(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field2052.method3045(arg0, arg1, arg2);
    }

    @ObfuscatedName("fj.c([BIII)V")
    public void method3112(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field2051.method3191(arg0, arg1, arg2);
    }

    @ObfuscatedName("fj.p(I)V")
    public void method3113() {
        this.field2051.method3178();
        try {
            this.field2053.close();
        } catch (IOException var2) {
        }
        this.field2052.method3054();
    }

    public void finalize() {
        this.method3113();
    }
}
