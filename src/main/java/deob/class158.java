package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fd")
public abstract class class158 {

    @ObfuscatedName("aj.z(Ljava/net/Socket;IIB)Lfd;")
    public static class158 method832(Socket arg0, int arg1, int arg2) throws IOException {
        return new class160(arg0, arg1, arg2);
    }

    @ObfuscatedName("fd.s(I)I")
    public abstract int method3037() throws IOException;

    @ObfuscatedName("fd.u([BIII)I")
    public abstract int method3039(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("fd.q([BIIB)V")
    public abstract void method3040(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("fd.i(I)V")
    public abstract void method3041();

    @ObfuscatedName("fd.l(I)I")
    public abstract int method3042() throws IOException;

    @ObfuscatedName("fd.w(IB)Z")
    public abstract boolean method3046(int arg0) throws IOException;
}
