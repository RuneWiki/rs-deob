package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("li")
public abstract class class328 {

    @ObfuscatedName("gg.ay(Ljava/net/Socket;IIB)Lli;")
    public static class328 method3420(Socket arg0, int arg1, int arg2) throws IOException {
        return new class329(arg0, arg1, arg2);
    }

    @ObfuscatedName("li.p(II)Z")
    public abstract boolean method2262(int arg0) throws IOException;

    @ObfuscatedName("li.u(B)I")
    public abstract int method2261() throws IOException;

    @ObfuscatedName("li.o(B)I")
    public abstract int method2260() throws IOException;

    @ObfuscatedName("li.f(I)V")
    public abstract void method2268();

    @ObfuscatedName("li.k([BIII)V")
    public abstract void method2265(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("li.b([BIIB)I")
    public abstract int method2291(byte[] arg0, int arg1, int arg2) throws IOException;
}
