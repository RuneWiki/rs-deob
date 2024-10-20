package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("oc")
public class class408 extends class407 {

    @ObfuscatedName("oc.f")
    public Socket field4583;

    @ObfuscatedName("oc.w")
    public class409 field4584;

    @ObfuscatedName("oc.v")
    public class410 field4585;

    public class408(Socket arg0, int arg1, int arg2) throws IOException {
        this.field4583 = arg0;
        this.field4583.setSoTimeout(30000);
        this.field4583.setTcpNoDelay(true);
        this.field4583.setReceiveBufferSize(65536);
        this.field4583.setSendBufferSize(65536);
        this.field4584 = new class409(this.field4583.getInputStream(), arg1);
        this.field4585 = new class410(this.field4583.getOutputStream(), arg2);
    }

    @ObfuscatedName("oc.f(II)Z")
    public boolean method7161(int arg0) throws IOException {
        return this.field4584.method7170(arg0);
    }

    @ObfuscatedName("oc.w(B)I")
    public int method7146() throws IOException {
        return this.field4584.method7169();
    }

    @ObfuscatedName("oc.v(I)I")
    public int method7148() throws IOException {
        return this.field4584.method7172();
    }

    @ObfuscatedName("oc.s([BIII)I")
    public int method7149(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field4584.method7173(arg0, arg1, arg2);
    }

    @ObfuscatedName("oc.z([BIIS)V")
    public void method7152(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field4585.method7191(arg0, arg1, arg2);
    }

    @ObfuscatedName("oc.j(B)V")
    public void method7150() {
        this.field4585.method7189();
        try {
            this.field4583.close();
        } catch (IOException var2) {
        }
        this.field4584.method7174();
    }

    public void finalize() {
        this.method7150();
    }
}
