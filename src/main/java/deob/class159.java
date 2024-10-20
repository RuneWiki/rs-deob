package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("fo")
public class class159 extends class164 {

    @ObfuscatedName("fo.k")
    public ByteBuffer field2218;

    @ObfuscatedName("fo.k(I)[B")
    public byte[] method2709() {
        byte[] var1 = new byte[this.field2218.capacity()];
        this.field2218.position(0);
        this.field2218.get(var1);
        return var1;
    }

    @ObfuscatedName("fo.y([BI)V")
    public void method2711(byte[] arg0) {
        this.field2218 = ByteBuffer.allocateDirect(arg0.length);
        this.field2218.position(0);
        this.field2218.put(arg0);
    }
}
