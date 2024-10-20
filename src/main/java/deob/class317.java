package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("lf")
public class class317 extends class316 {

    @ObfuscatedName("lf.n")
    public Socket field3807;

    @ObfuscatedName("lf.v")
    public class320 field3806;

    @ObfuscatedName("lf.d")
    public class318 field3805;

    public class317(Socket arg0, int arg1, int arg2) throws IOException {
        this.field3807 = arg0;
        this.field3807.setSoTimeout(30000);
        this.field3807.setTcpNoDelay(true);
        this.field3807.setReceiveBufferSize(65536);
        this.field3807.setSendBufferSize(65536);
        this.field3806 = new class320(this.field3807.getInputStream(), arg1);
        this.field3805 = new class318(this.field3807.getOutputStream(), arg2);
    }

    @ObfuscatedName("lf.c(II)Z")
    public boolean method3418(int arg0) throws IOException {
        return this.field3806.method5600(arg0);
    }

    @ObfuscatedName("lf.d(B)I")
    public int method3415() throws IOException {
        return this.field3806.method5601();
    }

    @ObfuscatedName("lf.v(B)I")
    public int method3414() throws IOException {
        return this.field3806.method5602();
    }

    @ObfuscatedName("lf.y([BIIB)I")
    public int method3428(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field3806.method5603(arg0, arg1, arg2);
    }

    @ObfuscatedName("lf.z([BIII)V")
    public void method3419(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field3805.method5581(arg0, arg1, arg2);
    }

    @ObfuscatedName("lf.n(I)V")
    public void method3413() {
        this.field3805.method5574();
        try {
            this.field3807.close();
        } catch (IOException var2) {
        }
        this.field3806.method5604();
    }

    public void finalize() {
        this.method3413();
    }
}
