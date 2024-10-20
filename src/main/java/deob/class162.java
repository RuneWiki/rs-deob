package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fk")
public class class162 extends class160 {

    @ObfuscatedName("fk.p")
    public Socket field2136;

    @ObfuscatedName("fk.i")
    public class154 field2139;

    @ObfuscatedName("fk.w")
    public class166 field2137;

    public class162(Socket arg0, int arg1, int arg2) throws IOException {
        this.field2136 = arg0;
        this.field2136.setSoTimeout(30000);
        this.field2136.setTcpNoDelay(true);
        this.field2136.setReceiveBufferSize(65536);
        this.field2136.setSendBufferSize(65536);
        this.field2139 = new class154(this.field2136.getInputStream(), arg1);
        this.field2137 = new class166(this.field2136.getOutputStream(), arg2);
    }

    @ObfuscatedName("fk.p(II)Z")
    public boolean method2894(int arg0) throws IOException {
        return this.field2139.method2839(arg0);
    }

    @ObfuscatedName("fk.i(B)I")
    public int method2893() throws IOException {
        return this.field2139.method2840();
    }

    @ObfuscatedName("fk.w(I)I")
    public int method2908() throws IOException {
        return this.field2139.method2846();
    }

    @ObfuscatedName("fk.s([BIII)I")
    public int method2901(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field2139.method2858(arg0, arg1, arg2);
    }

    @ObfuscatedName("fk.j([BIIB)V")
    public void method2896(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field2137.method2959(arg0, arg1, arg2);
    }

    @ObfuscatedName("fk.a(I)V")
    public void method2897() {
        this.field2137.method2963();
        try {
            this.field2136.close();
        } catch (IOException var2) {
        }
        this.field2139.method2843();
    }

    public void finalize() {
        this.method2897();
    }
}
