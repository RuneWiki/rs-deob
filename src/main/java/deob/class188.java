package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("gz")
public class class188 extends class194 {

    @ObfuscatedName("gz.n")
    public ByteBuffer field2381;

    @ObfuscatedName("gz.n(I)[B")
    public byte[] method3489() {
        byte[] var1 = new byte[this.field2381.capacity()];
        this.field2381.position(0);
        this.field2381.get(var1);
        return var1;
    }

    @ObfuscatedName("gz.h([BB)V")
    public void method3486(byte[] arg0) {
        this.field2381 = ByteBuffer.allocateDirect(arg0.length);
        this.field2381.position(0);
        this.field2381.put(arg0);
    }
}
