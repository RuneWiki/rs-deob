package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("mv")
public abstract class class343 {

    @ObfuscatedName("ct.w(Ljava/net/Socket;III)Lmv;")
    public static class343 method2254(Socket arg0, int arg1, int arg2) throws IOException {
        return new class344(arg0, arg1, arg2);
    }

    @ObfuscatedName("mv.z([BIIB)V")
    public abstract void method2567(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("mv.k(II)Z")
    public abstract boolean method2544(int arg0) throws IOException;

    @ObfuscatedName("mv.m(I)I")
    public abstract int method2543() throws IOException;

    @ObfuscatedName("mv.c(B)I")
    public abstract int method2540() throws IOException;

    @ObfuscatedName("mv.o([BIII)I")
    public abstract int method2545(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("mv.n(S)V")
    public abstract void method2541();
}
