package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("ky")
public abstract class class305 {

    @ObfuscatedName("jt.an(Ljava/net/Socket;III)Lky;")
    public static class305 method4810(Socket arg0, int arg1, int arg2) throws IOException {
        return new class306(arg0, arg1, arg2);
    }

    @ObfuscatedName("ky.w(II)Z")
    public abstract boolean method3194(int arg0) throws IOException;

    @ObfuscatedName("ky.y(I)I")
    public abstract int method3193() throws IOException;

    @ObfuscatedName("ky.i(I)I")
    public abstract int method3215() throws IOException;

    @ObfuscatedName("ky.p([BIII)I")
    public abstract int method3195(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("ky.e([BIII)V")
    public abstract void method3197(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("ky.f(I)V")
    public abstract void method3191();
}
