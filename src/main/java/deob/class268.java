package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("jm")
public class class268 extends class266 {

    @ObfuscatedName("jm.n")
    public ByteBuffer field3217;

    @ObfuscatedName("jm.k(S)[B")
    public byte[] method4615() {
        byte[] var1 = new byte[this.field3217.capacity()];
        this.field3217.position(0);
        this.field3217.get(var1);
        return var1;
    }

    @ObfuscatedName("jm.o([BS)V")
    public void method4608(byte[] arg0) {
        this.field3217 = ByteBuffer.allocateDirect(arg0.length);
        this.field3217.position(0);
        this.field3217.put(arg0);
    }
}
