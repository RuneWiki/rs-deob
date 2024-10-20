package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("jc")
public class class268 extends class266 {

    @ObfuscatedName("jc.l")
    public ByteBuffer field3214;

    @ObfuscatedName("jc.j(B)[B")
    public byte[] method4644() {
        byte[] var1 = new byte[this.field3214.capacity()];
        this.field3214.position(0);
        this.field3214.get(var1);
        return var1;
    }

    @ObfuscatedName("jc.m([BI)V")
    public void method4650(byte[] arg0) {
        this.field3214 = ByteBuffer.allocateDirect(arg0.length);
        this.field3214.position(0);
        this.field3214.put(arg0);
    }
}
