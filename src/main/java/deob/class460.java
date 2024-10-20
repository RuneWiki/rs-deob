package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("ro")
public class class460 extends class459 {

    @ObfuscatedName("ro.az")
    public Socket field4816;

    @ObfuscatedName("ro.ah")
    public class461 field4815;

    @ObfuscatedName("ro.af")
    public class462 field4814;

    public class460(Socket arg0, int arg1, int arg2) throws IOException {
        this.field4816 = arg0;
        this.field4816.setSoTimeout(30000);
        this.field4816.setTcpNoDelay(true);
        this.field4816.setReceiveBufferSize(65536);
        this.field4816.setSendBufferSize(65536);
        this.field4815 = new class461(this.field4816.getInputStream(), arg1);
        this.field4814 = new class462(this.field4816.getOutputStream(), arg2);
    }

    @ObfuscatedName("ro.az(II)Z")
    public boolean method7546(int arg0) throws IOException {
        return this.field4815.method7569(arg0);
    }

    @ObfuscatedName("ro.ah(I)I")
    public int method7550() throws IOException {
        return this.field4815.method7570();
    }

    @ObfuscatedName("ro.af(I)I")
    public int method7548() throws IOException {
        return this.field4815.method7584();
    }

    @ObfuscatedName("ro.at([BIIB)I")
    public int method7549(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field4815.method7580(arg0, arg1, arg2);
    }

    @ObfuscatedName("ro.an([BIII)V")
    public void method7555(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field4814.method7590(arg0, arg1, arg2);
    }

    @ObfuscatedName("ro.ao(B)V")
    public void method7551() {
        this.field4814.method7591();
        try {
            this.field4816.close();
        } catch (IOException var2) {
        }
        this.field4815.method7574();
    }

    public void finalize() {
        this.method7551();
    }
}
