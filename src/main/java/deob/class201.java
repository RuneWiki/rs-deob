package deob;

@ObfuscatedName("gu")
public class class201 {

    @ObfuscatedName("gu.e")
    public byte field2942;

    @ObfuscatedName("gu.v")
    public int field2939;

    @ObfuscatedName("gu.k")
    public int field2941;

    @ObfuscatedName("gu.g")
    public int field2940;

    @ObfuscatedName("gu.q")
    public int field2943;

    @ObfuscatedName("gu.l")
    public int field2944;

    public class201() {
    }

    public class201(class108 arg0, boolean arg1) {
        this.field2942 = arg0.method2190();
        this.field2939 = arg0.method2124();
        this.field2941 = arg0.method2127();
        this.field2940 = arg0.method2127();
        this.field2943 = arg0.method2127();
        this.field2944 = arg0.method2127();
        if (arg1 && arg0.method2122() != 255) {
            throw new IllegalStateException("");
        }
    }

    @ObfuscatedName("gu.e(B)I")
    public int method3394() {
        return this.field2942 & 0x7;
    }

    @ObfuscatedName("gu.v(I)I")
    public int method3392() {
        return (this.field2942 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("gu.k(II)V")
    public void method3402(int arg0) {
        this.field2942 &= 0xFFFFFFF8;
        this.field2942 = (byte) (this.field2942 | arg0 & 0x7);
    }

    @ObfuscatedName("gu.g(II)V")
    public void method3393(int arg0) {
        this.field2942 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field2942 = (byte) (this.field2942 | 0x8);
        }
    }
}
