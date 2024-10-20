package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fm")
public class class172 extends class170 {

    @ObfuscatedName("fm.t")
    public Socket field2198;

    @ObfuscatedName("fm.q")
    public class164 field2196;

    @ObfuscatedName("fm.i")
    public class176 field2199;

    public class172(Socket arg0, int arg1, int arg2) throws IOException {
        this.field2198 = arg0;
        this.field2198.setSoTimeout(30000);
        this.field2198.setTcpNoDelay(true);
        this.field2198.setReceiveBufferSize(65536);
        this.field2198.setSendBufferSize(65536);
        this.field2196 = new class164(this.field2198.getInputStream(), arg1);
        this.field2199 = new class176(this.field2198.getOutputStream(), arg2);
    }

    @ObfuscatedName("fm.t(IB)Z")
    public boolean method3017(int arg0) throws IOException {
        return this.field2196.method2942(arg0);
    }

    @ObfuscatedName("fm.q(I)I")
    public int method3018() throws IOException {
        return this.field2196.method2943();
    }

    @ObfuscatedName("fm.i(I)I")
    public int method3019() throws IOException {
        return this.field2196.method2944();
    }

    @ObfuscatedName("fm.a([BIII)I")
    public int method3020(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field2196.method2945(arg0, arg1, arg2);
    }

    @ObfuscatedName("fm.l([BIII)V")
    public void method3021(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field2199.method3076(arg0, arg1, arg2);
    }

    @ObfuscatedName("fm.b(I)V")
    public void method3022() {
        this.field2199.method3074();
        try {
            this.field2198.close();
        } catch (IOException var2) {
        }
        this.field2196.method2950();
    }

    public void finalize() {
        this.method3022();
    }
}
