package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("qq")
public class class441 extends class440 {

    @ObfuscatedName("qq.aw")
    public Socket field4681;

    @ObfuscatedName("qq.ay")
    public class442 field4680;

    @ObfuscatedName("qq.ar")
    public class443 field4679;

    public class441(Socket arg0, int arg1, int arg2) throws IOException {
        this.field4681 = arg0;
        this.field4681.setSoTimeout(30000);
        this.field4681.setTcpNoDelay(true);
        this.field4681.setReceiveBufferSize(65536);
        this.field4681.setSendBufferSize(65536);
        this.field4680 = new class442(this.field4681.getInputStream(), arg1);
        this.field4679 = new class443(this.field4681.getOutputStream(), arg2);
    }

    @ObfuscatedName("qq.ay(II)Z")
    public boolean method7356(int arg0) throws IOException {
        return this.field4680.method7391(arg0);
    }

    @ObfuscatedName("qq.ar(I)I")
    public int method7344() throws IOException {
        return this.field4680.method7380();
    }

    @ObfuscatedName("qq.am(B)I")
    public int method7361() throws IOException {
        return this.field4680.method7374();
    }

    @ObfuscatedName("qq.as([BIII)I")
    public int method7362(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field4680.method7375(arg0, arg1, arg2);
    }

    @ObfuscatedName("qq.aj([BIII)V")
    public void method7347(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field4679.method7395(arg0, arg1, arg2);
    }

    @ObfuscatedName("qq.ag(I)V")
    public void method7348() {
        this.field4679.method7396();
        try {
            this.field4681.close();
        } catch (IOException var2) {
        }
        this.field4680.method7376();
    }

    public void finalize() {
        this.method7348();
    }
}
