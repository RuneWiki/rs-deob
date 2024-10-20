package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fi")
public class class162 extends class160 {

    @ObfuscatedName("fi.g")
    public Socket field2048;

    @ObfuscatedName("fi.r")
    public class154 field2050;

    @ObfuscatedName("fi.e")
    public class166 field2047;

    public class162(Socket arg0, int arg1, int arg2) throws IOException {
        this.field2048 = arg0;
        this.field2048.setSoTimeout(30000);
        this.field2048.setTcpNoDelay(true);
        this.field2048.setReceiveBufferSize(65536);
        this.field2048.setSendBufferSize(65536);
        this.field2050 = new class154(this.field2048.getInputStream(), arg1);
        this.field2047 = new class166(this.field2048.getOutputStream(), arg2);
    }

    @ObfuscatedName("fi.r(II)Z")
    public boolean method3237(int arg0) throws IOException {
        return this.field2050.method3160(arg0);
    }

    @ObfuscatedName("fi.e(B)I")
    public int method3227() throws IOException {
        return this.field2050.method3158();
    }

    @ObfuscatedName("fi.q(I)I")
    public int method3233() throws IOException {
        return this.field2050.method3159();
    }

    @ObfuscatedName("fi.c([BIII)I")
    public int method3228(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field2050.method3168(arg0, arg1, arg2);
    }

    @ObfuscatedName("fi.i([BIII)V")
    public void method3234(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field2047.method3300(arg0, arg1, arg2);
    }

    @ObfuscatedName("fi.p(I)V")
    public void method3230() {
        this.field2047.method3301();
        try {
            this.field2048.close();
        } catch (IOException var2) {
        }
        this.field2050.method3166();
    }

    public void finalize() {
        this.method3230();
    }
}
