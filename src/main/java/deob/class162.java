package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fu")
public class class162 extends class160 {

    @ObfuscatedName("fu.f")
    public Socket field2027;

    @ObfuscatedName("fu.h")
    public class154 field2026;

    @ObfuscatedName("fu.e")
    public class166 field2025;

    public class162(Socket arg0, int arg1, int arg2) throws IOException {
        this.field2027 = arg0;
        this.field2027.setSoTimeout(30000);
        this.field2027.setTcpNoDelay(true);
        this.field2027.setReceiveBufferSize(65536);
        this.field2027.setSendBufferSize(65536);
        this.field2026 = new class154(this.field2027.getInputStream(), arg1);
        this.field2025 = new class166(this.field2027.getOutputStream(), arg2);
    }

    @ObfuscatedName("fu.h(II)Z")
    public boolean method3085(int arg0) throws IOException {
        return this.field2026.method3022(arg0);
    }

    @ObfuscatedName("fu.e(S)I")
    public int method3087() throws IOException {
        return this.field2026.method3023();
    }

    @ObfuscatedName("fu.b(B)I")
    public int method3088() throws IOException {
        return this.field2026.method3033();
    }

    @ObfuscatedName("fu.l([BIII)I")
    public int method3089(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field2026.method3025(arg0, arg1, arg2);
    }

    @ObfuscatedName("fu.w([BIII)V")
    public void method3094(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field2025.method3149(arg0, arg1, arg2);
    }

    @ObfuscatedName("fu.d(I)V")
    public void method3098() {
        this.field2025.method3148();
        try {
            this.field2027.close();
        } catch (IOException var2) {
        }
        this.field2026.method3024();
    }

    public void finalize() {
        this.method3098();
    }
}
