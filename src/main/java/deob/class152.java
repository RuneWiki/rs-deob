package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("ew")
public class class152 extends class157 {

    @ObfuscatedName("ew.u")
    public ByteBuffer field2029;

    @ObfuscatedName("ew.u(I)[B")
    public byte[] method2562() {
        byte[] var1 = new byte[this.field2029.capacity()];
        this.field2029.position(0);
        this.field2029.get(var1);
        return var1;
    }

    @ObfuscatedName("ew.x([BI)V")
    public void method2568(byte[] arg0) {
        this.field2029 = ByteBuffer.allocateDirect(arg0.length);
        this.field2029.position(0);
        this.field2029.put(arg0);
    }
}
