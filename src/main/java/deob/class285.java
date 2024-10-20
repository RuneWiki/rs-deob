package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("jr")
public class class285 extends class283 {

    @ObfuscatedName("jr.c")
    public ByteBuffer field3308;

    @ObfuscatedName("jr.f(B)[B")
    public byte[] method4970() {
        byte[] var1 = new byte[this.field3308.capacity()];
        this.field3308.position(0);
        this.field3308.get(var1);
        return var1;
    }

    @ObfuscatedName("jr.j([BI)V")
    public void method4966(byte[] arg0) {
        this.field3308 = ByteBuffer.allocateDirect(arg0.length);
        this.field3308.position(0);
        this.field3308.put(arg0);
    }
}
