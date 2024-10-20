package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("ri")
public abstract class class455 {

    @ObfuscatedName("jj.am(Ljava/net/Socket;III)Lri;")
    public static class455 method4492(Socket arg0, int arg1, int arg2) throws IOException {
        return new class456(arg0, arg1, arg2);
    }

    @ObfuscatedName("ri.ap(II)Z")
    public abstract boolean method7658(int arg0) throws IOException;

    @ObfuscatedName("ri.af(I)I")
    public abstract int method7659() throws IOException;

    @ObfuscatedName("ri.ar([BIII)V")
    public abstract void method7661(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("ri.ag(I)V")
    public abstract void method7662();

    @ObfuscatedName("ri.aq([BIII)I")
    public abstract int method7666(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("ri.aj(I)I")
    public abstract int method7671() throws IOException;
}
