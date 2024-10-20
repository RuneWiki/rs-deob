package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("hf")
public class class216 extends class215 {

    @ObfuscatedName("hf.n")
    public ByteBuffer field2524;

    @ObfuscatedName("hf.c(I)[B")
    public byte[] method3784() {
        byte[] var1 = new byte[this.field2524.capacity()];
        this.field2524.position(0);
        this.field2524.get(var1);
        return var1;
    }

    @ObfuscatedName("hf.y([BI)V")
    public void method3774(byte[] arg0) {
        this.field2524 = ByteBuffer.allocateDirect(arg0.length);
        this.field2524.position(0);
        this.field2524.put(arg0);
    }
}
