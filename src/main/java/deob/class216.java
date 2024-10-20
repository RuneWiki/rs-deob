package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("hv")
public class class216 extends class215 {

    @ObfuscatedName("hv.f")
    public ByteBuffer field2526;

    @ObfuscatedName("hv.l(B)[B")
    public byte[] method3700() {
        byte[] var1 = new byte[this.field2526.capacity()];
        this.field2526.position(0);
        this.field2526.get(var1);
        return var1;
    }

    @ObfuscatedName("hv.m([BB)V")
    public void method3701(byte[] arg0) {
        this.field2526 = ByteBuffer.allocateDirect(arg0.length);
        this.field2526.position(0);
        this.field2526.put(arg0);
    }
}
