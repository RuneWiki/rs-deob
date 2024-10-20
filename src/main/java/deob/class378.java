package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("nc")
public abstract class class378 {

    @ObfuscatedName("dw.s(Ljava/net/Socket;IIB)Lnc;")
    public static class378 method2436(Socket arg0, int arg1, int arg2) throws IOException {
        return new class379(arg0, arg1, arg2);
    }

    @ObfuscatedName("nc.h(II)Z")
    public abstract boolean method6108(int arg0) throws IOException;

    @ObfuscatedName("nc.w(B)I")
    public abstract int method6109() throws IOException;

    @ObfuscatedName("nc.v(I)I")
    public abstract int method6110() throws IOException;

    @ObfuscatedName("nc.q([BIIS)V")
    public abstract void method6112(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("nc.i(I)V")
    public abstract void method6121();

    @ObfuscatedName("nc.c([BIIB)I")
    public abstract int method6122(byte[] arg0, int arg1, int arg2) throws IOException;
}
