package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("hb")
public class class231 extends class229 {

    @ObfuscatedName("hb.f")
    public ByteBuffer field2801;

    @ObfuscatedName("hb.u(I)[B")
    public byte[] method3814() {
        byte[] var1 = new byte[this.field2801.capacity()];
        this.field2801.position(0);
        this.field2801.get(var1);
        return var1;
    }

    @ObfuscatedName("hb.p([BI)V")
    public void method3813(byte[] arg0) {
        this.field2801 = ByteBuffer.allocateDirect(arg0.length);
        this.field2801.position(0);
        this.field2801.put(arg0);
    }
}
