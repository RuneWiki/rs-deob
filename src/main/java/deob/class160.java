package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fo")
public class class160 extends class158 {

    @ObfuscatedName("fo.w")
    public Socket field2004;

    @ObfuscatedName("fo.m")
    public class152 field2005;

    @ObfuscatedName("fo.q")
    public class164 field2006;

    public class160(Socket arg0, int arg1, int arg2) throws IOException {
        this.field2004 = arg0;
        this.field2004.setSoTimeout(30000);
        this.field2004.setTcpNoDelay(true);
        this.field2004.setReceiveBufferSize(65536);
        this.field2004.setSendBufferSize(65536);
        this.field2005 = new class152(this.field2004.getInputStream(), arg1);
        this.field2006 = new class164(this.field2004.getOutputStream(), arg2);
    }

    @ObfuscatedName("fo.m(II)Z")
    public boolean method3038(int arg0) throws IOException {
        return this.field2005.method2981(arg0);
    }

    @ObfuscatedName("fo.q(I)I")
    public int method3037() throws IOException {
        return this.field2005.method2986();
    }

    @ObfuscatedName("fo.x(I)I")
    public int method3040() throws IOException {
        return this.field2005.method2982();
    }

    @ObfuscatedName("fo.j([BIII)I")
    public int method3041(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field2005.method2983(arg0, arg1, arg2);
    }

    @ObfuscatedName("fo.a([BIII)V")
    public void method3042(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field2006.method3101(arg0, arg1, arg2);
    }

    @ObfuscatedName("fo.l(I)V")
    public void method3043() {
        this.field2006.method3099();
        try {
            this.field2004.close();
        } catch (IOException var2) {
        }
        this.field2005.method2984();
    }

    public void finalize() {
        this.method3043();
    }
}
