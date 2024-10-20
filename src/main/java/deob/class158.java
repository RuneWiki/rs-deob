package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("ft")
public abstract class class158 {

    @ObfuscatedName("g.w(Ljava/net/Socket;III)Lft;")
    public static class158 method155(Socket arg0, int arg1, int arg2) throws IOException {
        return new class160(arg0, arg1, arg2);
    }

    @ObfuscatedName("ft.q(I)I")
    public abstract int method3037() throws IOException;

    @ObfuscatedName("ft.m(II)Z")
    public abstract boolean method3038(int arg0) throws IOException;

    @ObfuscatedName("ft.x(I)I")
    public abstract int method3040() throws IOException;

    @ObfuscatedName("ft.j([BIII)I")
    public abstract int method3041(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("ft.a([BIII)V")
    public abstract void method3042(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("ft.l(I)V")
    public abstract void method3043();
}
