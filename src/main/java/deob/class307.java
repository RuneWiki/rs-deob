package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("kw")
public class class307 extends class306 {

    @ObfuscatedName("kw.c")
    public Socket field3764;

    @ObfuscatedName("kw.t")
    public class310 field3765;

    @ObfuscatedName("kw.o")
    public class308 field3766;

    public class307(Socket arg0, int arg1, int arg2) throws IOException {
        this.field3764 = arg0;
        this.field3764.setSoTimeout(30000);
        this.field3764.setTcpNoDelay(true);
        this.field3764.setReceiveBufferSize(65536);
        this.field3764.setSendBufferSize(65536);
        this.field3765 = new class310(this.field3764.getInputStream(), arg1);
        this.field3766 = new class308(this.field3764.getOutputStream(), arg2);
    }

    @ObfuscatedName("kw.e(II)Z")
    public boolean method3288(int arg0) throws IOException {
        return this.field3765.method5457(arg0);
    }

    @ObfuscatedName("kw.o(I)I")
    public int method3295() throws IOException {
        return this.field3765.method5449();
    }

    @ObfuscatedName("kw.t(B)I")
    public int method3270() throws IOException {
        return this.field3765.method5454();
    }

    @ObfuscatedName("kw.i([BIII)I")
    public int method3284(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field3765.method5461(arg0, arg1, arg2);
    }

    @ObfuscatedName("kw.d([BIII)V")
    public void method3274(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field3766.method5420(arg0, arg1, arg2);
    }

    @ObfuscatedName("kw.c(I)V")
    public void method3269() {
        this.field3766.method5421();
        try {
            this.field3764.close();
        } catch (IOException var2) {
        }
        this.field3765.method5458();
    }

    public void finalize() {
        this.method3269();
    }
}
