package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("jm")
public class class286 extends class284 {

    @ObfuscatedName("jm.s")
    public ByteBuffer field3302;

    @ObfuscatedName("jm.h(I)[B")
    public byte[] method4884() {
        byte[] var1 = new byte[this.field3302.capacity()];
        this.field3302.position(0);
        this.field3302.get(var1);
        return var1;
    }

    @ObfuscatedName("jm.w([BI)V")
    public void method4885(byte[] arg0) {
        this.field3302 = ByteBuffer.allocateDirect(arg0.length);
        this.field3302.position(0);
        this.field3302.put(arg0);
    }
}
