package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("kd")
public class class306 extends class305 {

    @ObfuscatedName("kd.z")
    public Socket field3766;

    @ObfuscatedName("kd.n")
    public class309 field3763;

    @ObfuscatedName("kd.v")
    public class307 field3764;

    public class306(Socket arg0, int arg1, int arg2) throws IOException {
        this.field3766 = arg0;
        this.field3766.setSoTimeout(30000);
        this.field3766.setTcpNoDelay(true);
        this.field3766.setReceiveBufferSize(65536);
        this.field3766.setSendBufferSize(65536);
        this.field3763 = new class309(this.field3766.getInputStream(), arg1);
        this.field3764 = new class307(this.field3766.getOutputStream(), arg2);
    }

    @ObfuscatedName("kd.u(II)Z")
    public boolean method3156(int arg0) throws IOException {
        return this.field3763.method5311(arg0);
    }

    @ObfuscatedName("kd.v(B)I")
    public int method3177() throws IOException {
        return this.field3763.method5324();
    }

    @ObfuscatedName("kd.n(I)I")
    public int method3159() throws IOException {
        return this.field3763.method5313();
    }

    @ObfuscatedName("kd.r([BIII)I")
    public int method3157(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field3763.method5314(arg0, arg1, arg2);
    }

    @ObfuscatedName("kd.q([BIIB)V")
    public void method3160(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field3764.method5291(arg0, arg1, arg2);
    }

    @ObfuscatedName("kd.z(B)V")
    public void method3184() {
        this.field3764.method5285();
        try {
            this.field3766.close();
        } catch (IOException var2) {
        }
        this.field3763.method5315();
    }

    public void finalize() {
        this.method3184();
    }
}
