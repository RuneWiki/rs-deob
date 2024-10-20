package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("ge")
public class class183 extends class188 {

    @ObfuscatedName("ge.p")
    public ByteBuffer field2446;

    @ObfuscatedName("ge.p(I)[B")
    public byte[] method3100() {
        byte[] var1 = new byte[this.field2446.capacity()];
        this.field2446.position(0);
        this.field2446.get(var1);
        return var1;
    }

    @ObfuscatedName("ge.i([BI)V")
    public void method3101(byte[] arg0) {
        this.field2446 = ByteBuffer.allocateDirect(arg0.length);
        this.field2446.position(0);
        this.field2446.put(arg0);
    }
}
