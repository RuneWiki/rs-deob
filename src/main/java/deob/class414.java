package deob;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("ph")
public abstract class class414 {

    @ObfuscatedName("hu.af(Ljava/net/Socket;III)Lph;")
    public static class414 method3421(Socket arg0, int arg1, int arg2) throws IOException {
        return new class415(arg0, arg1, arg2);
    }

    @ObfuscatedName("ph.aw(I)I")
    public abstract int method7283() throws IOException;

    @ObfuscatedName("ph.ab([BIII)V")
    public abstract void method7286(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("ph.aq(I)V")
    public abstract void method7287();

    @ObfuscatedName("ph.au([BIII)I")
    public abstract int method7289(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("ph.ac(I)I")
    public abstract int method7291() throws IOException;

    @ObfuscatedName("ph.an(II)Z")
    public abstract boolean method7305(int arg0) throws IOException;
}
