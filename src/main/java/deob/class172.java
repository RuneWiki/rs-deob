package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("fe")
public class class172 extends class177 {

    @ObfuscatedName("fe.i")
    public ByteBuffer field2366;

    @ObfuscatedName("fe.i(B)[B")
    public byte[] method2844() {
        byte[] var1 = new byte[this.field2366.capacity()];
        this.field2366.position(0);
        this.field2366.get(var1);
        return var1;
    }

    @ObfuscatedName("fe.c([BI)V")
    public void method2851(byte[] arg0) {
        this.field2366 = ByteBuffer.allocateDirect(arg0.length);
        this.field2366.position(0);
        this.field2366.put(arg0);
    }
}
