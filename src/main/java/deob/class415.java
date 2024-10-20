package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("pv")
public class class415 extends class414 {

    @ObfuscatedName("pv.af")
    public Socket field4610;

    @ObfuscatedName("pv.an")
    public class416 field4609;

    @ObfuscatedName("pv.aw")
    public class417 field4608;

    public class415(Socket arg0, int arg1, int arg2) throws IOException {
        this.field4610 = arg0;
        this.field4610.setSoTimeout(30000);
        this.field4610.setTcpNoDelay(true);
        this.field4610.setReceiveBufferSize(65536);
        this.field4610.setSendBufferSize(65536);
        this.field4609 = new class416(this.field4610.getInputStream(), arg1);
        this.field4608 = new class417(this.field4610.getOutputStream(), arg2);
    }

    @ObfuscatedName("pv.an(II)Z")
    public boolean method7305(int arg0) throws IOException {
        return this.field4609.method7314(arg0);
    }

    @ObfuscatedName("pv.aw(I)I")
    public int method7283() throws IOException {
        return this.field4609.method7313();
    }

    @ObfuscatedName("pv.ac(I)I")
    public int method7291() throws IOException {
        return this.field4609.method7311();
    }

    @ObfuscatedName("pv.au([BIII)I")
    public int method7289(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field4609.method7315(arg0, arg1, arg2);
    }

    @ObfuscatedName("pv.ab([BIII)V")
    public void method7286(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field4608.method7345(arg0, arg1, arg2);
    }

    @ObfuscatedName("pv.aq(I)V")
    public void method7287() {
        this.field4608.method7337();
        try {
            this.field4610.close();
        } catch (IOException var2) {
        }
        this.field4609.method7327();
    }

    public void finalize() {
        this.method7287();
    }
}
