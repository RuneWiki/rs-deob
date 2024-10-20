package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("nl")
public abstract class class377 {

    @ObfuscatedName("ej.c(Ljava/net/Socket;IIB)Lnl;")
    public static class377 method2710(Socket arg0, int arg1, int arg2) throws IOException {
        return new class378(arg0, arg1, arg2);
    }

    @ObfuscatedName("nl.f(I)I")
    public abstract int method6190() throws IOException;

    @ObfuscatedName("nl.v(IB)Z")
    public abstract boolean method6191(int arg0) throws IOException;

    @ObfuscatedName("nl.q(I)I")
    public abstract int method6192() throws IOException;

    @ObfuscatedName("nl.j([BIII)I")
    public abstract int method6194(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("nl.g(I)V")
    public abstract void method6196();

    @ObfuscatedName("nl.e([BIII)V")
    public abstract void method6210(byte[] arg0, int arg1, int arg2) throws IOException;
}
