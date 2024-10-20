package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("lr")
public abstract class class316 {

    @ObfuscatedName("hx.an(Ljava/net/Socket;IIB)Llr;")
    public static class316 method3661(Socket arg0, int arg1, int arg2) throws IOException {
        return new class317(arg0, arg1, arg2);
    }

    @ObfuscatedName("lr.w(IB)Z")
    public abstract boolean method3292(int arg0) throws IOException;

    @ObfuscatedName("lr.x(I)I")
    public abstract int method3291() throws IOException;

    @ObfuscatedName("lr.t([BIIB)I")
    public abstract int method3305(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("lr.h(B)V")
    public abstract void method3288();

    @ObfuscatedName("lr.n([BIII)V")
    public abstract void method3307(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("lr.v(B)I")
    public abstract int method3290() throws IOException;
}
