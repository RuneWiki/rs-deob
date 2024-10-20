package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("jz")
public class class273 extends class271 {

    @ObfuscatedName("jz.c")
    public ByteBuffer field3172;

    @ObfuscatedName("jz.p(I)[B")
    public byte[] method4800() {
        byte[] var1 = new byte[this.field3172.capacity()];
        this.field3172.position(0);
        this.field3172.get(var1);
        return var1;
    }

    @ObfuscatedName("jz.m([BI)V")
    public void method4799(byte[] arg0) {
        this.field3172 = ByteBuffer.allocateDirect(arg0.length);
        this.field3172.position(0);
        this.field3172.put(arg0);
    }
}
