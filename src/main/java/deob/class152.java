package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("eb")
public class class152 extends class157 {

    @ObfuscatedName("eb.o")
    public ByteBuffer field2063;

    @ObfuscatedName("eb.o(I)[B")
    public byte[] method2528() {
        byte[] var1 = new byte[this.field2063.capacity()];
        this.field2063.position(0);
        this.field2063.get(var1);
        return var1;
    }

    @ObfuscatedName("eb.m([BI)V")
    public void method2531(byte[] arg0) {
        this.field2063 = ByteBuffer.allocateDirect(arg0.length);
        this.field2063.position(0);
        this.field2063.put(arg0);
    }
}
