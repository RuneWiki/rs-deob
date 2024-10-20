package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("gu")
public class class207 extends class206 {

    @ObfuscatedName("gu.u")
    public ByteBuffer field2505;

    @ObfuscatedName("gu.b(S)[B")
    public byte[] method3623() {
        byte[] var1 = new byte[this.field2505.capacity()];
        this.field2505.position(0);
        this.field2505.get(var1);
        return var1;
    }

    @ObfuscatedName("gu.g([BI)V")
    public void method3632(byte[] arg0) {
        this.field2505 = ByteBuffer.allocateDirect(arg0.length);
        this.field2505.position(0);
        this.field2505.put(arg0);
    }
}
