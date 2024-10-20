package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("nt")
public class class351 extends class349 {

    @ObfuscatedName("nt.am")
    public ByteBuffer field3864;

    @ObfuscatedName("nt.af(I)[B")
    public byte[] method6265() {
        byte[] var1 = new byte[this.field3864.capacity()];
        this.field3864.position(0);
        this.field3864.get(var1);
        return var1;
    }

    @ObfuscatedName("nt.aj([BI)V")
    public void method6260(byte[] arg0) {
        this.field3864 = ByteBuffer.allocateDirect(arg0.length);
        this.field3864.position(0);
        this.field3864.put(arg0);
    }
}
