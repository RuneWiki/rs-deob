package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("if")
public class class253 extends class251 {

    @ObfuscatedName("if.v")
    public ByteBuffer field3128;

    @ObfuscatedName("if.f(B)[B")
    public byte[] method4369() {
        byte[] var1 = new byte[this.field3128.capacity()];
        this.field3128.position(0);
        this.field3128.get(var1);
        return var1;
    }

    @ObfuscatedName("if.y([BB)V")
    public void method4371(byte[] arg0) {
        this.field3128 = ByteBuffer.allocateDirect(arg0.length);
        this.field3128.position(0);
        this.field3128.put(arg0);
    }
}
