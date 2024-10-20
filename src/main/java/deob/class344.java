package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("mp")
public abstract class class344 {

    @ObfuscatedName("eu.al(Ljava/net/Socket;III)Lmp;")
    public static class344 method2513(Socket arg0, int arg1, int arg2) throws IOException {
        return new class345(arg0, arg1, arg2);
    }

    @ObfuscatedName("mp.s(I)I")
    public abstract int method2615() throws IOException;

    @ObfuscatedName("mp.w(I)I")
    public abstract int method2612() throws IOException;

    @ObfuscatedName("mp.e([BIII)V")
    public abstract void method2642(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("mp.o([BIII)I")
    public abstract int method2617(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("mp.i(B)V")
    public abstract void method2613();

    @ObfuscatedName("mp.a(II)Z")
    public abstract boolean method2616(int arg0) throws IOException;
}
