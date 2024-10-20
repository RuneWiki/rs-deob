package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("nc")
public class class364 extends class362 {

    @ObfuscatedName("nc.ak")
    public ByteBuffer field3984;

    @ObfuscatedName("nc.aj(B)[B")
    public byte[] method6469() {
        byte[] var1 = new byte[this.field3984.capacity()];
        this.field3984.position(0);
        this.field3984.get(var1);
        return var1;
    }

    @ObfuscatedName("nc.az([BI)V")
    public void method6459(byte[] arg0) {
        this.field3984 = ByteBuffer.allocateDirect(arg0.length);
        this.field3984.position(0);
        this.field3984.put(arg0);
    }
}
