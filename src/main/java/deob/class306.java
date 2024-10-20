package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("ka")
public class class306 extends class305 {

    @ObfuscatedName("ka.c")
    public Socket field3759;

    @ObfuscatedName("ka.x")
    public class309 field3756;

    @ObfuscatedName("ka.t")
    public class307 field3758;

    public class306(Socket arg0, int arg1, int arg2) throws IOException {
        this.field3759 = arg0;
        this.field3759.setSoTimeout(30000);
        this.field3759.setTcpNoDelay(true);
        this.field3759.setReceiveBufferSize(65536);
        this.field3759.setSendBufferSize(65536);
        this.field3756 = new class309(this.field3759.getInputStream(), arg1);
        this.field3758 = new class307(this.field3759.getOutputStream(), arg2);
    }

    @ObfuscatedName("ka.g(II)Z")
    public boolean method3257(int arg0) throws IOException {
        return this.field3756.method5443(arg0);
    }

    @ObfuscatedName("ka.t(I)I")
    public int method3263() throws IOException {
        return this.field3756.method5444();
    }

    @ObfuscatedName("ka.x(I)I")
    public int method3262() throws IOException {
        return this.field3756.method5447();
    }

    @ObfuscatedName("ka.l([BIII)I")
    public int method3247(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field3756.method5446(arg0, arg1, arg2);
    }

    @ObfuscatedName("ka.j([BIIB)V")
    public void method3250(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field3758.method5417(arg0, arg1, arg2);
    }

    @ObfuscatedName("ka.c(B)V")
    public void method3242() {
        this.field3758.method5419();
        try {
            this.field3759.close();
        } catch (IOException var2) {
        }
        this.field3756.method5457();
    }

    public void finalize() {
        this.method3242();
    }
}
