package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("so")
public class class483 extends class482 {

    @ObfuscatedName("so.ac")
    public Socket field5028;

    @ObfuscatedName("so.ae")
    public class484 field5027;

    @ObfuscatedName("so.ag")
    public class485 field5026;

    public class483(Socket arg0, int arg1, int arg2) throws IOException {
        this.field5028 = arg0;
        this.field5028.setSoTimeout(30000);
        this.field5028.setTcpNoDelay(true);
        this.field5028.setReceiveBufferSize(65536);
        this.field5028.setSendBufferSize(65536);
        this.field5027 = new class484(this.field5028.getInputStream(), arg1);
        this.field5026 = new class485(this.field5028.getOutputStream(), arg2);
    }

    @ObfuscatedName("so.ae(II)Z")
    public boolean method8206(int arg0) throws IOException {
        return this.field5027.method8233(arg0);
    }

    @ObfuscatedName("so.ag(I)I")
    public int method8220() throws IOException {
        return this.field5027.method8226();
    }

    @ObfuscatedName("so.am(I)I")
    public int method8195() throws IOException {
        return this.field5027.method8227();
    }

    @ObfuscatedName("so.ax([BIIB)I")
    public int method8196(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field5027.method8228(arg0, arg1, arg2);
    }

    @ObfuscatedName("so.aq([BIII)V")
    public void method8216(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field5026.method8248(arg0, arg1, arg2);
    }

    @ObfuscatedName("so.af(I)V")
    public void method8198() {
        this.field5026.method8246();
        try {
            this.field5028.close();
        } catch (IOException var2) {
        }
        this.field5027.method8229();
    }

    public void finalize() {
        this.method8198();
    }
}
