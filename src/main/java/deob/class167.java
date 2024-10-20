package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fl")
public class class167 extends class165 {

    @ObfuscatedName("fl.n")
    public Socket field2067;

    @ObfuscatedName("fl.h")
    public class159 field2065;

    @ObfuscatedName("fl.l")
    public class171 field2068;

    public class167(Socket arg0, int arg1, int arg2) throws IOException {
        this.field2067 = arg0;
        this.field2067.setSoTimeout(30000);
        this.field2067.setTcpNoDelay(true);
        this.field2067.setReceiveBufferSize(65536);
        this.field2067.setSendBufferSize(65536);
        this.field2065 = new class159(this.field2067.getInputStream(), arg1);
        this.field2068 = new class171(this.field2067.getOutputStream(), arg2);
    }

    @ObfuscatedName("fl.n(II)Z")
    public boolean method3274(int arg0) throws IOException {
        return this.field2065.method3218(arg0);
    }

    @ObfuscatedName("fl.h(I)I")
    public int method3270() throws IOException {
        return this.field2065.method3221();
    }

    @ObfuscatedName("fl.l(B)I")
    public int method3271() throws IOException {
        return this.field2065.method3230();
    }

    @ObfuscatedName("fl.g([BIII)I")
    public int method3272(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field2065.method3225(arg0, arg1, arg2);
    }

    @ObfuscatedName("fl.b([BIII)V")
    public void method3288(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field2068.method3329(arg0, arg1, arg2);
    }

    @ObfuscatedName("fl.a(I)V")
    public void method3287() {
        this.field2068.method3337();
        try {
            this.field2067.close();
        } catch (IOException var2) {
        }
        this.field2065.method3223();
    }

    public void finalize() {
        this.method3287();
    }
}
