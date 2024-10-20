package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("fa")
public abstract class class159 {

    @ObfuscatedName("b.w(Ljava/net/Socket;II)Lfa;")
    public static class159 method172(Socket arg0, int arg1) throws IOException {
        return new class161(arg0, arg1);
    }

    @ObfuscatedName("fa.i([BIII)V")
    public abstract void method2699(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("fa.x(B)I")
    public abstract int method2701() throws IOException;

    @ObfuscatedName("fa.k(I)I")
    public abstract int method2702() throws IOException;

    @ObfuscatedName("fa.f([BIII)I")
    public abstract int method2703(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("fa.j(B)V")
    public abstract void method2705();

    @ObfuscatedName("fa.o(IB)Z")
    public abstract boolean method2713(int arg0) throws IOException;
}
