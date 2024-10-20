package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("mo")
public class class319 extends class317 {

    @ObfuscatedName("mo.aj")
    public ByteBuffer field3697;

    @ObfuscatedName("mo.ac(B)[B")
    public byte[] method5734() {
        byte[] var1 = new byte[this.field3697.capacity()];
        this.field3697.position(0);
        this.field3697.get(var1);
        return var1;
    }

    @ObfuscatedName("mo.ab([BB)V")
    public void method5728(byte[] arg0) {
        this.field3697 = ByteBuffer.allocateDirect(arg0.length);
        this.field3697.position(0);
        this.field3697.put(arg0);
    }
}
