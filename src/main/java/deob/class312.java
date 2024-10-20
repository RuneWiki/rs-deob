package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("kh")
public class class312 extends class310 {

    @ObfuscatedName("kh.h")
    public ByteBuffer field3717;

    @ObfuscatedName("kh.v(B)[B")
    public byte[] method5747() {
        byte[] var1 = new byte[this.field3717.capacity()];
        this.field3717.position(0);
        this.field3717.get(var1);
        return var1;
    }

    @ObfuscatedName("kh.x([BI)V")
    public void method5748(byte[] arg0) {
        this.field3717 = ByteBuffer.allocateDirect(arg0.length);
        this.field3717.position(0);
        this.field3717.put(arg0);
    }
}
