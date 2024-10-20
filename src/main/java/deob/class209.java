package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("he")
public class class209 extends class208 {

    @ObfuscatedName("he.f")
    public ByteBuffer field2492;

    @ObfuscatedName("he.i(I)[B")
    public byte[] method3582() {
        byte[] var1 = new byte[this.field2492.capacity()];
        this.field2492.position(0);
        this.field2492.get(var1);
        return var1;
    }

    @ObfuscatedName("he.y([BB)V")
    public void method3577(byte[] arg0) {
        this.field2492 = ByteBuffer.allocateDirect(arg0.length);
        this.field2492.position(0);
        this.field2492.put(arg0);
    }
}
