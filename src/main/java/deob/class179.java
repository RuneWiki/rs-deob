package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("fd")
public class class179 extends class184 {

    @ObfuscatedName("fd.b")
    public ByteBuffer field2448;

    @ObfuscatedName("fd.b(B)[B")
    public byte[] method2919() {
        byte[] var1 = new byte[this.field2448.capacity()];
        this.field2448.position(0);
        this.field2448.get(var1);
        return var1;
    }

    @ObfuscatedName("fd.s([BI)V")
    public void method2921(byte[] arg0) {
        this.field2448 = ByteBuffer.allocateDirect(arg0.length);
        this.field2448.position(0);
        this.field2448.put(arg0);
    }
}
