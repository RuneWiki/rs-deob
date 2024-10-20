package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("na")
public class class348 extends class346 {

    @ObfuscatedName("na.at")
    public ByteBuffer field3822;

    @ObfuscatedName("na.ar(B)[B")
    public byte[] method6161() {
        byte[] var1 = new byte[this.field3822.capacity()];
        this.field3822.position(0);
        this.field3822.get(var1);
        return var1;
    }

    @ObfuscatedName("na.ao([BB)V")
    public void method6162(byte[] arg0) {
        this.field3822 = ByteBuffer.allocateDirect(arg0.length);
        this.field3822.position(0);
        this.field3822.put(arg0);
    }
}
