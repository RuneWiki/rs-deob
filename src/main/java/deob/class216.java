package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("hv")
public class class216 extends class215 {

    @ObfuscatedName("hv.h")
    public ByteBuffer field2513;

    @ObfuscatedName("hv.v(I)[B")
    public byte[] method3624() {
        byte[] var1 = new byte[this.field2513.capacity()];
        this.field2513.position(0);
        this.field2513.get(var1);
        return var1;
    }

    @ObfuscatedName("hv.x([BI)V")
    public void method3625(byte[] arg0) {
        this.field2513 = ByteBuffer.allocateDirect(arg0.length);
        this.field2513.position(0);
        this.field2513.put(arg0);
    }
}
