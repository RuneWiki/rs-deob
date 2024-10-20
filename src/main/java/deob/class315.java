package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("ln")
public abstract class class315 {

    @ObfuscatedName("ej.e(Ljava/net/Socket;IIB)Lln;")
    public static class315 method3133(Socket arg0, int arg1, int arg2) throws IOException {
        return new class316(arg0, arg1, arg2);
    }

    @ObfuscatedName("ln.t(IB)Z")
    public abstract boolean method3311(int arg0) throws IOException;

    @ObfuscatedName("ln.k(B)I")
    public abstract int method3309() throws IOException;

    @ObfuscatedName("ln.i([BIII)I")
    public abstract int method3312(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("ln.x([BIIB)V")
    public abstract void method3315(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("ln.z(I)V")
    public abstract void method3308();

    @ObfuscatedName("ln.s(B)I")
    public abstract int method3310() throws IOException;
}
