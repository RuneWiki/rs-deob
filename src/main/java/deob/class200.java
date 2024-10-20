package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("gv")
public class class200 extends class206 {

    @ObfuscatedName("gv.m")
    public ByteBuffer field2399;

    @ObfuscatedName("gv.m(I)[B")
    public byte[] method3396() {
        byte[] var1 = new byte[this.field2399.capacity()];
        this.field2399.position(0);
        this.field2399.get(var1);
        return var1;
    }

    @ObfuscatedName("gv.f([BI)V")
    public void method3395(byte[] arg0) {
        this.field2399 = ByteBuffer.allocateDirect(arg0.length);
        this.field2399.position(0);
        this.field2399.put(arg0);
    }
}
