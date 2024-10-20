package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("ro")
public abstract class class451 {

    @ObfuscatedName("ii.at(Ljava/net/Socket;III)Lro;")
    public static class451 method4090(Socket arg0, int arg1, int arg2) throws IOException {
        return new class452(arg0, arg1, arg2);
    }

    @ObfuscatedName("ro.ah(II)Z")
    public abstract boolean method7528(int arg0) throws IOException;

    @ObfuscatedName("ro.ao(I)I")
    public abstract int method7530() throws IOException;

    @ObfuscatedName("ro.ab([BIIB)I")
    public abstract int method7531(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("ro.au([BIII)V")
    public abstract void method7532(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("ro.aa(I)V")
    public abstract void method7538();

    @ObfuscatedName("ro.ar(I)I")
    public abstract int method7544() throws IOException;
}
