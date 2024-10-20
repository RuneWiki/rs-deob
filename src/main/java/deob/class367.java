package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("oe")
public class class367 extends class365 {

    @ObfuscatedName("oe.ab")
    public ByteBuffer field3977;

    @ObfuscatedName("oe.an(I)[B")
    public byte[] method6535() {
        byte[] var1 = new byte[this.field3977.capacity()];
        this.field3977.position(0);
        this.field3977.get(var1);
        return var1;
    }

    @ObfuscatedName("oe.au([BB)V")
    public void method6545(byte[] arg0) {
        this.field3977 = ByteBuffer.allocateDirect(arg0.length);
        this.field3977.position(0);
        this.field3977.put(arg0);
    }
}
