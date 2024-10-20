package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("kv")
public class class287 extends class285 {

    @ObfuscatedName("kv.c")
    public ByteBuffer field3335;

    @ObfuscatedName("kv.f(B)[B")
    public byte[] method5088() {
        byte[] var1 = new byte[this.field3335.capacity()];
        this.field3335.position(0);
        this.field3335.get(var1);
        return var1;
    }

    @ObfuscatedName("kv.n([BB)V")
    public void method5094(byte[] arg0) {
        this.field3335 = ByteBuffer.allocateDirect(arg0.length);
        this.field3335.position(0);
        this.field3335.put(arg0);
    }
}
