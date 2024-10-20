package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("lo")
public class class329 extends class328 {

    @ObfuscatedName("lo.f")
    public Socket field3866;

    @ObfuscatedName("lo.o")
    public class330 field3863;

    @ObfuscatedName("lo.u")
    public class331 field3865;

    public class329(Socket arg0, int arg1, int arg2) throws IOException {
        this.field3866 = arg0;
        this.field3866.setSoTimeout(30000);
        this.field3866.setTcpNoDelay(true);
        this.field3866.setReceiveBufferSize(65536);
        this.field3866.setSendBufferSize(65536);
        this.field3863 = new class330(this.field3866.getInputStream(), arg1);
        this.field3865 = new class331(this.field3866.getOutputStream(), arg2);
    }

    @ObfuscatedName("lo.p(II)Z")
    public boolean method2262(int arg0) throws IOException {
        return this.field3863.method5230(arg0);
    }

    @ObfuscatedName("lo.u(B)I")
    public int method2261() throws IOException {
        return this.field3863.method5231();
    }

    @ObfuscatedName("lo.o(B)I")
    public int method2260() throws IOException {
        return this.field3863.method5232();
    }

    @ObfuscatedName("lo.b([BIIB)I")
    public int method2291(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field3863.method5233(arg0, arg1, arg2);
    }

    @ObfuscatedName("lo.k([BIII)V")
    public void method2265(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field3865.method5268(arg0, arg1, arg2);
    }

    @ObfuscatedName("lo.f(I)V")
    public void method2268() {
        this.field3865.method5254();
        try {
            this.field3866.close();
        } catch (IOException var2) {
        }
        this.field3863.method5234();
    }

    public void finalize() {
        this.method2268();
    }
}
