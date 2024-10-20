package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("fp")
public class class172 extends class177 {

    @ObfuscatedName("fp.a")
    public ByteBuffer field2351;

    @ObfuscatedName("fp.a(I)[B")
    public byte[] method2847() {
        byte[] var1 = new byte[this.field2351.capacity()];
        this.field2351.position(0);
        this.field2351.get(var1);
        return var1;
    }

    @ObfuscatedName("fp.j([BI)V")
    public void method2848(byte[] arg0) {
        this.field2351 = ByteBuffer.allocateDirect(arg0.length);
        this.field2351.position(0);
        this.field2351.put(arg0);
    }
}
