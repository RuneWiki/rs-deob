package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("hi")
public class class216 extends class215 {

    @ObfuscatedName("hi.z")
    public ByteBuffer field2531;

    @ObfuscatedName("hi.s(I)[B")
    public byte[] method3677() {
        byte[] var1 = new byte[this.field2531.capacity()];
        this.field2531.position(0);
        this.field2531.get(var1);
        return var1;
    }

    @ObfuscatedName("hi.t([BI)V")
    public void method3678(byte[] arg0) {
        this.field2531 = ByteBuffer.allocateDirect(arg0.length);
        this.field2531.position(0);
        this.field2531.put(arg0);
    }
}
