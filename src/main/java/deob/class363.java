package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("nb")
public class class363 extends class361 {

    @ObfuscatedName("nb.aq")
    public ByteBuffer field3990;

    @ObfuscatedName("nb.ak(B)[B")
    public byte[] method6395() {
        byte[] var1 = new byte[this.field3990.capacity()];
        this.field3990.position(0);
        this.field3990.get(var1);
        return var1;
    }

    @ObfuscatedName("nb.ap([BI)V")
    public void method6392(byte[] arg0) {
        this.field3990 = ByteBuffer.allocateDirect(arg0.length);
        this.field3990.position(0);
        this.field3990.put(arg0);
    }
}
