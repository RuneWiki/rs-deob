package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dz")
public class class32 extends class28 {

    @ObfuscatedName("dz.p")
    public ByteBuffer field175;

    @ObfuscatedName("dz.h([BB)V")
    public void method307(byte[] arg0) {
        this.field175 = ByteBuffer.allocateDirect(arg0.length);
        this.field175.position(0);
        this.field175.put(arg0);
    }

    @ObfuscatedName("dz.t(I)[B")
    public byte[] method302() {
        byte[] var1 = new byte[this.field175.capacity()];
        this.field175.position(0);
        this.field175.get(var1);
        return var1;
    }
}
