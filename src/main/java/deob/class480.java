package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("sf")
public class class480 extends class479 {

    @ObfuscatedName("sf.aq")
    public Socket field4986;

    @ObfuscatedName("sf.ad")
    public class481 field4987;

    @ObfuscatedName("sf.ag")
    public class482 field4988;

    public class480(Socket arg0, int arg1, int arg2) throws IOException {
        this.field4986 = arg0;
        this.field4986.setSoTimeout(30000);
        this.field4986.setTcpNoDelay(true);
        this.field4986.setReceiveBufferSize(65536);
        this.field4986.setSendBufferSize(65536);
        this.field4987 = new class481(this.field4986.getInputStream(), arg1);
        this.field4988 = new class482(this.field4986.getOutputStream(), arg2);
    }

    @ObfuscatedName("sf.aq(II)Z")
    public boolean method7961(int arg0) throws IOException {
        return this.field4987.method7983(arg0);
    }

    @ObfuscatedName("sf.ad(I)I")
    public int method7970() throws IOException {
        return this.field4987.method7984();
    }

    @ObfuscatedName("sf.ag(I)I")
    public int method7963() throws IOException {
        return this.field4987.method8000();
    }

    @ObfuscatedName("sf.ak([BIIB)I")
    public int method7968(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field4987.method8003(arg0, arg1, arg2);
    }

    @ObfuscatedName("sf.ap([BIII)V")
    public void method7965(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field4988.method8007(arg0, arg1, arg2);
    }

    @ObfuscatedName("sf.an(S)V")
    public void method7966() {
        this.field4988.method8008();
        try {
            this.field4986.close();
        } catch (IOException var2) {
        }
        this.field4987.method8004();
    }

    public void finalize() {
        this.method7966();
    }
}
