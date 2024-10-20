package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("sm")
public abstract class class478 {

    @ObfuscatedName("fc.ak(Ljava/net/Socket;III)Lsm;")
    public static class478 method2985(Socket arg0, int arg1, int arg2) throws IOException {
        return new class479(arg0, arg1, arg2);
    }

    @ObfuscatedName("sm.aj(S)I")
    public abstract int method8020() throws IOException;

    @ObfuscatedName("sm.az(I)I")
    public abstract int method8021() throws IOException;

    @ObfuscatedName("sm.af([BIIB)I")
    public abstract int method8022(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("sm.aa([BIII)V")
    public abstract void method8023(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("sm.at(B)V")
    public abstract void method8024();

    @ObfuscatedName("sm.al(II)Z")
    public abstract boolean method8027(int arg0) throws IOException;
}
