package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("fl")
public class class172 extends class177 {

    @ObfuscatedName("fl.p")
    public ByteBuffer field2367;

    @ObfuscatedName("fl.p(S)[B")
    public byte[] method2785() {
        byte[] var1 = new byte[this.field2367.capacity()];
        this.field2367.position(0);
        this.field2367.get(var1);
        return var1;
    }

    @ObfuscatedName("fl.m([BB)V")
    public void method2784(byte[] arg0) {
        this.field2367 = ByteBuffer.allocateDirect(arg0.length);
        this.field2367.position(0);
        this.field2367.put(arg0);
    }
}
