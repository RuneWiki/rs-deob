package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("lt")
public abstract class class315 {

    @ObfuscatedName("kb.an(Ljava/net/Socket;IIB)Llt;")
    public static class315 method5357(Socket arg0, int arg1, int arg2) throws IOException {
        return new class316(arg0, arg1, arg2);
    }

    @ObfuscatedName("lt.d(IB)Z")
    public abstract boolean method3289(int arg0) throws IOException;

    @ObfuscatedName("lt.k(I)I")
    public abstract int method3290() throws IOException;

    @ObfuscatedName("lt.m(I)I")
    public abstract int method3284() throws IOException;

    @ObfuscatedName("lt.q([BIII)V")
    public abstract void method3293(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("lt.w([BIIB)I")
    public abstract int method3296(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("lt.x(B)V")
    public abstract void method3285();
}
