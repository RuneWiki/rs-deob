package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("lc")
public class class316 extends class315 {

    @ObfuscatedName("lc.m")
    public Socket field3794;

    @ObfuscatedName("lc.o")
    public class319 field3795;

    @ObfuscatedName("lc.q")
    public class317 field3796;

    public class316(Socket arg0, int arg1, int arg2) throws IOException {
        this.field3794 = arg0;
        this.field3794.setSoTimeout(30000);
        this.field3794.setTcpNoDelay(true);
        this.field3794.setReceiveBufferSize(65536);
        this.field3794.setSendBufferSize(65536);
        this.field3795 = new class319(this.field3794.getInputStream(), arg1);
        this.field3796 = new class317(this.field3794.getOutputStream(), arg2);
    }

    @ObfuscatedName("lc.j(II)Z")
    public boolean method3301(int arg0) throws IOException {
        return this.field3795.method5585(arg0);
    }

    @ObfuscatedName("lc.q(I)I")
    public int method3299() throws IOException {
        return this.field3795.method5576();
    }

    @ObfuscatedName("lc.o(B)I")
    public int method3300() throws IOException {
        return this.field3795.method5577();
    }

    @ObfuscatedName("lc.p([BIIB)I")
    public int method3302(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field3795.method5575(arg0, arg1, arg2);
    }

    @ObfuscatedName("lc.n([BIIB)V")
    public void method3304(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field3796.method5548(arg0, arg1, arg2);
    }

    @ObfuscatedName("lc.m(I)V")
    public void method3322() {
        this.field3796.method5546();
        try {
            this.field3794.close();
        } catch (IOException var2) {
        }
        this.field3795.method5579();
    }

    public void finalize() {
        this.method3322();
    }
}
