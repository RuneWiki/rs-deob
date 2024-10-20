package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("lj")
public abstract class class315 {

    @ObfuscatedName("kk.ag(Ljava/net/Socket;III)Llj;")
    public static class315 method4963(Socket arg0, int arg1, int arg2) throws IOException {
        return new class316(arg0, arg1, arg2);
    }

    @ObfuscatedName("lj.q(I)I")
    public abstract int method3299() throws IOException;

    @ObfuscatedName("lj.o(B)I")
    public abstract int method3300() throws IOException;

    @ObfuscatedName("lj.p([BIIB)I")
    public abstract int method3302(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("lj.n([BIIB)V")
    public abstract void method3304(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("lj.m(I)V")
    public abstract void method3322();

    @ObfuscatedName("lj.j(II)Z")
    public abstract boolean method3301(int arg0) throws IOException;
}
