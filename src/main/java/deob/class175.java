package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("fk")
public class class175 extends class180 {

    @ObfuscatedName("fk.s")
    public ByteBuffer field2362;

    @ObfuscatedName("fk.s(B)[B")
    public byte[] method2943() {
        byte[] var1 = new byte[this.field2362.capacity()];
        this.field2362.position(0);
        this.field2362.get(var1);
        return var1;
    }

    @ObfuscatedName("fk.c([BI)V")
    public void method2942(byte[] arg0) {
        this.field2362 = ByteBuffer.allocateDirect(arg0.length);
        this.field2362.position(0);
        this.field2362.put(arg0);
    }
}
