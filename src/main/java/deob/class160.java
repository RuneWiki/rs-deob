package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fl")
public abstract class class160 {

    @ObfuscatedName("dx.n(Ljava/net/Socket;IIB)Lfl;")
    public static class160 method2222(Socket arg0, int arg1, int arg2) throws IOException {
        return new class162(arg0, arg1, arg2);
    }

    @ObfuscatedName("fl.r(I)I")
    public abstract int method2809() throws IOException;

    @ObfuscatedName("fl.v(II)Z")
    public abstract boolean method2810(int arg0) throws IOException;

    @ObfuscatedName("fl.d([BIII)V")
    public abstract void method2811(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("fl.h([BIII)I")
    public abstract int method2813(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("fl.y(I)I")
    public abstract int method2816() throws IOException;

    @ObfuscatedName("fl.s(B)V")
    public abstract void method2826();
}
