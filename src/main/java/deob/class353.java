package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("nh")
public class class353 extends class351 {

    @ObfuscatedName("nh.ac")
    public ByteBuffer field3845;

    @ObfuscatedName("nh.al(I)[B")
    public byte[] method6149() {
        byte[] var1 = new byte[this.field3845.capacity()];
        this.field3845.position(0);
        this.field3845.get(var1);
        return var1;
    }

    @ObfuscatedName("nh.ak([BI)V")
    public void method6150(byte[] arg0) {
        this.field3845 = ByteBuffer.allocateDirect(arg0.length);
        this.field3845.position(0);
        this.field3845.put(arg0);
    }
}
