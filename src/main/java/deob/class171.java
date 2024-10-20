package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fu")
public abstract class class171 {

    @ObfuscatedName("dy.m(Ljava/net/Socket;IIB)Lfu;")
    public static class171 method2468(Socket arg0, int arg1, int arg2) throws IOException {
        return new class173(arg0, arg1, arg2);
    }

    @ObfuscatedName("fu.q(I)I")
    public abstract int method3173() throws IOException;

    @ObfuscatedName("fu.f(II)Z")
    public abstract boolean method3174(int arg0) throws IOException;

    @ObfuscatedName("fu.w(I)I")
    public abstract int method3177() throws IOException;

    @ObfuscatedName("fu.u([BIIB)V")
    public abstract void method3178(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("fu.g(I)V")
    public abstract void method3179();

    @ObfuscatedName("fu.o([BIII)I")
    public abstract int method3180(byte[] arg0, int arg1, int arg2) throws IOException;
}
