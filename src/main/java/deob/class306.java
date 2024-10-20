package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("ki")
public class class306 extends class305 {

    @ObfuscatedName("ki.u")
    public Socket field3770;

    @ObfuscatedName("ki.f")
    public class309 field3767;

    @ObfuscatedName("ki.b")
    public class307 field3768;

    public class306(Socket arg0, int arg1, int arg2) throws IOException {
        this.field3770 = arg0;
        this.field3770.setSoTimeout(30000);
        this.field3770.setTcpNoDelay(true);
        this.field3770.setReceiveBufferSize(65536);
        this.field3770.setSendBufferSize(65536);
        this.field3767 = new class309(this.field3770.getInputStream(), arg1);
        this.field3768 = new class307(this.field3770.getOutputStream(), arg2);
    }

    @ObfuscatedName("ki.g(II)Z")
    public boolean method3267(int arg0) throws IOException {
        return this.field3767.method5470(arg0);
    }

    @ObfuscatedName("ki.b(B)I")
    public int method3249() throws IOException {
        return this.field3767.method5472();
    }

    @ObfuscatedName("ki.f(B)I")
    public int method3253() throws IOException {
        return this.field3767.method5473();
    }

    @ObfuscatedName("ki.z([BIIB)I")
    public int method3247(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field3767.method5474(arg0, arg1, arg2);
    }

    @ObfuscatedName("ki.h([BIII)V")
    public void method3250(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field3768.method5445(arg0, arg1, arg2);
    }

    @ObfuscatedName("ki.u(B)V")
    public void method3243() {
        this.field3768.method5442();
        try {
            this.field3770.close();
        } catch (IOException var2) {
        }
        this.field3767.method5475();
    }

    public void finalize() {
        this.method3243();
    }
}
