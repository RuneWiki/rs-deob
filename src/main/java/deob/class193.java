package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("ge")
public class class193 extends class199 {

    @ObfuscatedName("ge.d")
    public ByteBuffer field2526;

    @ObfuscatedName("ge.d(B)[B")
    public byte[] method3230() {
        byte[] var1 = new byte[this.field2526.capacity()];
        this.field2526.position(0);
        this.field2526.get(var1);
        return var1;
    }

    @ObfuscatedName("ge.z([BI)V")
    public void method3236(byte[] arg0) {
        this.field2526 = ByteBuffer.allocateDirect(arg0.length);
        this.field2526.position(0);
        this.field2526.put(arg0);
    }
}
