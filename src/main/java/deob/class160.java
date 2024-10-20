package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fu")
public abstract class class160 {

    @ObfuscatedName("ld.c(Ljava/net/Socket;IIB)Lfu;")
    public static class160 method5311(Socket arg0, int arg1, int arg2) throws IOException {
        return new class162(arg0, arg1, arg2);
    }

    @ObfuscatedName("fu.q(IB)Z")
    public abstract boolean method3010(int arg0) throws IOException;

    @ObfuscatedName("fu.m(I)I")
    public abstract int method3012() throws IOException;

    @ObfuscatedName("fu.i([BIII)V")
    public abstract void method3013(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("fu.g([BIII)I")
    public abstract int method3014(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("fu.j(I)I")
    public abstract int method3019() throws IOException;

    @ObfuscatedName("fu.h(I)V")
    public abstract void method3034();
}
