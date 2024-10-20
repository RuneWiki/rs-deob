package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("fn")
public class class181 extends class187 {

    @ObfuscatedName("fn.w")
    public ByteBuffer field2320;

    @ObfuscatedName("fn.w(B)[B")
    public byte[] method3235() {
        byte[] var1 = new byte[this.field2320.capacity()];
        this.field2320.position(0);
        this.field2320.get(var1);
        return var1;
    }

    @ObfuscatedName("fn.m([BI)V")
    public void method3237(byte[] arg0) {
        this.field2320 = ByteBuffer.allocateDirect(arg0.length);
        this.field2320.position(0);
        this.field2320.put(arg0);
    }
}
