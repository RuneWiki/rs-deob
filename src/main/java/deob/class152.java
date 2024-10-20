package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("es")
public class class152 extends class157 {

    @ObfuscatedName("es.x")
    public ByteBuffer field2044;

    @ObfuscatedName("es.x(B)[B")
    public byte[] method2678() {
        byte[] var1 = new byte[this.field2044.capacity()];
        this.field2044.position(0);
        this.field2044.get(var1);
        return var1;
    }

    @ObfuscatedName("es.n([BI)V")
    public void method2675(byte[] arg0) {
        this.field2044 = ByteBuffer.allocateDirect(arg0.length);
        this.field2044.position(0);
        this.field2044.put(arg0);
    }
}
