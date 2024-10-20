package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("gn")
public class class183 extends class189 {

    @ObfuscatedName("gn.c")
    public ByteBuffer field2342;

    @ObfuscatedName("gn.c(I)[B")
    public byte[] method3223() {
        byte[] var1 = new byte[this.field2342.capacity()];
        this.field2342.position(0);
        this.field2342.get(var1);
        return var1;
    }

    @ObfuscatedName("gn.q([BI)V")
    public void method3220(byte[] arg0) {
        this.field2342 = ByteBuffer.allocateDirect(arg0.length);
        this.field2342.position(0);
        this.field2342.put(arg0);
    }
}
