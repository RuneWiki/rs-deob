package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("ft")
public class class173 extends class171 {

    @ObfuscatedName("ft.m")
    public Socket field2062;

    @ObfuscatedName("ft.f")
    public class165 field2061;

    @ObfuscatedName("ft.q")
    public class177 field2059;

    public class173(Socket arg0, int arg1, int arg2) throws IOException {
        this.field2062 = arg0;
        this.field2062.setSoTimeout(30000);
        this.field2062.setTcpNoDelay(true);
        this.field2062.setReceiveBufferSize(65536);
        this.field2062.setSendBufferSize(65536);
        this.field2061 = new class165(this.field2062.getInputStream(), arg1);
        this.field2059 = new class177(this.field2062.getOutputStream(), arg2);
    }

    @ObfuscatedName("ft.f(II)Z")
    public boolean method3174(int arg0) throws IOException {
        return this.field2061.method3117(arg0);
    }

    @ObfuscatedName("ft.q(I)I")
    public int method3173() throws IOException {
        return this.field2061.method3122();
    }

    @ObfuscatedName("ft.w(I)I")
    public int method3177() throws IOException {
        return this.field2061.method3119();
    }

    @ObfuscatedName("ft.o([BIII)I")
    public int method3180(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field2061.method3127(arg0, arg1, arg2);
    }

    @ObfuscatedName("ft.u([BIIB)V")
    public void method3178(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field2059.method3243(arg0, arg1, arg2);
    }

    @ObfuscatedName("ft.g(I)V")
    public void method3179() {
        this.field2059.method3244();
        try {
            this.field2062.close();
        } catch (IOException var2) {
        }
        this.field2061.method3121();
    }

    public void finalize() {
        this.method3179();
    }
}
