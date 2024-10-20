package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("os")
public class class398 extends class397 {

    @ObfuscatedName("os.a")
    public Socket field4508;

    @ObfuscatedName("os.f")
    public class399 field4506;

    @ObfuscatedName("os.c")
    public class400 field4504;

    public class398(Socket arg0, int arg1, int arg2) throws IOException {
        this.field4508 = arg0;
        this.field4508.setSoTimeout(30000);
        this.field4508.setTcpNoDelay(true);
        this.field4508.setReceiveBufferSize(65536);
        this.field4508.setSendBufferSize(65536);
        this.field4506 = new class399(this.field4508.getInputStream(), arg1);
        this.field4504 = new class400(this.field4508.getOutputStream(), arg2);
    }

    @ObfuscatedName("os.a(II)Z")
    public boolean method6848(int arg0) throws IOException {
        return this.field4506.method6873(arg0);
    }

    @ObfuscatedName("os.f(I)I")
    public int method6849() throws IOException {
        return this.field4506.method6874();
    }

    @ObfuscatedName("os.c(S)I")
    public int method6850() throws IOException {
        return this.field4506.method6890();
    }

    @ObfuscatedName("os.x([BIII)I")
    public int method6861(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field4506.method6876(arg0, arg1, arg2);
    }

    @ObfuscatedName("os.h([BIII)V")
    public void method6852(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field4504.method6903(arg0, arg1, arg2);
    }

    @ObfuscatedName("os.j(B)V")
    public void method6853() {
        this.field4504.method6896();
        try {
            this.field4508.close();
        } catch (IOException var2) {
        }
        this.field4506.method6877();
    }

    public void finalize() {
        this.method6853();
    }
}
