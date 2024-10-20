package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fx")
public abstract class class160 {

    @ObfuscatedName("ax.a(Ljava/net/Socket;III)Lfx;")
    public static class160 method306(Socket arg0, int arg1, int arg2) throws IOException {
        return new class162(arg0, arg1, arg2);
    }

    @ObfuscatedName("fx.w(II)Z")
    public abstract boolean method2772(int arg0) throws IOException;

    @ObfuscatedName("fx.e(B)I")
    public abstract int method2773() throws IOException;

    @ObfuscatedName("fx.z([BIII)V")
    public abstract void method2775(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("fx.t(B)V")
    public abstract void method2776();

    @ObfuscatedName("fx.u([BIII)I")
    public abstract int method2782(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("fx.k(I)I")
    public abstract int method2786() throws IOException;
}
