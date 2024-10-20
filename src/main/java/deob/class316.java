package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("lk")
public class class316 extends class315 {

    @ObfuscatedName("lk.z")
    public Socket field3798;

    @ObfuscatedName("lk.k")
    public class319 field3797;

    @ObfuscatedName("lk.s")
    public class317 field3796;

    public class316(Socket arg0, int arg1, int arg2) throws IOException {
        this.field3798 = arg0;
        this.field3798.setSoTimeout(30000);
        this.field3798.setTcpNoDelay(true);
        this.field3798.setReceiveBufferSize(65536);
        this.field3798.setSendBufferSize(65536);
        this.field3797 = new class319(this.field3798.getInputStream(), arg1);
        this.field3796 = new class317(this.field3798.getOutputStream(), arg2);
    }

    @ObfuscatedName("lk.t(IB)Z")
    public boolean method3311(int arg0) throws IOException {
        return this.field3797.method5537(arg0);
    }

    @ObfuscatedName("lk.s(B)I")
    public int method3310() throws IOException {
        return this.field3797.method5536();
    }

    @ObfuscatedName("lk.k(B)I")
    public int method3309() throws IOException {
        return this.field3797.method5534();
    }

    @ObfuscatedName("lk.i([BIII)I")
    public int method3312(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field3797.method5538(arg0, arg1, arg2);
    }

    @ObfuscatedName("lk.x([BIIB)V")
    public void method3315(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field3796.method5513(arg0, arg1, arg2);
    }

    @ObfuscatedName("lk.z(I)V")
    public void method3308() {
        this.field3796.method5514();
        try {
            this.field3798.close();
        } catch (IOException var2) {
        }
        this.field3797.method5539();
    }

    public void finalize() {
        this.method3308();
    }
}
