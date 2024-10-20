package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fl")
public class class162 extends class160 {

    @ObfuscatedName("fl.v")
    public Socket field2026;

    @ObfuscatedName("fl.s")
    public class154 field2025;

    @ObfuscatedName("fl.o")
    public class166 field2027;

    public class162(Socket arg0, int arg1, int arg2) throws IOException {
        this.field2026 = arg0;
        this.field2026.setSoTimeout(30000);
        this.field2026.setTcpNoDelay(true);
        this.field2026.setReceiveBufferSize(65536);
        this.field2026.setSendBufferSize(65536);
        this.field2025 = new class154(this.field2026.getInputStream(), arg1);
        this.field2027 = new class166(this.field2026.getOutputStream(), arg2);
    }

    @ObfuscatedName("fl.s(II)Z")
    public boolean method3037(int arg0) throws IOException {
        return this.field2025.method2972(arg0);
    }

    @ObfuscatedName("fl.o(I)I")
    public int method3038() throws IOException {
        return this.field2025.method2973();
    }

    @ObfuscatedName("fl.k(I)I")
    public int method3051() throws IOException {
        return this.field2025.method2986();
    }

    @ObfuscatedName("fl.u([BIII)I")
    public int method3042(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field2025.method2978(arg0, arg1, arg2);
    }

    @ObfuscatedName("fl.i([BIII)V")
    public void method3041(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field2027.method3093(arg0, arg1, arg2);
    }

    @ObfuscatedName("fl.t(I)V")
    public void method3036() {
        this.field2027.method3094();
        try {
            this.field2026.close();
        } catch (IOException var2) {
        }
        this.field2025.method2975();
    }

    public void finalize() {
        this.method3036();
    }
}
