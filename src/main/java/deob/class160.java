package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fh")
public abstract class class160 {

    @ObfuscatedName("bl.g(Ljava/net/Socket;III)Lfh;")
    public static class160 method1555(Socket arg0, int arg1, int arg2) throws IOException {
        return new class162(arg0, arg1, arg2);
    }

    @ObfuscatedName("fh.e(B)I")
    public abstract int method3227() throws IOException;

    @ObfuscatedName("fh.c([BIII)I")
    public abstract int method3228(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("fh.p(I)V")
    public abstract void method3230();

    @ObfuscatedName("fh.q(I)I")
    public abstract int method3233() throws IOException;

    @ObfuscatedName("fh.i([BIII)V")
    public abstract void method3234(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("fh.r(II)Z")
    public abstract boolean method3237(int arg0) throws IOException;
}
