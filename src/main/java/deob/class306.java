package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("ky")
public abstract class class306 {

    @ObfuscatedName("ki.ag(Ljava/net/Socket;IIB)Lky;")
    public static class306 method5343(Socket arg0, int arg1, int arg2) throws IOException {
        return new class307(arg0, arg1, arg2);
    }

    @ObfuscatedName("ky.p(II)Z")
    public abstract boolean method3216(int arg0) throws IOException;

    @ObfuscatedName("ky.e(B)I")
    public abstract int method3206() throws IOException;

    @ObfuscatedName("ky.w(B)I")
    public abstract int method3205() throws IOException;

    @ObfuscatedName("ky.k([BIIB)I")
    public abstract int method3208(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("ky.b([BIII)V")
    public abstract void method3210(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("ky.q(I)V")
    public abstract void method3204();
}
