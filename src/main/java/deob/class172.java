package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("ft")
public class class172 extends class177 {

    @ObfuscatedName("ft.d")
    public ByteBuffer field2323;

    @ObfuscatedName("ft.d(I)[B")
    public byte[] method2895() {
        byte[] var1 = new byte[this.field2323.capacity()];
        this.field2323.position(0);
        this.field2323.get(var1);
        return var1;
    }

    @ObfuscatedName("ft.q([BB)V")
    public void method2890(byte[] arg0) {
        this.field2323 = ByteBuffer.allocateDirect(arg0.length);
        this.field2323.position(0);
        this.field2323.put(arg0);
    }
}
