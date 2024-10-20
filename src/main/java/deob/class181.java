package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("fe")
public class class181 extends class187 {

    @ObfuscatedName("fe.z")
    public ByteBuffer field2294;

    @ObfuscatedName("fe.z(B)[B")
    public byte[] method3222() {
        byte[] var1 = new byte[this.field2294.capacity()];
        this.field2294.position(0);
        this.field2294.get(var1);
        return var1;
    }

    @ObfuscatedName("fe.w([BI)V")
    public void method3223(byte[] arg0) {
        this.field2294 = ByteBuffer.allocateDirect(arg0.length);
        this.field2294.position(0);
        this.field2294.put(arg0);
    }
}
