package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("np")
public class class378 extends class377 {

    @ObfuscatedName("np.c")
    public Socket field4335;

    @ObfuscatedName("np.v")
    public class379 field4336;

    @ObfuscatedName("np.q")
    public class380 field4337;

    public class378(Socket arg0, int arg1, int arg2) throws IOException {
        this.field4335 = arg0;
        this.field4335.setSoTimeout(30000);
        this.field4335.setTcpNoDelay(true);
        this.field4335.setReceiveBufferSize(65536);
        this.field4335.setSendBufferSize(65536);
        this.field4336 = new class379(this.field4335.getInputStream(), arg1);
        this.field4337 = new class380(this.field4335.getOutputStream(), arg2);
    }

    @ObfuscatedName("np.v(IB)Z")
    public boolean method6191(int arg0) throws IOException {
        return this.field4336.method6234(arg0);
    }

    @ObfuscatedName("np.q(I)I")
    public int method6192() throws IOException {
        return this.field4336.method6227();
    }

    @ObfuscatedName("np.f(I)I")
    public int method6190() throws IOException {
        return this.field4336.method6228();
    }

    @ObfuscatedName("np.j([BIII)I")
    public int method6194(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field4336.method6229(arg0, arg1, arg2);
    }

    @ObfuscatedName("np.e([BIII)V")
    public void method6210(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field4337.method6241(arg0, arg1, arg2);
    }

    @ObfuscatedName("np.g(I)V")
    public void method6196() {
        this.field4337.method6243();
        try {
            this.field4335.close();
        } catch (IOException var2) {
        }
        this.field4336.method6230();
    }

    public void finalize() {
        this.method6196();
    }
}
