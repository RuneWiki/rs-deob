package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("rv")
public class class456 extends class455 {

    @ObfuscatedName("rv.am")
    public Socket field4751;

    @ObfuscatedName("rv.ap")
    public class457 field4750;

    @ObfuscatedName("rv.af")
    public class458 field4752;

    public class456(Socket arg0, int arg1, int arg2) throws IOException {
        this.field4751 = arg0;
        this.field4751.setSoTimeout(30000);
        this.field4751.setTcpNoDelay(true);
        this.field4751.setReceiveBufferSize(65536);
        this.field4751.setSendBufferSize(65536);
        this.field4750 = new class457(this.field4751.getInputStream(), arg1);
        this.field4752 = new class458(this.field4751.getOutputStream(), arg2);
    }

    @ObfuscatedName("rv.ap(II)Z")
    public boolean method7658(int arg0) throws IOException {
        return this.field4750.method7696(arg0);
    }

    @ObfuscatedName("rv.af(I)I")
    public int method7659() throws IOException {
        return this.field4750.method7686();
    }

    @ObfuscatedName("rv.aj(I)I")
    public int method7671() throws IOException {
        return this.field4750.method7687();
    }

    @ObfuscatedName("rv.aq([BIII)I")
    public int method7666(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field4750.method7690(arg0, arg1, arg2);
    }

    @ObfuscatedName("rv.ar([BIII)V")
    public void method7661(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field4752.method7705(arg0, arg1, arg2);
    }

    @ObfuscatedName("rv.ag(I)V")
    public void method7662() {
        this.field4752.method7708();
        try {
            this.field4751.close();
        } catch (IOException var2) {
        }
        this.field4750.method7689();
    }

    public void finalize() {
        this.method7662();
    }
}
