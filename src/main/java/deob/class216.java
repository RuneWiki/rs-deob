package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("hk")
public class class216 extends class215 {

    @ObfuscatedName("hk.m")
    public ByteBuffer field2535;

    @ObfuscatedName("hk.j(I)[B")
    public byte[] method3675() {
        byte[] var1 = new byte[this.field2535.capacity()];
        this.field2535.position(0);
        this.field2535.get(var1);
        return var1;
    }

    @ObfuscatedName("hk.p([BB)V")
    public void method3682(byte[] arg0) {
        this.field2535 = ByteBuffer.allocateDirect(arg0.length);
        this.field2535.position(0);
        this.field2535.put(arg0);
    }
}
