package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fy")
public class class171 extends class169 {

    @ObfuscatedName("fy.b")
    public Socket field2192;

    @ObfuscatedName("fy.q")
    public class163 field2190;

    @ObfuscatedName("fy.o")
    public class175 field2194;

    public class171(Socket arg0, int arg1, int arg2) throws IOException {
        this.field2192 = arg0;
        this.field2192.setSoTimeout(30000);
        this.field2192.setTcpNoDelay(true);
        this.field2192.setReceiveBufferSize(65536);
        this.field2192.setSendBufferSize(65536);
        this.field2190 = new class163(this.field2192.getInputStream(), arg1);
        this.field2194 = new class175(this.field2192.getOutputStream(), arg2);
    }

    @ObfuscatedName("fy.b(II)Z")
    public boolean method3024(int arg0) throws IOException {
        return this.field2190.method2947(arg0);
    }

    @ObfuscatedName("fy.q(B)I")
    public int method3028() throws IOException {
        return this.field2190.method2948();
    }

    @ObfuscatedName("fy.o(I)I")
    public int method3014() throws IOException {
        return this.field2190.method2972();
    }

    @ObfuscatedName("fy.p([BIII)I")
    public int method3031(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field2190.method2949(arg0, arg1, arg2);
    }

    @ObfuscatedName("fy.a([BIII)V")
    public void method3019(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field2194.method3067(arg0, arg1, arg2);
    }

    @ObfuscatedName("fy.h(B)V")
    public void method3020() {
        this.field2194.method3068();
        try {
            this.field2192.close();
        } catch (IOException var2) {
        }
        this.field2190.method2950();
    }

    public void finalize() {
        this.method3020();
    }
}
