package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("fj")
public class class172 extends class177 {

    @ObfuscatedName("fj.c")
    public ByteBuffer field2314;

    @ObfuscatedName("fj.c(I)[B")
    public byte[] method2840() {
        byte[] var1 = new byte[this.field2314.capacity()];
        this.field2314.position(0);
        this.field2314.get(var1);
        return var1;
    }

    @ObfuscatedName("fj.o([BI)V")
    public void method2832(byte[] arg0) {
        this.field2314 = ByteBuffer.allocateDirect(arg0.length);
        this.field2314.position(0);
        this.field2314.put(arg0);
    }
}
