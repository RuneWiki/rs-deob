package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("gk")
public class class183 extends class188 {

    @ObfuscatedName("gk.n")
    public ByteBuffer field2488;

    @ObfuscatedName("gk.n(I)[B")
    public byte[] method2998() {
        byte[] var1 = new byte[this.field2488.capacity()];
        this.field2488.position(0);
        this.field2488.get(var1);
        return var1;
    }

    @ObfuscatedName("gk.v([BB)V")
    public void method2994(byte[] arg0) {
        this.field2488 = ByteBuffer.allocateDirect(arg0.length);
        this.field2488.position(0);
        this.field2488.put(arg0);
    }
}
