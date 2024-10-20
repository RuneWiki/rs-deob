package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("do")
public class class47 extends class50 {

    @ObfuscatedName("do.c")
    public ByteBuffer field529;

    @ObfuscatedName("do.i(I)[B")
    public byte[] method858() {
        byte[] var1 = new byte[this.field529.capacity()];
        this.field529.position(0);
        this.field529.get(var1);
        return var1;
    }

    @ObfuscatedName("do.m([BI)V")
    public void method859(byte[] arg0) {
        this.field529 = ByteBuffer.allocateDirect(arg0.length);
        this.field529.position(0);
        this.field529.put(arg0);
    }
}
