package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("gc")
public class class183 extends class189 {

    @ObfuscatedName("gc.g")
    public ByteBuffer field2366;

    @ObfuscatedName("gc.g(S)[B")
    public byte[] method3437() {
        byte[] var1 = new byte[this.field2366.capacity()];
        this.field2366.position(0);
        this.field2366.get(var1);
        return var1;
    }

    @ObfuscatedName("gc.r([BI)V")
    public void method3438(byte[] arg0) {
        this.field2366 = ByteBuffer.allocateDirect(arg0.length);
        this.field2366.position(0);
        this.field2366.put(arg0);
    }
}
