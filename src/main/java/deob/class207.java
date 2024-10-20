package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("gc")
public class class207 extends class206 {

    @ObfuscatedName("gc.c")
    public ByteBuffer field2507;

    @ObfuscatedName("gc.t(I)[B")
    public byte[] method3628() {
        byte[] var1 = new byte[this.field2507.capacity()];
        this.field2507.position(0);
        this.field2507.get(var1);
        return var1;
    }

    @ObfuscatedName("gc.o([BI)V")
    public void method3632(byte[] arg0) {
        this.field2507 = ByteBuffer.allocateDirect(arg0.length);
        this.field2507.position(0);
        this.field2507.put(arg0);
    }
}
