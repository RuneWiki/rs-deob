package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fc")
public class class162 extends class160 {

    @ObfuscatedName("fc.y")
    public Socket field2026;

    @ObfuscatedName("fc.c")
    public class154 field2023;

    @ObfuscatedName("fc.n")
    public class166 field2024;

    public class162(Socket arg0, int arg1, int arg2) throws IOException {
        this.field2026 = arg0;
        this.field2026.setSoTimeout(30000);
        this.field2026.setTcpNoDelay(true);
        this.field2026.setReceiveBufferSize(65536);
        this.field2026.setSendBufferSize(65536);
        this.field2023 = new class154(this.field2026.getInputStream(), arg1);
        this.field2024 = new class166(this.field2026.getOutputStream(), arg2);
    }

    @ObfuscatedName("fc.y(II)Z")
    public boolean method3030(int arg0) throws IOException {
        return this.field2023.method2962(arg0);
    }

    @ObfuscatedName("fc.c(I)I")
    public int method3041() throws IOException {
        return this.field2023.method2963();
    }

    @ObfuscatedName("fc.n(B)I")
    public int method3029() throws IOException {
        return this.field2023.method2964();
    }

    @ObfuscatedName("fc.u([BIIB)I")
    public int method3050(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field2023.method2965(arg0, arg1, arg2);
    }

    @ObfuscatedName("fc.i([BIII)V")
    public void method3031(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field2024.method3114(arg0, arg1, arg2);
    }

    @ObfuscatedName("fc.p(I)V")
    public void method3035() {
        this.field2024.method3105();
        try {
            this.field2026.close();
        } catch (IOException var2) {
        }
        this.field2023.method2977();
    }

    public void finalize() {
        this.method3035();
    }
}
