package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("jl")
public class class286 extends class284 {

    @ObfuscatedName("jl.o")
    public ByteBuffer field3337;

    @ObfuscatedName("jl.k(B)[B")
    public byte[] method4886() {
        byte[] var1 = new byte[this.field3337.capacity()];
        this.field3337.position(0);
        this.field3337.get(var1);
        return var1;
    }

    @ObfuscatedName("jl.a([BI)V")
    public void method4884(byte[] arg0) {
        this.field3337 = ByteBuffer.allocateDirect(arg0.length);
        this.field3337.position(0);
        this.field3337.put(arg0);
    }
}
