package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("is")
public class class255 extends class253 {

    @ObfuscatedName("is.s")
    public ByteBuffer field3126;

    @ObfuscatedName("is.v(B)[B")
    public byte[] method4353() {
        byte[] var1 = new byte[this.field3126.capacity()];
        this.field3126.position(0);
        this.field3126.get(var1);
        return var1;
    }

    @ObfuscatedName("is.j([BI)V")
    public void method4342(byte[] arg0) {
        this.field3126 = ByteBuffer.allocateDirect(arg0.length);
        this.field3126.position(0);
        this.field3126.put(arg0);
    }
}
