package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fo")
public abstract class class160 {

    @ObfuscatedName("av.f(Ljava/net/Socket;III)Lfo;")
    public static class160 method444(Socket arg0, int arg1, int arg2) throws IOException {
        return new class162(arg0, arg1, arg2);
    }

    @ObfuscatedName("fo.w(I)I")
    public abstract int method3108() throws IOException;

    @ObfuscatedName("fo.s(I)I")
    public abstract int method3110() throws IOException;

    @ObfuscatedName("fo.e([BIIS)I")
    public abstract int method3111(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("fo.c([BIII)V")
    public abstract void method3112(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("fo.p(I)V")
    public abstract void method3113();

    @ObfuscatedName("fo.l(II)Z")
    public abstract boolean method3119(int arg0) throws IOException;
}
