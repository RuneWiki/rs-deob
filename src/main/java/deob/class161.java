package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fb")
public class class161 extends class159 {

    @ObfuscatedName("fb.w")
    public Socket field2284;

    @ObfuscatedName("fb.o")
    public class153 field2282;

    @ObfuscatedName("fb.x")
    public class164 field2283;

    public class161(Socket arg0, int arg1) throws IOException {
        this.field2284 = arg0;
        this.field2284.setSoTimeout(30000);
        this.field2284.setTcpNoDelay(true);
        this.field2284.setReceiveBufferSize(65536);
        this.field2284.setSendBufferSize(65536);
        this.field2282 = new class153(this.field2284.getInputStream(), arg1);
        this.field2283 = new class164(this.field2284.getOutputStream(), arg1);
    }

    @ObfuscatedName("fb.o(IB)Z")
    public boolean method2713(int arg0) throws IOException {
        return this.field2282.method2655(arg0);
    }

    @ObfuscatedName("fb.x(B)I")
    public int method2701() throws IOException {
        return this.field2282.method2641();
    }

    @ObfuscatedName("fb.k(I)I")
    public int method2702() throws IOException {
        return this.field2282.method2642();
    }

    @ObfuscatedName("fb.f([BIII)I")
    public int method2703(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field2282.method2643(arg0, arg1, arg2);
    }

    @ObfuscatedName("fb.i([BIII)V")
    public void method2699(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field2283.method2747(arg0, arg1, arg2);
    }

    @ObfuscatedName("fb.j(B)V")
    public void method2705() {
        this.field2283.method2746();
        try {
            this.field2284.close();
        } catch (IOException var2) {
        }
        this.field2282.method2644();
    }

    public void finalize() {
        this.method2705();
    }
}
