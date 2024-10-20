package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("gb")
public class class207 extends class206 {

    @ObfuscatedName("gb.s")
    public ByteBuffer field2477;

    @ObfuscatedName("gb.i(I)[B")
    public byte[] method3585() {
        byte[] var1 = new byte[this.field2477.capacity()];
        this.field2477.position(0);
        this.field2477.get(var1);
        return var1;
    }

    @ObfuscatedName("gb.k([BI)V")
    public void method3586(byte[] arg0) {
        this.field2477 = ByteBuffer.allocateDirect(arg0.length);
        this.field2477.position(0);
        this.field2477.put(arg0);
    }
}
