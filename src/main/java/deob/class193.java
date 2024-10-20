package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("gy")
public class class193 extends class199 {

    @ObfuscatedName("gy.c")
    public ByteBuffer field2527;

    @ObfuscatedName("gy.c(I)[B")
    public byte[] method3198() {
        byte[] var1 = new byte[this.field2527.capacity()];
        this.field2527.position(0);
        this.field2527.get(var1);
        return var1;
    }

    @ObfuscatedName("gy.i([BB)V")
    public void method3200(byte[] arg0) {
        this.field2527 = ByteBuffer.allocateDirect(arg0.length);
        this.field2527.position(0);
        this.field2527.put(arg0);
    }
}
