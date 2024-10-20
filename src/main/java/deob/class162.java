package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fz")
public class class162 extends class160 {

    @ObfuscatedName("fz.c")
    public Socket field2036;

    @ObfuscatedName("fz.q")
    public class154 field2033;

    @ObfuscatedName("fz.m")
    public class166 field2034;

    public class162(Socket arg0, int arg1, int arg2) throws IOException {
        this.field2036 = arg0;
        this.field2036.setSoTimeout(30000);
        this.field2036.setTcpNoDelay(true);
        this.field2036.setReceiveBufferSize(65536);
        this.field2036.setSendBufferSize(65536);
        this.field2033 = new class154(this.field2036.getInputStream(), arg1);
        this.field2034 = new class166(this.field2036.getOutputStream(), arg2);
    }

    @ObfuscatedName("fz.q(IB)Z")
    public boolean method3010(int arg0) throws IOException {
        return this.field2033.method2961(arg0);
    }

    @ObfuscatedName("fz.m(I)I")
    public int method3012() throws IOException {
        return this.field2033.method2962();
    }

    @ObfuscatedName("fz.j(I)I")
    public int method3019() throws IOException {
        return this.field2033.method2963();
    }

    @ObfuscatedName("fz.g([BIII)I")
    public int method3014(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field2033.method2964(arg0, arg1, arg2);
    }

    @ObfuscatedName("fz.i([BIII)V")
    public void method3013(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field2034.method3077(arg0, arg1, arg2);
    }

    @ObfuscatedName("fz.h(I)V")
    public void method3034() {
        this.field2034.method3078();
        try {
            this.field2036.close();
        } catch (IOException var2) {
        }
        this.field2033.method2965();
    }

    public void finalize() {
        this.method3034();
    }
}
