package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("kn")
public abstract class class305 {

    @ObfuscatedName("at.l(Ljava/net/Socket;III)Lkn;")
    public static class305 method656(Socket arg0, int arg1, int arg2) throws IOException {
        return new class306(arg0, arg1, arg2);
    }

    @ObfuscatedName("kn.b(B)I")
    public abstract int method3249() throws IOException;

    @ObfuscatedName("kn.f(B)I")
    public abstract int method3253() throws IOException;

    @ObfuscatedName("kn.u(B)V")
    public abstract void method3243();

    @ObfuscatedName("kn.h([BIII)V")
    public abstract void method3250(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("kn.g(II)Z")
    public abstract boolean method3267(int arg0) throws IOException;

    @ObfuscatedName("kn.z([BIIB)I")
    public abstract int method3247(byte[] arg0, int arg1, int arg2) throws IOException;
}
