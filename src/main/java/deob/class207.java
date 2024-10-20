package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("gv")
public class class207 extends class206 {

    @ObfuscatedName("gv.a")
    public ByteBuffer field2478;

    @ObfuscatedName("gv.q(B)[B")
    public byte[] method3671() {
        byte[] var1 = new byte[this.field2478.capacity()];
        this.field2478.position(0);
        this.field2478.get(var1);
        return var1;
    }

    @ObfuscatedName("gv.v([BB)V")
    public void method3672(byte[] arg0) {
        this.field2478 = ByteBuffer.allocateDirect(arg0.length);
        this.field2478.position(0);
        this.field2478.put(arg0);
    }
}
