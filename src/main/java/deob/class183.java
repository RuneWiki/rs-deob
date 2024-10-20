package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("gd")
public class class183 extends class189 {

    @ObfuscatedName("gd.y")
    public ByteBuffer field2334;

    @ObfuscatedName("gd.y(I)[B")
    public byte[] method3243() {
        byte[] var1 = new byte[this.field2334.capacity()];
        this.field2334.position(0);
        this.field2334.get(var1);
        return var1;
    }

    @ObfuscatedName("gd.c([BI)V")
    public void method3244(byte[] arg0) {
        this.field2334 = ByteBuffer.allocateDirect(arg0.length);
        this.field2334.position(0);
        this.field2334.put(arg0);
    }
}
