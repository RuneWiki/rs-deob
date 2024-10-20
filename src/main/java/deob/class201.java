package deob;

@ObfuscatedName("gt")
public class class201 {

    @ObfuscatedName("gt.l")
    public byte field2936;

    @ObfuscatedName("gt.y")
    public int field2937;

    @ObfuscatedName("gt.g")
    public int field2939;

    @ObfuscatedName("gt.j")
    public int field2938;

    @ObfuscatedName("gt.w")
    public int field2940;

    @ObfuscatedName("gt.c")
    public int field2941;

    public class201() {
    }

    public class201(class108 arg0, boolean arg1) {
        this.field2936 = arg0.method2292();
        this.field2937 = arg0.method2163();
        this.field2939 = arg0.method2297();
        this.field2938 = arg0.method2297();
        this.field2940 = arg0.method2297();
        this.field2941 = arg0.method2297();
        if (arg1) {
            method2617(arg0);
        }
    }

    @ObfuscatedName("en.l(Ldk;I)V")
    public static void method2617(class108 arg0) {
        if (arg0.method2291() != 255) {
            throw new IllegalStateException("");
        }
    }

    @ObfuscatedName("gt.y(I)I")
    public int method3475() {
        return this.field2936 & 0x7;
    }

    @ObfuscatedName("gt.g(I)I")
    public int method3467() {
        return (this.field2936 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("gt.j(II)V")
    public void method3466(int arg0) {
        this.field2936 &= 0xFFFFFFF8;
        this.field2936 = (byte) (this.field2936 | arg0 & 0x7);
    }

    @ObfuscatedName("gt.w(II)V")
    public void method3469(int arg0) {
        this.field2936 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field2936 = (byte) (this.field2936 | 0x8);
        }
    }
}
