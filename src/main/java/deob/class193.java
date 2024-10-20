package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("gr")
public class class193 extends class199 {

    @ObfuscatedName("gr.g")
    public ByteBuffer field2522;

    @ObfuscatedName("gr.g(I)[B")
    public byte[] method3282() {
        byte[] var1 = new byte[this.field2522.capacity()];
        this.field2522.position(0);
        this.field2522.get(var1);
        return var1;
    }

    @ObfuscatedName("gr.e([BI)V")
    public void method3283(byte[] arg0) {
        this.field2522 = ByteBuffer.allocateDirect(arg0.length);
        this.field2522.position(0);
        this.field2522.put(arg0);
    }
}
