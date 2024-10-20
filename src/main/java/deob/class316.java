package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("ls")
public abstract class class316 {

    @ObfuscatedName("client.o(Ljava/net/Socket;IIB)Lls;")
    public static class316 method1682(Socket arg0, int arg1, int arg2) throws IOException {
        return new class317(arg0, arg1, arg2);
    }

    @ObfuscatedName("ls.c(II)Z")
    public abstract boolean method3418(int arg0) throws IOException;

    @ObfuscatedName("ls.d(B)I")
    public abstract int method3415() throws IOException;

    @ObfuscatedName("ls.v(B)I")
    public abstract int method3414() throws IOException;

    @ObfuscatedName("ls.z([BIII)V")
    public abstract void method3419(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("ls.y([BIIB)I")
    public abstract int method3428(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("ls.n(I)V")
    public abstract void method3413();
}
