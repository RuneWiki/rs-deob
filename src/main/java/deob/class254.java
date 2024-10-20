package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("iu")
public class class254 extends class252 {

    @ObfuscatedName("iu.f")
    public ByteBuffer field3132;

    @ObfuscatedName("iu.v(I)[B")
    public byte[] method4411() {
        byte[] var1 = new byte[this.field3132.capacity()];
        this.field3132.position(0);
        this.field3132.get(var1);
        return var1;
    }

    @ObfuscatedName("iu.y([BI)V")
    public void method4406(byte[] arg0) {
        this.field3132 = ByteBuffer.allocateDirect(arg0.length);
        this.field3132.position(0);
        this.field3132.put(arg0);
    }
}
