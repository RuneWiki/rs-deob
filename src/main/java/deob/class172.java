package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("fs")
public class class172 extends class177 {

    @ObfuscatedName("fs.e")
    public ByteBuffer field2328;

    @ObfuscatedName("fs.e(I)[B")
    public byte[] method2872() {
        byte[] var1 = new byte[this.field2328.capacity()];
        this.field2328.position(0);
        this.field2328.get(var1);
        return var1;
    }

    @ObfuscatedName("fs.o([BI)V")
    public void method2868(byte[] arg0) {
        this.field2328 = ByteBuffer.allocateDirect(arg0.length);
        this.field2328.position(0);
        this.field2328.put(arg0);
    }
}
