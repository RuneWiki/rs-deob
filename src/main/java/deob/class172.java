package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("fz")
public class class172 extends class177 {

    @ObfuscatedName("fz.i")
    public ByteBuffer field2358;

    @ObfuscatedName("fz.i(B)[B")
    public byte[] method2852() {
        byte[] var1 = new byte[this.field2358.capacity()];
        this.field2358.position(0);
        this.field2358.get(var1);
        return var1;
    }

    @ObfuscatedName("fz.w([BI)V")
    public void method2861(byte[] arg0) {
        this.field2358 = ByteBuffer.allocateDirect(arg0.length);
        this.field2358.position(0);
        this.field2358.put(arg0);
    }
}
