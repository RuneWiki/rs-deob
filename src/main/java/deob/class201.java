package deob;

@ObfuscatedName("gf")
public class class201 {

    @ObfuscatedName("gf.c")
    public byte field2942;

    @ObfuscatedName("gf.j")
    public int field2943;

    @ObfuscatedName("gf.y")
    public int field2940;

    @ObfuscatedName("gf.r")
    public int field2941;

    @ObfuscatedName("gf.f")
    public int field2939;

    @ObfuscatedName("gf.l")
    public int field2944;

    public class201() {
    }

    public class201(class108 arg0, boolean arg1) {
        this.field2942 = arg0.method2229();
        this.field2943 = arg0.method2136();
        this.field2940 = arg0.method2144();
        this.field2941 = arg0.method2144();
        this.field2939 = arg0.method2144();
        this.field2944 = arg0.method2144();
        if (arg1) {
            method2069(arg0);
        }
    }

    @ObfuscatedName("cb.c(Ldx;I)V")
    public static void method2069(class108 arg0) {
        if (arg0.method2134() != 255) {
            throw new IllegalStateException("");
        }
    }

    @ObfuscatedName("gf.j(B)I")
    public int method3407() {
        return this.field2942 & 0x7;
    }

    @ObfuscatedName("gf.y(S)I")
    public int method3408() {
        return (this.field2942 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("gf.r(II)V")
    public void method3409(int arg0) {
        this.field2942 &= 0xFFFFFFF8;
        this.field2942 = (byte) (this.field2942 | arg0 & 0x7);
    }

    @ObfuscatedName("gf.f(II)V")
    public void method3410(int arg0) {
        this.field2942 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field2942 = (byte) (this.field2942 | 0x8);
        }
    }
}
