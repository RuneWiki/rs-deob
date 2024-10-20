package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("np")
public class class339 extends class337 {

    @ObfuscatedName("np.aw")
    public ByteBuffer field3794;

    @ObfuscatedName("np.ar(I)[B")
    public byte[] method6015() {
        byte[] var1 = new byte[this.field3794.capacity()];
        this.field3794.position(0);
        this.field3794.get(var1);
        return var1;
    }

    @ObfuscatedName("np.am([BI)V")
    public void method6005(byte[] arg0) {
        this.field3794 = ByteBuffer.allocateDirect(arg0.length);
        this.field3794.position(0);
        this.field3794.put(arg0);
    }
}
