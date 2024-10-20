package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("hl")
public class class216 extends class215 {

    @ObfuscatedName("hl.x")
    public ByteBuffer field2501;

    @ObfuscatedName("hl.k(I)[B")
    public byte[] method3655() {
        byte[] var1 = new byte[this.field2501.capacity()];
        this.field2501.position(0);
        this.field2501.get(var1);
        return var1;
    }

    @ObfuscatedName("hl.d([BB)V")
    public void method3656(byte[] arg0) {
        this.field2501 = ByteBuffer.allocateDirect(arg0.length);
        this.field2501.position(0);
        this.field2501.put(arg0);
    }
}
