package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("gx")
public class class207 extends class206 {

    @ObfuscatedName("gx.c")
    public ByteBuffer field2469;

    @ObfuscatedName("gx.t(B)[B")
    public byte[] method3621() {
        byte[] var1 = new byte[this.field2469.capacity()];
        this.field2469.position(0);
        this.field2469.get(var1);
        return var1;
    }

    @ObfuscatedName("gx.g([BI)V")
    public void method3614(byte[] arg0) {
        this.field2469 = ByteBuffer.allocateDirect(arg0.length);
        this.field2469.position(0);
        this.field2469.put(arg0);
    }
}
