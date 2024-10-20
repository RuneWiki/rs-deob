package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("dk")
public class class43 extends class51 {

    @ObfuscatedName("dk.h")
    public ByteBuffer field491;

    @ObfuscatedName("dk.w(S)[B")
    public byte[] method593() {
        byte[] var1 = new byte[this.field491.capacity()];
        this.field491.position(0);
        this.field491.get(var1);
        return var1;
    }

    @ObfuscatedName("dk.t([BB)V")
    public void method595(byte[] arg0) {
        this.field491 = ByteBuffer.allocateDirect(arg0.length);
        this.field491.position(0);
        this.field491.put(arg0);
    }
}
