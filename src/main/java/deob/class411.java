package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("pr")
public class class411 extends class410 {

    @ObfuscatedName("pr.aj")
    public Socket field4546;

    @ObfuscatedName("pr.al")
    public class412 field4544;

    @ObfuscatedName("pr.ac")
    public class413 field4545;

    public class411(Socket arg0, int arg1, int arg2) throws IOException {
        this.field4546 = arg0;
        this.field4546.setSoTimeout(30000);
        this.field4546.setTcpNoDelay(true);
        this.field4546.setReceiveBufferSize(65536);
        this.field4546.setSendBufferSize(65536);
        this.field4544 = new class412(this.field4546.getInputStream(), arg1);
        this.field4545 = new class413(this.field4546.getOutputStream(), arg2);
    }

    @ObfuscatedName("pr.aj(II)Z")
    public boolean method7035(int arg0) throws IOException {
        return this.field4544.method7062(arg0);
    }

    @ObfuscatedName("pr.al(I)I")
    public int method7036() throws IOException {
        return this.field4544.method7061();
    }

    @ObfuscatedName("pr.ac(B)I")
    public int method7037() throws IOException {
        return this.field4544.method7063();
    }

    @ObfuscatedName("pr.ab([BIIB)I")
    public int method7038(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field4544.method7064(arg0, arg1, arg2);
    }

    @ObfuscatedName("pr.an([BIII)V")
    public void method7039(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field4545.method7078(arg0, arg1, arg2);
    }

    @ObfuscatedName("pr.ao(B)V")
    public void method7040() {
        this.field4545.method7083();
        try {
            this.field4546.close();
        } catch (IOException var2) {
        }
        this.field4544.method7065();
    }

    public void finalize() {
        this.method7040();
    }
}
