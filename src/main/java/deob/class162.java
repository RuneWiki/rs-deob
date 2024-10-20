package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fs")
public class class162 extends class160 {

    @ObfuscatedName("fs.n")
    public Socket field2185;

    @ObfuscatedName("fs.v")
    public class154 field2187;

    @ObfuscatedName("fs.y")
    public class166 field2189;

    public class162(Socket arg0, int arg1, int arg2) throws IOException {
        this.field2185 = arg0;
        this.field2185.setSoTimeout(30000);
        this.field2185.setTcpNoDelay(true);
        this.field2185.setReceiveBufferSize(65536);
        this.field2185.setSendBufferSize(65536);
        this.field2187 = new class154(this.field2185.getInputStream(), arg1);
        this.field2189 = new class166(this.field2185.getOutputStream(), arg2);
    }

    @ObfuscatedName("fs.v(II)Z")
    public boolean method2810(int arg0) throws IOException {
        return this.field2187.method2753(arg0);
    }

    @ObfuscatedName("fs.y(I)I")
    public int method2816() throws IOException {
        return this.field2187.method2767();
    }

    @ObfuscatedName("fs.r(I)I")
    public int method2809() throws IOException {
        return this.field2187.method2754();
    }

    @ObfuscatedName("fs.h([BIII)I")
    public int method2813(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field2187.method2755(arg0, arg1, arg2);
    }

    @ObfuscatedName("fs.d([BIII)V")
    public void method2811(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field2189.method2873(arg0, arg1, arg2);
    }

    @ObfuscatedName("fs.s(B)V")
    public void method2826() {
        this.field2189.method2874();
        try {
            this.field2185.close();
        } catch (IOException var2) {
        }
        this.field2187.method2756();
    }

    public void finalize() {
        this.method2826();
    }
}
