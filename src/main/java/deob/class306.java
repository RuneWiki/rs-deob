package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("kg")
public class class306 extends class305 {

    @ObfuscatedName("kg.a")
    public Socket field3757;

    @ObfuscatedName("kg.t")
    public class309 field3758;

    @ObfuscatedName("kg.n")
    public class307 field3756;

    public class306(Socket arg0, int arg1, int arg2) throws IOException {
        this.field3757 = arg0;
        this.field3757.setSoTimeout(30000);
        this.field3757.setTcpNoDelay(true);
        this.field3757.setReceiveBufferSize(65536);
        this.field3757.setSendBufferSize(65536);
        this.field3758 = new class309(this.field3757.getInputStream(), arg1);
        this.field3756 = new class307(this.field3757.getOutputStream(), arg2);
    }

    @ObfuscatedName("kg.q(II)Z")
    public boolean method3296(int arg0) throws IOException {
        return this.field3758.method5467(arg0);
    }

    @ObfuscatedName("kg.n(B)I")
    public int method3291() throws IOException {
        return this.field3758.method5448();
    }

    @ObfuscatedName("kg.t(B)I")
    public int method3315() throws IOException {
        return this.field3758.method5449();
    }

    @ObfuscatedName("kg.v([BIII)I")
    public int method3318(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field3758.method5450(arg0, arg1, arg2);
    }

    @ObfuscatedName("kg.c([BIII)V")
    public void method3299(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field3756.method5431(arg0, arg1, arg2);
    }

    @ObfuscatedName("kg.a(I)V")
    public void method3292() {
        this.field3756.method5432();
        try {
            this.field3757.close();
        } catch (IOException var2) {
        }
        this.field3758.method5451();
    }

    public void finalize() {
        this.method3292();
    }
}
