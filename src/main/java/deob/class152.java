package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("eu")
public class class152 extends class157 {

    @ObfuscatedName("eu.s")
    public ByteBuffer field2056;

    @ObfuscatedName("eu.s(B)[B")
    public byte[] method2521() {
        byte[] var1 = new byte[this.field2056.capacity()];
        this.field2056.position(0);
        this.field2056.get(var1);
        return var1;
    }

    @ObfuscatedName("eu.c([BB)V")
    public void method2522(byte[] arg0) {
        this.field2056 = ByteBuffer.allocateDirect(arg0.length);
        this.field2056.position(0);
        this.field2056.put(arg0);
    }
}
