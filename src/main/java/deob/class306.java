package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("ko")
public class class306 extends class305 {

    @ObfuscatedName("ko.s")
    public class309 field3764;

    @ObfuscatedName("ko.j")
    public Socket field3766;

    @ObfuscatedName("ko.i")
    public class307 field3765;

    public class306(Socket arg0, int arg1, int arg2) throws IOException {
        this.field3766 = arg0;
        this.field3766.setSoTimeout(30000);
        this.field3766.setTcpNoDelay(true);
        this.field3766.setReceiveBufferSize(65536);
        this.field3766.setSendBufferSize(65536);
        this.field3764 = new class309(this.field3766.getInputStream(), arg1);
        this.field3765 = new class307(this.field3766.getOutputStream(), arg2);
    }

    @ObfuscatedName("ko.k(II)Z")
    public boolean method3226(int arg0) throws IOException {
        return this.field3764.method5363(arg0);
    }

    @ObfuscatedName("ko.i(B)I")
    public int method3244() throws IOException {
        return this.field3764.method5370();
    }

    @ObfuscatedName("ko.j(I)I")
    public int method3251() throws IOException {
        return this.field3764.method5365();
    }

    @ObfuscatedName("ko.u([BIIB)I")
    public int method3227(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field3764.method5366(arg0, arg1, arg2);
    }

    @ObfuscatedName("ko.t([BIII)V")
    public void method3229(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field3765.method5339(arg0, arg1, arg2);
    }

    @ObfuscatedName("ko.s(I)V")
    public void method3223() {
        this.field3765.method5336();
        try {
            this.field3766.close();
        } catch (IOException var2) {
        }
        this.field3764.method5376();
    }

    public void finalize() {
        this.method3223();
    }
}
