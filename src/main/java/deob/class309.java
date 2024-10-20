package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("kc")
public class class309 extends class307 {

    @ObfuscatedName("kc.a")
    public ByteBuffer field3656;

    @ObfuscatedName("kc.c(B)[B")
    public byte[] method5672() {
        byte[] var1 = new byte[this.field3656.capacity()];
        this.field3656.position(0);
        this.field3656.get(var1);
        return var1;
    }

    @ObfuscatedName("kc.x([BI)V")
    public void method5665(byte[] arg0) {
        this.field3656 = ByteBuffer.allocateDirect(arg0.length);
        this.field3656.position(0);
        this.field3656.put(arg0);
    }
}
