package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("qh")
public abstract class class440 {

    @ObfuscatedName("ll.aw(Ljava/net/Socket;IIB)Lqh;")
    public static class440 method5431(Socket arg0, int arg1, int arg2) throws IOException {
        return new class441(arg0, arg1, arg2);
    }

    @ObfuscatedName("qh.ar(I)I")
    public abstract int method7344() throws IOException;

    @ObfuscatedName("qh.aj([BIII)V")
    public abstract void method7347(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("qh.ag(I)V")
    public abstract void method7348();

    @ObfuscatedName("qh.ay(II)Z")
    public abstract boolean method7356(int arg0) throws IOException;

    @ObfuscatedName("qh.am(B)I")
    public abstract int method7361() throws IOException;

    @ObfuscatedName("qh.as([BIII)I")
    public abstract int method7362(byte[] arg0, int arg1, int arg2) throws IOException;
}
