package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fd")
public class class167 extends class165 {

    @ObfuscatedName("fd.a")
    public Socket field2067;

    @ObfuscatedName("fd.s")
    public class159 field2065;

    @ObfuscatedName("fd.g")
    public class171 field2064;

    public class167(Socket arg0, int arg1, int arg2) throws IOException {
        this.field2067 = arg0;
        this.field2067.setSoTimeout(30000);
        this.field2067.setTcpNoDelay(true);
        this.field2067.setReceiveBufferSize(65536);
        this.field2067.setSendBufferSize(65536);
        this.field2065 = new class159(this.field2067.getInputStream(), arg1);
        this.field2064 = new class171(this.field2067.getOutputStream(), arg2);
    }

    @ObfuscatedName("fd.a(II)Z")
    public boolean method3250(int arg0) throws IOException {
        return this.field2065.method3191(arg0);
    }

    @ObfuscatedName("fd.s(B)I")
    public int method3252() throws IOException {
        return this.field2065.method3190();
    }

    @ObfuscatedName("fd.g(I)I")
    public int method3253() throws IOException {
        return this.field2065.method3192();
    }

    @ObfuscatedName("fd.x([BIIB)I")
    public int method3258(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field2065.method3201(arg0, arg1, arg2);
    }

    @ObfuscatedName("fd.h([BIII)V")
    public void method3255(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field2064.method3305(arg0, arg1, arg2);
    }

    @ObfuscatedName("fd.f(B)V")
    public void method3251() {
        this.field2064.method3306();
        try {
            this.field2067.close();
        } catch (IOException var2) {
        }
        this.field2065.method3194();
    }

    public void finalize() {
        this.method3251();
    }
}
