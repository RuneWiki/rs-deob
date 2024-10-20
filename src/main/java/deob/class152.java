package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("el")
public class class152 extends class157 {

    @ObfuscatedName("el.b")
    public ByteBuffer field2034;

    @ObfuscatedName("el.b(B)[B")
    public byte[] method2644() {
        byte[] var1 = new byte[this.field2034.capacity()];
        this.field2034.position(0);
        this.field2034.get(var1);
        return var1;
    }

    @ObfuscatedName("el.e([BI)V")
    public void method2645(byte[] arg0) {
        this.field2034 = ByteBuffer.allocateDirect(arg0.length);
        this.field2034.position(0);
        this.field2034.put(arg0);
    }
}
