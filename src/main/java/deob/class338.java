package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("ms")
public class class338 extends class336 {

    @ObfuscatedName("ms.au")
    public ByteBuffer field3812;

    @ObfuscatedName("ms.ae(I)[B")
    public byte[] method6029() {
        byte[] var1 = new byte[this.field3812.capacity()];
        this.field3812.position(0);
        this.field3812.get(var1);
        return var1;
    }

    @ObfuscatedName("ms.ao([BI)V")
    public void method6025(byte[] arg0) {
        this.field3812 = ByteBuffer.allocateDirect(arg0.length);
        this.field3812.position(0);
        this.field3812.put(arg0);
    }
}
