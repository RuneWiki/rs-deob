package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("gk")
public class class183 extends class188 {

    @ObfuscatedName("gk.a")
    public ByteBuffer field2468;

    @ObfuscatedName("gk.a(I)[B")
    public byte[] method2937() {
        byte[] var1 = new byte[this.field2468.capacity()];
        this.field2468.position(0);
        this.field2468.get(var1);
        return var1;
    }

    @ObfuscatedName("gk.w([BI)V")
    public void method2939(byte[] arg0) {
        this.field2468 = ByteBuffer.allocateDirect(arg0.length);
        this.field2468.position(0);
        this.field2468.put(arg0);
    }
}
