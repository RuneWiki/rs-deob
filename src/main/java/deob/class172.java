package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("fm")
public class class172 extends class177 {

    @ObfuscatedName("fm.w")
    public ByteBuffer field2346;

    @ObfuscatedName("fm.w(I)[B")
    public byte[] method2948() {
        byte[] var1 = new byte[this.field2346.capacity()];
        this.field2346.position(0);
        this.field2346.get(var1);
        return var1;
    }

    @ObfuscatedName("fm.s([BI)V")
    public void method2949(byte[] arg0) {
        this.field2346 = ByteBuffer.allocateDirect(arg0.length);
        this.field2346.position(0);
        this.field2346.put(arg0);
    }
}
