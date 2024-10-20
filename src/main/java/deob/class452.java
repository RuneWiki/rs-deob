package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("re")
public class class452 extends class451 {

    @ObfuscatedName("re.at")
    public Socket field4710;

    @ObfuscatedName("re.ah")
    public class453 field4711;

    @ObfuscatedName("re.ar")
    public class454 field4709;

    public class452(Socket arg0, int arg1, int arg2) throws IOException {
        this.field4710 = arg0;
        this.field4710.setSoTimeout(30000);
        this.field4710.setTcpNoDelay(true);
        this.field4710.setReceiveBufferSize(65536);
        this.field4710.setSendBufferSize(65536);
        this.field4711 = new class453(this.field4710.getInputStream(), arg1);
        this.field4709 = new class454(this.field4710.getOutputStream(), arg2);
    }

    @ObfuscatedName("re.ah(II)Z")
    public boolean method7528(int arg0) throws IOException {
        return this.field4711.method7551(arg0);
    }

    @ObfuscatedName("re.ar(I)I")
    public int method7544() throws IOException {
        return this.field4711.method7550();
    }

    @ObfuscatedName("re.ao(I)I")
    public int method7530() throws IOException {
        return this.field4711.method7553();
    }

    @ObfuscatedName("re.ab([BIIB)I")
    public int method7531(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field4711.method7554(arg0, arg1, arg2);
    }

    @ObfuscatedName("re.au([BIII)V")
    public void method7532(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field4709.method7571(arg0, arg1, arg2);
    }

    @ObfuscatedName("re.aa(I)V")
    public void method7538() {
        this.field4709.method7581();
        try {
            this.field4710.close();
        } catch (IOException var2) {
        }
        this.field4711.method7555();
    }

    public void finalize() {
        this.method7538();
    }
}
