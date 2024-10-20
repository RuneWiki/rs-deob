package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("ku")
public abstract class class305 {

    @ObfuscatedName("ae.al(Ljava/net/Socket;III)Lku;")
    public static class305 method691(Socket arg0, int arg1, int arg2) throws IOException {
        return new class306(arg0, arg1, arg2);
    }

    @ObfuscatedName("ku.q(II)Z")
    public abstract boolean method3296(int arg0) throws IOException;

    @ObfuscatedName("ku.n(B)I")
    public abstract int method3291() throws IOException;

    @ObfuscatedName("ku.t(B)I")
    public abstract int method3315() throws IOException;

    @ObfuscatedName("ku.v([BIII)I")
    public abstract int method3318(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("ku.c([BIII)V")
    public abstract void method3299(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("ku.a(I)V")
    public abstract void method3292();
}
