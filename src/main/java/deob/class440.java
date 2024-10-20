package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("qy")
public class class440 extends class439 {

    @ObfuscatedName("qy.au")
    public Socket field4679;

    @ObfuscatedName("qy.ae")
    public class441 field4678;

    @ObfuscatedName("qy.ao")
    public class442 field4677;

    public class440(Socket arg0, int arg1, int arg2) throws IOException {
        this.field4679 = arg0;
        this.field4679.setSoTimeout(30000);
        this.field4679.setTcpNoDelay(true);
        this.field4679.setReceiveBufferSize(65536);
        this.field4679.setSendBufferSize(65536);
        this.field4678 = new class441(this.field4679.getInputStream(), arg1);
        this.field4677 = new class442(this.field4679.getOutputStream(), arg2);
    }

    @ObfuscatedName("qy.au(IB)Z")
    public boolean method7364(int arg0) throws IOException {
        return this.field4678.method7395(arg0);
    }

    @ObfuscatedName("qy.ae(I)I")
    public int method7368() throws IOException {
        return this.field4678.method7413();
    }

    @ObfuscatedName("qy.ao(I)I")
    public int method7380() throws IOException {
        return this.field4678.method7397();
    }

    @ObfuscatedName("qy.at([BIIS)I")
    public int method7367(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field4678.method7398(arg0, arg1, arg2);
    }

    @ObfuscatedName("qy.ac([BIII)V")
    public void method7369(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field4677.method7421(arg0, arg1, arg2);
    }

    @ObfuscatedName("qy.ai(I)V")
    public void method7386() {
        this.field4677.method7420();
        try {
            this.field4679.close();
        } catch (IOException var2) {
        }
        this.field4678.method7399();
    }

    public void finalize() {
        this.method7386();
    }
}
