package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fx")
public abstract class class160 {

    @ObfuscatedName("bd.f(Ljava/net/Socket;III)Lfx;")
    public static class160 method1003(Socket arg0, int arg1, int arg2) throws IOException {
        return new class162(arg0, arg1, arg2);
    }

    @ObfuscatedName("fx.h(II)Z")
    public abstract boolean method3085(int arg0) throws IOException;

    @ObfuscatedName("fx.e(S)I")
    public abstract int method3087() throws IOException;

    @ObfuscatedName("fx.b(B)I")
    public abstract int method3088() throws IOException;

    @ObfuscatedName("fx.l([BIII)I")
    public abstract int method3089(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("fx.w([BIII)V")
    public abstract void method3094(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("fx.d(I)V")
    public abstract void method3098();
}
