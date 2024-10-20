package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("gx")
public class class192 extends class197 {

    @ObfuscatedName("gx.b")
    public ByteBuffer field2498;

    @ObfuscatedName("gx.b(B)[B")
    public byte[] method3218() {
        byte[] var1 = new byte[this.field2498.capacity()];
        this.field2498.position(0);
        this.field2498.get(var1);
        return var1;
    }

    @ObfuscatedName("gx.q([BI)V")
    public void method3217(byte[] arg0) {
        this.field2498 = ByteBuffer.allocateDirect(arg0.length);
        this.field2498.position(0);
        this.field2498.put(arg0);
    }
}
