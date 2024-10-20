package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("lk")
public abstract class class330 {

    @ObfuscatedName("bq.c(Ljava/net/Socket;III)Llk;")
    public static class330 method713(Socket arg0, int arg1, int arg2) throws IOException {
        return new class331(arg0, arg1, arg2);
    }

    @ObfuscatedName("lk.v(I)I")
    public abstract int method2366() throws IOException;

    @ObfuscatedName("lk.e(I)I")
    public abstract int method2363() throws IOException;

    @ObfuscatedName("lk.m([BIII)V")
    public abstract void method2370(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("lk.j([BIII)I")
    public abstract int method2368(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("lk.f(I)V")
    public abstract void method2364();

    @ObfuscatedName("lk.y(II)Z")
    public abstract boolean method2384(int arg0) throws IOException;
}
