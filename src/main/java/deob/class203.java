package deob;

@ObfuscatedName("gm")
public class class203 {

    @ObfuscatedName("gm.b")
    public byte field2953;

    @ObfuscatedName("gm.e")
    public int field2955;

    @ObfuscatedName("gm.i")
    public int field2954;

    @ObfuscatedName("gm.k")
    public int field2956;

    @ObfuscatedName("gm.h")
    public int field2957;

    @ObfuscatedName("gm.p")
    public int field2958;

    public class203() {
    }

    public class203(class110 arg0, boolean arg1) {
        this.field2953 = arg0.method2294();
        this.field2955 = arg0.method2292();
        this.field2954 = arg0.method2195();
        this.field2956 = arg0.method2195();
        this.field2957 = arg0.method2195();
        this.field2958 = arg0.method2195();
        if (arg1 && arg0.method2142() != 255) {
            throw new IllegalStateException("");
        }
    }

    @ObfuscatedName("gm.b(B)I")
    public int method3471() {
        return this.field2953 & 0x7;
    }

    @ObfuscatedName("gm.e(I)I")
    public int method3469() {
        return (this.field2953 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("gm.i(II)V")
    public void method3472(int arg0) {
        this.field2953 &= 0xFFFFFFF8;
        this.field2953 = (byte) (this.field2953 | arg0 & 0x7);
    }

    @ObfuscatedName("gm.k(II)V")
    public void method3473(int arg0) {
        this.field2953 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field2953 = (byte) (this.field2953 | 0x8);
        }
    }
}
