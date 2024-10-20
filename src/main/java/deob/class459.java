package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("rz")
public class class459 extends class458 {

    @ObfuscatedName("rz.aq")
    public Socket field4780;

    @ObfuscatedName("rz.aw")
    public class460 field4781;

    @ObfuscatedName("rz.al")
    public class461 field4786;

    public class459(Socket arg0, int arg1, int arg2) throws IOException {
        this.field4780 = arg0;
        this.field4780.setSoTimeout(30000);
        this.field4780.setTcpNoDelay(true);
        this.field4780.setReceiveBufferSize(65536);
        this.field4780.setSendBufferSize(65536);
        this.field4781 = new class460(this.field4780.getInputStream(), arg1);
        this.field4786 = new class461(this.field4780.getOutputStream(), arg2);
    }

    @ObfuscatedName("rz.aq(II)Z")
    public boolean method7675(int arg0) throws IOException {
        return this.field4781.method7698(arg0);
    }

    @ObfuscatedName("rz.aw(I)I")
    public int method7668() throws IOException {
        return this.field4781.method7697();
    }

    @ObfuscatedName("rz.al(I)I")
    public int method7669() throws IOException {
        return this.field4781.method7705();
    }

    @ObfuscatedName("rz.ai([BIIS)I")
    public int method7670(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field4781.method7699(arg0, arg1, arg2);
    }

    @ObfuscatedName("rz.ar([BIII)V")
    public void method7671(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field4786.method7722(arg0, arg1, arg2);
    }

    @ObfuscatedName("rz.as(B)V")
    public void method7672() {
        this.field4786.method7719();
        try {
            this.field4780.close();
        } catch (IOException var2) {
        }
        this.field4781.method7709();
    }

    public void finalize() {
        this.method7672();
    }
}
