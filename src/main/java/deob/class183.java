package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("gk")
public class class183 extends class189 {

    @ObfuscatedName("gk.f")
    public ByteBuffer field2357;

    @ObfuscatedName("gk.f(I)[B")
    public byte[] method3299() {
        byte[] var1 = new byte[this.field2357.capacity()];
        this.field2357.position(0);
        this.field2357.get(var1);
        return var1;
    }

    @ObfuscatedName("gk.h([BI)V")
    public void method3298(byte[] arg0) {
        this.field2357 = ByteBuffer.allocateDirect(arg0.length);
        this.field2357.position(0);
        this.field2357.put(arg0);
    }
}
