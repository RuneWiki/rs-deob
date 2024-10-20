package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("re")
public abstract class class454 {

    @ObfuscatedName("kh.ac(Ljava/net/Socket;IIS)Lre;")
    public static class454 method5116(Socket arg0, int arg1, int arg2) throws IOException {
        return new class455(arg0, arg1, arg2);
    }

    @ObfuscatedName("re.ah([BIII)V")
    public abstract void method7435(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("re.al(II)Z")
    public abstract boolean method7436(int arg0) throws IOException;

    @ObfuscatedName("re.ax(B)I")
    public abstract int method7438() throws IOException;

    @ObfuscatedName("re.ar(S)V")
    public abstract void method7441();

    @ObfuscatedName("re.ao([BIII)I")
    public abstract int method7447(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("re.ak(I)I")
    public abstract int method7448() throws IOException;
}
