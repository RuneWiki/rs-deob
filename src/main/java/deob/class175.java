package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("fw")
public class class175 extends class180 {

    @ObfuscatedName("fw.w")
    public ByteBuffer field2370;

    @ObfuscatedName("fw.w(I)[B")
    public byte[] method2860() {
        byte[] var1 = new byte[this.field2370.capacity()];
        this.field2370.position(0);
        this.field2370.get(var1);
        return var1;
    }

    @ObfuscatedName("fw.o([BI)V")
    public void method2861(byte[] arg0) {
        this.field2370 = ByteBuffer.allocateDirect(arg0.length);
        this.field2370.position(0);
        this.field2370.put(arg0);
    }
}
