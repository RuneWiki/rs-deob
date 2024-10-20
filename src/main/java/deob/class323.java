package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("mp")
public class class323 extends class321 {

    @ObfuscatedName("mp.af")
    public ByteBuffer field3737;

    @ObfuscatedName("mp.ac(I)[B")
    public byte[] method5953() {
        byte[] var1 = new byte[this.field3737.capacity()];
        this.field3737.position(0);
        this.field3737.get(var1);
        return var1;
    }

    @ObfuscatedName("mp.au([BI)V")
    public void method5950(byte[] arg0) {
        this.field3737 = ByteBuffer.allocateDirect(arg0.length);
        this.field3737.position(0);
        this.field3737.put(arg0);
    }
}
