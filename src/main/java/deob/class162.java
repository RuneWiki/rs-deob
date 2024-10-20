package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fk")
public class class162 extends class160 {

    @ObfuscatedName("fk.s")
    public class154 field2163;

    @ObfuscatedName("fk.g")
    public Socket field2166;

    @ObfuscatedName("fk.m")
    public class166 field2164;

    public class162(Socket arg0, int arg1, int arg2) throws IOException {
        this.field2166 = arg0;
        this.field2166.setSoTimeout(30000);
        this.field2166.setTcpNoDelay(true);
        this.field2166.setReceiveBufferSize(65536);
        this.field2166.setSendBufferSize(65536);
        this.field2163 = new class154(this.field2166.getInputStream(), arg1);
        this.field2164 = new class166(this.field2166.getOutputStream(), arg2);
    }

    @ObfuscatedName("fk.s(II)Z")
    public boolean method3018(int arg0) throws IOException {
        return this.field2163.method2963(arg0);
    }

    @ObfuscatedName("fk.g(I)I")
    public int method3019() throws IOException {
        return this.field2163.method2964();
    }

    @ObfuscatedName("fk.m(B)I")
    public int method3024() throws IOException {
        return this.field2163.method2965();
    }

    @ObfuscatedName("fk.h([BIIB)I")
    public int method3021(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field2163.method2980(arg0, arg1, arg2);
    }

    @ObfuscatedName("fk.i([BIII)V")
    public void method3029(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field2164.method3074(arg0, arg1, arg2);
    }

    @ObfuscatedName("fk.w(I)V")
    public void method3022() {
        this.field2164.method3082();
        try {
            this.field2166.close();
        } catch (IOException var2) {
        }
        this.field2163.method2973();
    }

    public void finalize() {
        this.method3022();
    }
}
