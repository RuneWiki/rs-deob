package deob;

@ObfuscatedName("gp")
public class class201 {

    @ObfuscatedName("gp.f")
    public byte field2940;

    @ObfuscatedName("gp.k")
    public int field2933;

    @ObfuscatedName("gp.y")
    public int field2934;

    @ObfuscatedName("gp.e")
    public int field2935;

    @ObfuscatedName("gp.r")
    public int field2932;

    @ObfuscatedName("gp.a")
    public int field2937;

    public class201() {
    }

    public class201(class108 arg0, boolean arg1) {
        this.field2940 = arg0.method2159();
        this.field2933 = arg0.method2160();
        this.field2934 = arg0.method2256();
        this.field2935 = arg0.method2256();
        this.field2932 = arg0.method2256();
        this.field2937 = arg0.method2256();
        if (arg1 && arg0.method2158() != 255) {
            throw new IllegalStateException("");
        }
    }

    @ObfuscatedName("gp.f(B)I")
    public int method3438() {
        return this.field2940 & 0x7;
    }

    @ObfuscatedName("gp.k(I)I")
    public int method3439() {
        return (this.field2940 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("gp.y(IB)V")
    public void method3440(int arg0) {
        this.field2940 &= 0xFFFFFFF8;
        this.field2940 = (byte) (this.field2940 | arg0 & 0x7);
    }

    @ObfuscatedName("gp.e(II)V")
    public void method3437(int arg0) {
        this.field2940 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field2940 = (byte) (this.field2940 | 0x8);
        }
    }
}
