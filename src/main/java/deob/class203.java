package deob;

@ObfuscatedName("gg")
public class class203 {

    @ObfuscatedName("gg.a")
    public byte field2965;

    @ObfuscatedName("gg.v")
    public int field2960;

    @ObfuscatedName("gg.i")
    public int field2959;

    @ObfuscatedName("gg.b")
    public int field2962;

    @ObfuscatedName("gg.l")
    public int field2963;

    @ObfuscatedName("gg.m")
    public int field2961;

    public class203() {
    }

    public class203(class110 arg0, boolean arg1) {
        this.field2965 = arg0.method2132();
        this.field2960 = arg0.method2282();
        this.field2959 = arg0.method2136();
        this.field2962 = arg0.method2136();
        this.field2963 = arg0.method2136();
        this.field2961 = arg0.method2136();
        if (arg1) {
            method1866(arg0);
        }
    }

    @ObfuscatedName("cn.a(Ldi;I)V")
    public static void method1866(class110 arg0) {
        if (arg0.method2199() != 255) {
            throw new IllegalStateException("");
        }
    }

    @ObfuscatedName("gg.v(I)I")
    public int method3418() {
        return this.field2965 & 0x7;
    }

    @ObfuscatedName("gg.i(I)I")
    public int method3420() {
        return (this.field2965 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("gg.b(II)V")
    public void method3428(int arg0) {
        this.field2965 &= 0xFFFFFFF8;
        this.field2965 = (byte) (this.field2965 | arg0 & 0x7);
    }

    @ObfuscatedName("gg.l(IS)V")
    public void method3421(int arg0) {
        this.field2965 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field2965 = (byte) (this.field2965 | 0x8);
        }
    }
}
