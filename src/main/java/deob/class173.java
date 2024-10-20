package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("fr")
public class class173 extends class178 {

    @ObfuscatedName("fr.e")
    public ByteBuffer field2333;

    @ObfuscatedName("fr.e(B)[B")
    public byte[] method2909() {
        byte[] var1 = new byte[this.field2333.capacity()];
        this.field2333.position(0);
        this.field2333.get(var1);
        return var1;
    }

    @ObfuscatedName("fr.n([BI)V")
    public void method2910(byte[] arg0) {
        this.field2333 = ByteBuffer.allocateDirect(arg0.length);
        this.field2333.position(0);
        this.field2333.put(arg0);
    }
}
