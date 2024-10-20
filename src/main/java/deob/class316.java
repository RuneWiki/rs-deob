package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("lc")
public class class316 extends class315 {

    @ObfuscatedName("lc.x")
    public Socket field3775;

    @ObfuscatedName("lc.m")
    public class319 field3771;

    @ObfuscatedName("lc.k")
    public class317 field3773;

    public class316(Socket arg0, int arg1, int arg2) throws IOException {
        this.field3775 = arg0;
        this.field3775.setSoTimeout(30000);
        this.field3775.setTcpNoDelay(true);
        this.field3775.setReceiveBufferSize(65536);
        this.field3775.setSendBufferSize(65536);
        this.field3771 = new class319(this.field3775.getInputStream(), arg1);
        this.field3773 = new class317(this.field3775.getOutputStream(), arg2);
    }

    @ObfuscatedName("lc.d(IB)Z")
    public boolean method3289(int arg0) throws IOException {
        return this.field3771.method5462(arg0);
    }

    @ObfuscatedName("lc.k(I)I")
    public int method3290() throws IOException {
        return this.field3771.method5463();
    }

    @ObfuscatedName("lc.m(I)I")
    public int method3284() throws IOException {
        return this.field3771.method5464();
    }

    @ObfuscatedName("lc.w([BIIB)I")
    public int method3296(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field3771.method5466(arg0, arg1, arg2);
    }

    @ObfuscatedName("lc.q([BIII)V")
    public void method3293(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field3773.method5433(arg0, arg1, arg2);
    }

    @ObfuscatedName("lc.x(B)V")
    public void method3285() {
        this.field3773.method5440();
        try {
            this.field3775.close();
        } catch (IOException var2) {
        }
        this.field3771.method5473();
    }

    public void finalize() {
        this.method3285();
    }
}
