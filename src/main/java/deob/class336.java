package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("mt")
public class class336 extends class334 {

    @ObfuscatedName("mt.at")
    public ByteBuffer field3774;

    @ObfuscatedName("mt.as(I)[B")
    public byte[] method5963() {
        byte[] var1 = new byte[this.field3774.capacity()];
        this.field3774.position(0);
        this.field3774.get(var1);
        return var1;
    }

    @ObfuscatedName("mt.ax([BI)V")
    public void method5964(byte[] arg0) {
        this.field3774 = ByteBuffer.allocateDirect(arg0.length);
        this.field3774.position(0);
        this.field3774.put(arg0);
    }
}
