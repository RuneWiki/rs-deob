package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("gn")
public class class207 extends class206 {

    @ObfuscatedName("gn.q")
    public ByteBuffer field2500;

    @ObfuscatedName("gn.e(I)[B")
    public byte[] method3568() {
        byte[] var1 = new byte[this.field2500.capacity()];
        this.field2500.position(0);
        this.field2500.get(var1);
        return var1;
    }

    @ObfuscatedName("gn.p([BI)V")
    public void method3569(byte[] arg0) {
        this.field2500 = ByteBuffer.allocateDirect(arg0.length);
        this.field2500.position(0);
        this.field2500.put(arg0);
    }
}
