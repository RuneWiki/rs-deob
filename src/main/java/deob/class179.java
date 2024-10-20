package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("fl")
public class class179 extends class184 {

    @ObfuscatedName("fl.m")
    public ByteBuffer field2455;

    @ObfuscatedName("fl.m(I)[B")
    public byte[] method2984() {
        byte[] var1 = new byte[this.field2455.capacity()];
        this.field2455.position(0);
        this.field2455.get(var1);
        return var1;
    }

    @ObfuscatedName("fl.p([BI)V")
    public void method2986(byte[] arg0) {
        this.field2455 = ByteBuffer.allocateDirect(arg0.length);
        this.field2455.position(0);
        this.field2455.put(arg0);
    }
}
