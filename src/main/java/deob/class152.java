package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("ez")
public class class152 extends class157 {

    @ObfuscatedName("ez.i")
    public ByteBuffer field2050;

    @ObfuscatedName("ez.i(I)[B")
    public byte[] method2553() {
        byte[] var1 = new byte[this.field2050.capacity()];
        this.field2050.position(0);
        this.field2050.get(var1);
        return var1;
    }

    @ObfuscatedName("ez.e([BB)V")
    public void method2554(byte[] arg0) {
        this.field2050 = ByteBuffer.allocateDirect(arg0.length);
        this.field2050.position(0);
        this.field2050.put(arg0);
    }
}
