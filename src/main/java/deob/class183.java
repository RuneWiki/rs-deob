package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("gv")
public class class183 extends class189 {

    @ObfuscatedName("gv.f")
    public ByteBuffer field2373;

    @ObfuscatedName("gv.f(B)[B")
    public byte[] method3321() {
        byte[] var1 = new byte[this.field2373.capacity()];
        this.field2373.position(0);
        this.field2373.get(var1);
        return var1;
    }

    @ObfuscatedName("gv.l([BI)V")
    public void method3320(byte[] arg0) {
        this.field2373 = ByteBuffer.allocateDirect(arg0.length);
        this.field2373.position(0);
        this.field2373.put(arg0);
    }
}
