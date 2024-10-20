package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("fm")
public class class172 extends class177 {

    @ObfuscatedName("fm.n")
    public ByteBuffer field2358;

    @ObfuscatedName("fm.n(I)[B")
    public byte[] method2894() {
        byte[] var1 = new byte[this.field2358.capacity()];
        this.field2358.position(0);
        this.field2358.get(var1);
        return var1;
    }

    @ObfuscatedName("fm.p([BB)V")
    public void method2895(byte[] arg0) {
        this.field2358 = ByteBuffer.allocateDirect(arg0.length);
        this.field2358.position(0);
        this.field2358.put(arg0);
    }
}
