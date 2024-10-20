package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("gu")
public class class188 extends class194 {

    @ObfuscatedName("gu.a")
    public ByteBuffer field2379;

    @ObfuscatedName("gu.a(I)[B")
    public byte[] method3432() {
        byte[] var1 = new byte[this.field2379.capacity()];
        this.field2379.position(0);
        this.field2379.get(var1);
        return var1;
    }

    @ObfuscatedName("gu.s([BB)V")
    public void method3431(byte[] arg0) {
        this.field2379 = ByteBuffer.allocateDirect(arg0.length);
        this.field2379.position(0);
        this.field2379.put(arg0);
    }
}
