package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("ez")
public class class152 extends class157 {

    @ObfuscatedName("ez.b")
    public ByteBuffer field2041;

    @ObfuscatedName("ez.b(I)[B")
    public byte[] method2656() {
        byte[] var1 = new byte[this.field2041.capacity()];
        this.field2041.position(0);
        this.field2041.get(var1);
        return var1;
    }

    @ObfuscatedName("ez.l([BI)V")
    public void method2655(byte[] arg0) {
        this.field2041 = ByteBuffer.allocateDirect(arg0.length);
        this.field2041.position(0);
        this.field2041.put(arg0);
    }
}
