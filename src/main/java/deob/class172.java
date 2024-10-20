package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fg")
public class class172 extends class170 {

    @ObfuscatedName("fg.d")
    public Socket field2222;

    @ObfuscatedName("fg.z")
    public class164 field2224;

    @ObfuscatedName("fg.n")
    public class176 field2221;

    public class172(Socket arg0, int arg1, int arg2) throws IOException {
        this.field2222 = arg0;
        this.field2222.setSoTimeout(30000);
        this.field2222.setTcpNoDelay(true);
        this.field2222.setReceiveBufferSize(65536);
        this.field2222.setSendBufferSize(65536);
        this.field2224 = new class164(this.field2222.getInputStream(), arg1);
        this.field2221 = new class176(this.field2222.getOutputStream(), arg2);
    }

    @ObfuscatedName("fg.d(II)Z")
    public boolean method3061(int arg0) throws IOException {
        return this.field2224.method2999(arg0);
    }

    @ObfuscatedName("fg.z(I)I")
    public int method3054() throws IOException {
        return this.field2224.method3012();
    }

    @ObfuscatedName("fg.n(I)I")
    public int method3048() throws IOException {
        return this.field2224.method3000();
    }

    @ObfuscatedName("fg.r([BIII)I")
    public int method3057(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field2224.method3003(arg0, arg1, arg2);
    }

    @ObfuscatedName("fg.e([BIII)V")
    public void method3050(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field2221.method3108(arg0, arg1, arg2);
    }

    @ObfuscatedName("fg.y(I)V")
    public void method3049() {
        this.field2221.method3104();
        try {
            this.field2222.close();
        } catch (IOException var2) {
        }
        this.field2224.method3002();
    }

    public void finalize() {
        this.method3049();
    }
}
