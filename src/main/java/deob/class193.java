package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("ge")
public class class193 extends class199 {

    @ObfuscatedName("ge.t")
    public ByteBuffer field2505;

    @ObfuscatedName("ge.t(B)[B")
    public byte[] method3210() {
        byte[] var1 = new byte[this.field2505.capacity()];
        this.field2505.position(0);
        this.field2505.get(var1);
        return var1;
    }

    @ObfuscatedName("ge.q([BI)V")
    public void method3211(byte[] arg0) {
        this.field2505 = ByteBuffer.allocateDirect(arg0.length);
        this.field2505.position(0);
        this.field2505.put(arg0);
    }
}
