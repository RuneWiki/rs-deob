package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("lx")
public class class331 extends class330 {

    @ObfuscatedName("lx.s")
    public class332 field3878;

    @ObfuscatedName("lx.t")
    public Socket field3877;

    @ObfuscatedName("lx.v")
    public class333 field3876;

    public class331(Socket arg0, int arg1, int arg2) throws IOException {
        this.field3877 = arg0;
        this.field3877.setSoTimeout(30000);
        this.field3877.setTcpNoDelay(true);
        this.field3877.setReceiveBufferSize(65536);
        this.field3877.setSendBufferSize(65536);
        this.field3878 = new class332(this.field3877.getInputStream(), arg1);
        this.field3876 = new class333(this.field3877.getOutputStream(), arg2);
    }

    @ObfuscatedName("lx.j(IB)Z")
    public boolean method2336(int arg0) throws IOException {
        return this.field3878.method5312(arg0);
    }

    @ObfuscatedName("lx.v(B)I")
    public int method2338() throws IOException {
        return this.field3878.method5332();
    }

    @ObfuscatedName("lx.t(I)I")
    public int method2367() throws IOException {
        return this.field3878.method5310();
    }

    @ObfuscatedName("lx.l([BIII)I")
    public int method2337(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field3878.method5314(arg0, arg1, arg2);
    }

    @ObfuscatedName("lx.w([BIIB)V")
    public void method2342(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field3876.method5351(arg0, arg1, arg2);
    }

    @ObfuscatedName("lx.s(S)V")
    public void method2335() {
        this.field3876.method5338();
        try {
            this.field3877.close();
        } catch (IOException var2) {
        }
        this.field3878.method5317();
    }

    public void finalize() {
        this.method2335();
    }
}
