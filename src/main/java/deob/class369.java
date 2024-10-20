package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("ov")
public class class369 extends class367 {

    @ObfuscatedName("ov.ac")
    public ByteBuffer field4026;

    @ObfuscatedName("ov.ae(I)[B")
    public byte[] method6682() {
        byte[] var1 = new byte[this.field4026.capacity()];
        this.field4026.position(0);
        this.field4026.get(var1);
        return var1;
    }

    @ObfuscatedName("ov.ag([BB)V")
    public void method6681(byte[] arg0) {
        this.field4026 = ByteBuffer.allocateDirect(arg0.length);
        this.field4026.position(0);
        this.field4026.put(arg0);
    }
}
