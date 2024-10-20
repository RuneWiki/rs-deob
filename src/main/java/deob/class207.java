package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("gj")
public class class207 extends class206 {

    @ObfuscatedName("gj.z")
    public ByteBuffer field2477;

    @ObfuscatedName("gj.u(B)[B")
    public byte[] method3531() {
        byte[] var1 = new byte[this.field2477.capacity()];
        this.field2477.position(0);
        this.field2477.get(var1);
        return var1;
    }

    @ObfuscatedName("gj.r([BI)V")
    public void method3532(byte[] arg0) {
        this.field2477 = ByteBuffer.allocateDirect(arg0.length);
        this.field2477.position(0);
        this.field2477.put(arg0);
    }
}
