package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("lw")
public class class316 extends class314 {

    @ObfuscatedName("lw.f")
    public ByteBuffer field3732;

    @ObfuscatedName("lw.w(I)[B")
    public byte[] method5862() {
        byte[] var1 = new byte[this.field3732.capacity()];
        this.field3732.position(0);
        this.field3732.get(var1);
        return var1;
    }

    @ObfuscatedName("lw.v([BI)V")
    public void method5863(byte[] arg0) {
        this.field3732 = ByteBuffer.allocateDirect(arg0.length);
        this.field3732.position(0);
        this.field3732.put(arg0);
    }
}
