package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("fw")
public class class173 extends class178 {

    @ObfuscatedName("fw.i")
    public ByteBuffer field2350;

    @ObfuscatedName("fw.i(S)[B")
    public byte[] method2970() {
        byte[] var1 = new byte[this.field2350.capacity()];
        this.field2350.position(0);
        this.field2350.get(var1);
        return var1;
    }

    @ObfuscatedName("fw.j([BI)V")
    public void method2973(byte[] arg0) {
        this.field2350 = ByteBuffer.allocateDirect(arg0.length);
        this.field2350.position(0);
        this.field2350.put(arg0);
    }
}
