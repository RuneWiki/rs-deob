package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("eh")
public class class152 extends class157 {

    @ObfuscatedName("eh.q")
    public ByteBuffer field2047;

    @ObfuscatedName("eh.q(B)[B")
    public byte[] method2642() {
        byte[] var1 = new byte[this.field2047.capacity()];
        this.field2047.position(0);
        this.field2047.get(var1);
        return var1;
    }

    @ObfuscatedName("eh.d([BI)V")
    public void method2641(byte[] arg0) {
        this.field2047 = ByteBuffer.allocateDirect(arg0.length);
        this.field2047.position(0);
        this.field2047.put(arg0);
    }
}
