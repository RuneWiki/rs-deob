package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("ev")
public class class152 extends class157 {

    @ObfuscatedName("ev.x")
    public ByteBuffer field2044;

    @ObfuscatedName("ev.x(I)[B")
    public byte[] method2614() {
        byte[] var1 = new byte[this.field2044.capacity()];
        this.field2044.position(0);
        this.field2044.get(var1);
        return var1;
    }

    @ObfuscatedName("ev.j([BI)V")
    public void method2613(byte[] arg0) {
        this.field2044 = ByteBuffer.allocateDirect(arg0.length);
        this.field2044.position(0);
        this.field2044.put(arg0);
    }
}
