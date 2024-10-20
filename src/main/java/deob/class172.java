package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fy")
public class class172 extends class170 {

    @ObfuscatedName("fy.g")
    public Socket field2218;

    @ObfuscatedName("fy.e")
    public class164 field2215;

    @ObfuscatedName("fy.b")
    public class176 field2214;

    public class172(Socket arg0, int arg1, int arg2) throws IOException {
        this.field2218 = arg0;
        this.field2218.setSoTimeout(30000);
        this.field2218.setTcpNoDelay(true);
        this.field2218.setReceiveBufferSize(65536);
        this.field2218.setSendBufferSize(65536);
        this.field2215 = new class164(this.field2218.getInputStream(), arg1);
        this.field2214 = new class176(this.field2218.getOutputStream(), arg2);
    }

    @ObfuscatedName("fy.g(II)Z")
    public boolean method3103(int arg0) throws IOException {
        return this.field2215.method3046(arg0);
    }

    @ObfuscatedName("fy.e(I)I")
    public int method3104() throws IOException {
        return this.field2215.method3063();
    }

    @ObfuscatedName("fy.b(S)I")
    public int method3122() throws IOException {
        return this.field2215.method3048();
    }

    @ObfuscatedName("fy.z([BIII)I")
    public int method3106(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field2215.method3049(arg0, arg1, arg2);
    }

    @ObfuscatedName("fy.n([BIII)V")
    public void method3107(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field2214.method3165(arg0, arg1, arg2);
    }

    @ObfuscatedName("fy.l(I)V")
    public void method3108() {
        this.field2214.method3159();
        try {
            this.field2218.close();
        } catch (IOException var2) {
        }
        this.field2215.method3057();
    }

    public void finalize() {
        this.method3108();
    }
}
