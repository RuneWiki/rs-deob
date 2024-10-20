package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("sk")
public abstract class class482 {

    @ObfuscatedName("qb.ac(Ljava/net/Socket;III)Lsk;")
    public static class482 method7807(Socket arg0, int arg1, int arg2) throws IOException {
        return new class483(arg0, arg1, arg2);
    }

    @ObfuscatedName("sk.am(I)I")
    public abstract int method8195() throws IOException;

    @ObfuscatedName("sk.ax([BIIB)I")
    public abstract int method8196(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("sk.af(I)V")
    public abstract void method8198();

    @ObfuscatedName("sk.ae(II)Z")
    public abstract boolean method8206(int arg0) throws IOException;

    @ObfuscatedName("sk.aq([BIII)V")
    public abstract void method8216(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("sk.ag(I)I")
    public abstract int method8220() throws IOException;
}
