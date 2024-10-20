package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("kr")
public abstract class class306 {

    @ObfuscatedName("ll.af(Ljava/net/Socket;IIB)Lkr;")
    public static class306 method5554(Socket arg0, int arg1, int arg2) throws IOException {
        return new class307(arg0, arg1, arg2);
    }

    @ObfuscatedName("kr.i([BIII)I")
    public abstract int method3284(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("kr.o(I)I")
    public abstract int method3295() throws IOException;

    @ObfuscatedName("kr.t(B)I")
    public abstract int method3270() throws IOException;

    @ObfuscatedName("kr.c(I)V")
    public abstract void method3269();

    @ObfuscatedName("kr.e(II)Z")
    public abstract boolean method3288(int arg0) throws IOException;

    @ObfuscatedName("kr.d([BIII)V")
    public abstract void method3274(byte[] arg0, int arg1, int arg2) throws IOException;
}
