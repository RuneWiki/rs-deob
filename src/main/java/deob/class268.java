package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("jz")
public class class268 extends class266 {

    @ObfuscatedName("jz.i")
    public ByteBuffer field3212;

    @ObfuscatedName("jz.s(B)[B")
    public byte[] method4625() {
        byte[] var1 = new byte[this.field3212.capacity()];
        this.field3212.position(0);
        this.field3212.get(var1);
        return var1;
    }

    @ObfuscatedName("jz.a([BB)V")
    public void method4626(byte[] arg0) {
        this.field3212 = ByteBuffer.allocateDirect(arg0.length);
        this.field3212.position(0);
        this.field3212.put(arg0);
    }
}
