package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("ea")
public class class152 extends class157 {

    @ObfuscatedName("ea.p")
    public ByteBuffer field2047;

    @ObfuscatedName("ea.p(I)[B")
    public byte[] method2569() {
        byte[] var1 = new byte[this.field2047.capacity()];
        this.field2047.position(0);
        this.field2047.get(var1);
        return var1;
    }

    @ObfuscatedName("ea.g([BB)V")
    public void method2570(byte[] arg0) {
        this.field2047 = ByteBuffer.allocateDirect(arg0.length);
        this.field2047.position(0);
        this.field2047.put(arg0);
    }
}
