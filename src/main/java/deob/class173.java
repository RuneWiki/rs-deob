package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("fy")
public class class173 extends class178 {

    @ObfuscatedName("fy.j")
    public ByteBuffer field2347;

    @ObfuscatedName("fy.j(I)[B")
    public byte[] method2882() {
        byte[] var1 = new byte[this.field2347.capacity()];
        this.field2347.position(0);
        this.field2347.get(var1);
        return var1;
    }

    @ObfuscatedName("fy.h([BS)V")
    public void method2881(byte[] arg0) {
        this.field2347 = ByteBuffer.allocateDirect(arg0.length);
        this.field2347.position(0);
        this.field2347.put(arg0);
    }
}
