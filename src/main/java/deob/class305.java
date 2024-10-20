package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("ks")
public abstract class class305 {

    @ObfuscatedName("ku.an(Ljava/net/Socket;III)Lks;")
    public static class305 method4936(Socket arg0, int arg1, int arg2) throws IOException {
        return new class306(arg0, arg1, arg2);
    }

    @ObfuscatedName("ks.g(II)Z")
    public abstract boolean method3257(int arg0) throws IOException;

    @ObfuscatedName("ks.x(I)I")
    public abstract int method3262() throws IOException;

    @ObfuscatedName("ks.t(I)I")
    public abstract int method3263() throws IOException;

    @ObfuscatedName("ks.c(B)V")
    public abstract void method3242();

    @ObfuscatedName("ks.l([BIII)I")
    public abstract int method3247(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("ks.j([BIIB)V")
    public abstract void method3250(byte[] arg0, int arg1, int arg2) throws IOException;
}
