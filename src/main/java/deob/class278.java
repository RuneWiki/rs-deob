package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("ja")
public class class278 extends class276 {

    @ObfuscatedName("ja.c")
    public ByteBuffer field3207;

    @ObfuscatedName("ja.s(I)[B")
    public byte[] method4774() {
        byte[] var1 = new byte[this.field3207.capacity()];
        this.field3207.position(0);
        this.field3207.get(var1);
        return var1;
    }

    @ObfuscatedName("ja.e([BB)V")
    public void method4776(byte[] arg0) {
        this.field3207 = ByteBuffer.allocateDirect(arg0.length);
        this.field3207.position(0);
        this.field3207.put(arg0);
    }
}
