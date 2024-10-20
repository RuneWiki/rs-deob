package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fh")
public abstract class class160 {

    @ObfuscatedName("bn.v(Ljava/net/Socket;III)Lfh;")
    public static class160 method1527(Socket arg0, int arg1, int arg2) throws IOException {
        return new class162(arg0, arg1, arg2);
    }

    @ObfuscatedName("fh.t(I)V")
    public abstract void method3036();

    @ObfuscatedName("fh.s(II)Z")
    public abstract boolean method3037(int arg0) throws IOException;

    @ObfuscatedName("fh.o(I)I")
    public abstract int method3038() throws IOException;

    @ObfuscatedName("fh.i([BIII)V")
    public abstract void method3041(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("fh.u([BIII)I")
    public abstract int method3042(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("fh.k(I)I")
    public abstract int method3051() throws IOException;
}
