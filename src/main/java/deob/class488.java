package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("sh")
public class class488 extends class487 {

    @ObfuscatedName("sh.ap")
    public Socket field5057;

    @ObfuscatedName("sh.aw")
    public class489 field5058;

    @ObfuscatedName("sh.ak")
    public class490 field5059;

    public class488(Socket arg0, int arg1, int arg2) throws IOException {
        this.field5057 = arg0;
        this.field5057.setSoTimeout(30000);
        this.field5057.setTcpNoDelay(true);
        this.field5057.setReceiveBufferSize(65536);
        this.field5057.setSendBufferSize(65536);
        this.field5058 = new class489(this.field5057.getInputStream(), arg1);
        this.field5059 = new class490(this.field5057.getOutputStream(), arg2);
    }

    @ObfuscatedName("sh.aw(IB)Z")
    public boolean method8499(int arg0) throws IOException {
        return this.field5058.method8519(arg0);
    }

    @ObfuscatedName("sh.ak(B)I")
    public int method8500() throws IOException {
        return this.field5058.method8520();
    }

    @ObfuscatedName("sh.aj(B)I")
    public int method8498() throws IOException {
        return this.field5058.method8521();
    }

    @ObfuscatedName("sh.ai([BIII)I")
    public int method8501(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field5058.method8522(arg0, arg1, arg2);
    }

    @ObfuscatedName("sh.ay([BIII)V")
    public void method8502(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field5059.method8534(arg0, arg1, arg2);
    }

    @ObfuscatedName("sh.as(I)V")
    public void method8512() {
        this.field5059.method8536();
        try {
            this.field5057.close();
        } catch (IOException var2) {
        }
        this.field5058.method8523();
    }

    public void finalize() {
        this.method8512();
    }
}
