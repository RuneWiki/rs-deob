package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("fj")
public class class172 extends class177 {

    @ObfuscatedName("fj.i")
    public ByteBuffer field2337;

    @ObfuscatedName("fj.i(B)[B")
    public byte[] method2904() {
        byte[] var1 = new byte[this.field2337.capacity()];
        this.field2337.position(0);
        this.field2337.get(var1);
        return var1;
    }

    @ObfuscatedName("fj.h([BI)V")
    public void method2903(byte[] arg0) {
        this.field2337 = ByteBuffer.allocateDirect(arg0.length);
        this.field2337.position(0);
        this.field2337.put(arg0);
    }
}
