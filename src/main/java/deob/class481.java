package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("sf")
public class class481 extends class480 {

    @ObfuscatedName("sf.ab")
    public Socket field4969;

    @ObfuscatedName("sf.ay")
    public class482 field4966;

    @ObfuscatedName("sf.an")
    public class483 field4967;

    public class481(Socket arg0, int arg1, int arg2) throws IOException {
        this.field4969 = arg0;
        this.field4969.setSoTimeout(30000);
        this.field4969.setTcpNoDelay(true);
        this.field4969.setReceiveBufferSize(65536);
        this.field4969.setSendBufferSize(65536);
        this.field4966 = new class482(this.field4969.getInputStream(), arg1);
        this.field4967 = new class483(this.field4969.getOutputStream(), arg2);
    }

    @ObfuscatedName("sf.ab(II)Z")
    public boolean method8070(int arg0) throws IOException {
        return this.field4966.method8086(arg0);
    }

    @ObfuscatedName("sf.ay(I)I")
    public int method8079() throws IOException {
        return this.field4966.method8088();
    }

    @ObfuscatedName("sf.an(I)I")
    public int method8066() throws IOException {
        return this.field4966.method8087();
    }

    @ObfuscatedName("sf.au([BIIB)I")
    public int method8067(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field4966.method8089(arg0, arg1, arg2);
    }

    @ObfuscatedName("sf.ax([BIII)V")
    public void method8068(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field4967.method8108(arg0, arg1, arg2);
    }

    @ObfuscatedName("sf.ao(I)V")
    public void method8069() {
        this.field4967.method8111();
        try {
            this.field4969.close();
        } catch (IOException var2) {
        }
        this.field4966.method8091();
    }

    public void finalize() {
        this.method8069();
    }
}
