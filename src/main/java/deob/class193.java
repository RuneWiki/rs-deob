package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("gy")
public class class193 extends class199 {

    @ObfuscatedName("gy.o")
    public ByteBuffer field2535;

    @ObfuscatedName("gy.o(I)[B")
    public byte[] method3181() {
        byte[] var1 = new byte[this.field2535.capacity()];
        this.field2535.position(0);
        this.field2535.get(var1);
        return var1;
    }

    @ObfuscatedName("gy.k([BI)V")
    public void method3180(byte[] arg0) {
        this.field2535 = ByteBuffer.allocateDirect(arg0.length);
        this.field2535.position(0);
        this.field2535.put(arg0);
    }
}
