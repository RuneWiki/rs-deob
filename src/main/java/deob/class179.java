package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("fx")
public class class179 extends class184 {

    @ObfuscatedName("fx.d")
    public ByteBuffer field2453;

    @ObfuscatedName("fx.d(I)[B")
    public byte[] method3012() {
        byte[] var1 = new byte[this.field2453.capacity()];
        this.field2453.position(0);
        this.field2453.get(var1);
        return var1;
    }

    @ObfuscatedName("fx.x([BB)V")
    public void method3011(byte[] arg0) {
        this.field2453 = ByteBuffer.allocateDirect(arg0.length);
        this.field2453.position(0);
        this.field2453.put(arg0);
    }
}
