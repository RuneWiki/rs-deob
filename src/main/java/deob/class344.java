package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("mr")
public class class344 extends class343 {

    @ObfuscatedName("mr.n")
    public Socket field3971;

    @ObfuscatedName("mr.c")
    public class345 field3972;

    @ObfuscatedName("mr.m")
    public class346 field3973;

    public class344(Socket arg0, int arg1, int arg2) throws IOException {
        this.field3971 = arg0;
        this.field3971.setSoTimeout(30000);
        this.field3971.setTcpNoDelay(true);
        this.field3971.setReceiveBufferSize(65536);
        this.field3971.setSendBufferSize(65536);
        this.field3972 = new class345(this.field3971.getInputStream(), arg1);
        this.field3973 = new class346(this.field3971.getOutputStream(), arg2);
    }

    @ObfuscatedName("mr.k(II)Z")
    public boolean method2544(int arg0) throws IOException {
        return this.field3972.method5601(arg0);
    }

    @ObfuscatedName("mr.m(I)I")
    public int method2543() throws IOException {
        return this.field3972.method5583();
    }

    @ObfuscatedName("mr.c(B)I")
    public int method2540() throws IOException {
        return this.field3972.method5584();
    }

    @ObfuscatedName("mr.o([BIII)I")
    public int method2545(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field3972.method5585(arg0, arg1, arg2);
    }

    @ObfuscatedName("mr.z([BIIB)V")
    public void method2567(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field3973.method5602(arg0, arg1, arg2);
    }

    @ObfuscatedName("mr.n(S)V")
    public void method2541() {
        this.field3973.method5603();
        try {
            this.field3971.close();
        } catch (IOException var2) {
        }
        this.field3972.method5586();
    }

    public void finalize() {
        this.method2541();
    }
}
