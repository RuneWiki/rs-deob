package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fj")
public class class162 extends class160 {

    @ObfuscatedName("fj.a")
    public Socket field2157;

    @ObfuscatedName("fj.w")
    public class154 field2158;

    @ObfuscatedName("fj.e")
    public class166 field2156;

    public class162(Socket arg0, int arg1, int arg2) throws IOException {
        this.field2157 = arg0;
        this.field2157.setSoTimeout(30000);
        this.field2157.setTcpNoDelay(true);
        this.field2157.setReceiveBufferSize(65536);
        this.field2157.setSendBufferSize(65536);
        this.field2158 = new class154(this.field2157.getInputStream(), arg1);
        this.field2156 = new class166(this.field2157.getOutputStream(), arg2);
    }

    @ObfuscatedName("fj.w(II)Z")
    public boolean method2772(int arg0) throws IOException {
        return this.field2158.method2709(arg0);
    }

    @ObfuscatedName("fj.e(B)I")
    public int method2773() throws IOException {
        return this.field2158.method2719();
    }

    @ObfuscatedName("fj.k(I)I")
    public int method2786() throws IOException {
        return this.field2158.method2703();
    }

    @ObfuscatedName("fj.u([BIII)I")
    public int method2782(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field2158.method2704(arg0, arg1, arg2);
    }

    @ObfuscatedName("fj.z([BIII)V")
    public void method2775(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field2156.method2824(arg0, arg1, arg2);
    }

    @ObfuscatedName("fj.t(B)V")
    public void method2776() {
        this.field2156.method2829();
        try {
            this.field2157.close();
        } catch (IOException var2) {
        }
        this.field2158.method2705();
    }

    public void finalize() {
        this.method2776();
    }
}
