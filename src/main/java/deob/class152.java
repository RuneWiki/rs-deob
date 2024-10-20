package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("eb")
public class class152 extends class157 {

    @ObfuscatedName("eb.f")
    public ByteBuffer field2069;

    @ObfuscatedName("eb.f(B)[B")
    public byte[] method2641() {
        byte[] var1 = new byte[this.field2069.capacity()];
        this.field2069.position(0);
        this.field2069.get(var1);
        return var1;
    }

    @ObfuscatedName("eb.i([BI)V")
    public void method2642(byte[] arg0) {
        this.field2069 = ByteBuffer.allocateDirect(arg0.length);
        this.field2069.position(0);
        this.field2069.put(arg0);
    }
}
