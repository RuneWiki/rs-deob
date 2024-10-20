package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("gn")
public class class183 extends class188 {

    @ObfuscatedName("gn.s")
    public ByteBuffer field2472;

    @ObfuscatedName("gn.s(I)[B")
    public byte[] method3211() {
        byte[] var1 = new byte[this.field2472.capacity()];
        this.field2472.position(0);
        this.field2472.get(var1);
        return var1;
    }

    @ObfuscatedName("gn.g([BI)V")
    public void method3210(byte[] arg0) {
        this.field2472 = ByteBuffer.allocateDirect(arg0.length);
        this.field2472.position(0);
        this.field2472.put(arg0);
    }
}
