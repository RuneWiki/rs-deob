package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("gs")
public class class183 extends class189 {

    @ObfuscatedName("gs.v")
    public ByteBuffer field2343;

    @ObfuscatedName("gs.v(I)[B")
    public byte[] method3244() {
        byte[] var1 = new byte[this.field2343.capacity()];
        this.field2343.position(0);
        this.field2343.get(var1);
        return var1;
    }

    @ObfuscatedName("gs.s([BB)V")
    public void method3245(byte[] arg0) {
        this.field2343 = ByteBuffer.allocateDirect(arg0.length);
        this.field2343.position(0);
        this.field2343.put(arg0);
    }
}
