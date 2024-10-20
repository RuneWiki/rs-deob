package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("oa")
public class class368 extends class366 {

    @ObfuscatedName("oa.ap")
    public ByteBuffer field4054;

    @ObfuscatedName("oa.ak(I)[B")
    public byte[] method6883() {
        byte[] var1 = new byte[this.field4054.capacity()];
        this.field4054.position(0);
        this.field4054.get(var1);
        return var1;
    }

    @ObfuscatedName("oa.aj([BI)V")
    public void method6884(byte[] arg0) {
        this.field4054 = ByteBuffer.allocateDirect(arg0.length);
        this.field4054.position(0);
        this.field4054.put(arg0);
    }
}
