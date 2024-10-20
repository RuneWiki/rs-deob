package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("nb")
public class class356 extends class354 {

    @ObfuscatedName("nb.az")
    public ByteBuffer field3914;

    @ObfuscatedName("nb.ah(B)[B")
    public byte[] method6222() {
        byte[] var1 = new byte[this.field3914.capacity()];
        this.field3914.position(0);
        this.field3914.get(var1);
        return var1;
    }

    @ObfuscatedName("nb.af([BB)V")
    public void method6224(byte[] arg0) {
        this.field3914 = ByteBuffer.allocateDirect(arg0.length);
        this.field3914.position(0);
        this.field3914.put(arg0);
    }
}
