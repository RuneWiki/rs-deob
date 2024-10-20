package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("nh")
public class class354 extends class352 {

    @ObfuscatedName("nh.aq")
    public ByteBuffer field3890;

    @ObfuscatedName("nh.aw(I)[B")
    public byte[] method6289() {
        byte[] var1 = new byte[this.field3890.capacity()];
        this.field3890.position(0);
        this.field3890.get(var1);
        return var1;
    }

    @ObfuscatedName("nh.al([BI)V")
    public void method6290(byte[] arg0) {
        this.field3890 = ByteBuffer.allocateDirect(arg0.length);
        this.field3890.position(0);
        this.field3890.put(arg0);
    }
}
