package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("qz")
public abstract class class427 {

    @ObfuscatedName("io.at(Ljava/net/Socket;III)Lqz;")
    public static class427 method3911(Socket arg0, int arg1, int arg2) throws IOException {
        return new class428(arg0, arg1, arg2);
    }

    @ObfuscatedName("qz.av(B)I")
    public abstract int method7259() throws IOException;

    @ObfuscatedName("qz.as(B)I")
    public abstract int method7260() throws IOException;

    @ObfuscatedName("qz.ax([BIIB)I")
    public abstract int method7261(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("qz.ap([BIII)V")
    public abstract void method7262(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("qz.ab(S)V")
    public abstract void method7263();

    @ObfuscatedName("qz.an(II)Z")
    public abstract boolean method7274(int arg0) throws IOException;
}
