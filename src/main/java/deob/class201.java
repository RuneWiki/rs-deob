package deob;

@ObfuscatedName("ge")
public class class201 {

    @ObfuscatedName("ge.g")
    public byte field2939;

    @ObfuscatedName("ge.j")
    public int field2944;

    @ObfuscatedName("ge.z")
    public int field2940;

    @ObfuscatedName("ge.b")
    public int field2941;

    @ObfuscatedName("ge.k")
    public int field2942;

    @ObfuscatedName("ge.c")
    public int field2943;

    public class201() {
    }

    public class201(class108 arg0, boolean arg1) {
        this.field2939 = arg0.method2173();
        this.field2944 = arg0.method2263();
        this.field2940 = arg0.method2117();
        this.field2941 = arg0.method2117();
        this.field2942 = arg0.method2117();
        this.field2943 = arg0.method2117();
        if (arg1) {
            method1923(arg0);
        }
    }

    @ObfuscatedName("cy.g(Ldf;I)V")
    public static void method1923(class108 arg0) {
        if (arg0.method2083() != 255) {
            throw new IllegalStateException("");
        }
    }

    @ObfuscatedName("ge.j(B)I")
    public int method3329() {
        return this.field2939 & 0x7;
    }

    @ObfuscatedName("ge.z(B)I")
    public int method3330() {
        return (this.field2939 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("ge.b(II)V")
    public void method3328(int arg0) {
        this.field2939 &= 0xFFFFFFF8;
        this.field2939 = (byte) (this.field2939 | arg0 & 0x7);
    }

    @ObfuscatedName("ge.k(II)V")
    public void method3332(int arg0) {
        this.field2939 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field2939 = (byte) (this.field2939 | 0x8);
        }
    }
}
