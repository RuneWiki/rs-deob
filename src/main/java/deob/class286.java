package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("js")
public class class286 extends class284 {

    @ObfuscatedName("js.v")
    public ByteBuffer field3274;

    @ObfuscatedName("js.f(I)[B")
    public byte[] method4948() {
        byte[] var1 = new byte[this.field3274.capacity()];
        this.field3274.position(0);
        this.field3274.get(var1);
        return var1;
    }

    @ObfuscatedName("js.b([BI)V")
    public void method4950(byte[] arg0) {
        this.field3274 = ByteBuffer.allocateDirect(arg0.length);
        this.field3274.position(0);
        this.field3274.put(arg0);
    }
}
