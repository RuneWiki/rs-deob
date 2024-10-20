package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("fc")
public class class159 extends class164 {

    @ObfuscatedName("fc.n")
    public ByteBuffer field2245;

    @ObfuscatedName("fc.n(I)[B")
    public byte[] method2755() {
        byte[] var1 = new byte[this.field2245.capacity()];
        this.field2245.position(0);
        this.field2245.get(var1);
        return var1;
    }

    @ObfuscatedName("fc.d([BI)V")
    public void method2756(byte[] arg0) {
        this.field2245 = ByteBuffer.allocateDirect(arg0.length);
        this.field2245.position(0);
        this.field2245.put(arg0);
    }
}
