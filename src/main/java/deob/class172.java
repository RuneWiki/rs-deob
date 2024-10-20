package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("fo")
public class class172 extends class177 {

    @ObfuscatedName("fo.d")
    public ByteBuffer field2363;

    @ObfuscatedName("fo.d(B)[B")
    public byte[] method2932() {
        byte[] var1 = new byte[this.field2363.capacity()];
        this.field2363.position(0);
        this.field2363.get(var1);
        return var1;
    }

    @ObfuscatedName("fo.k([BI)V")
    public void method2931(byte[] arg0) {
        this.field2363 = ByteBuffer.allocateDirect(arg0.length);
        this.field2363.position(0);
        this.field2363.put(arg0);
    }
}
