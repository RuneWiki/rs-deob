package deob;

@ObfuscatedName("hs")
public class class220 {

    @ObfuscatedName("hs.o")
    public byte field3156;

    @ObfuscatedName("hs.f")
    public int field3155;

    @ObfuscatedName("hs.i")
    public int field3161;

    @ObfuscatedName("hs.h")
    public int field3157;

    @ObfuscatedName("hs.q")
    public int field3158;

    @ObfuscatedName("hs.u")
    public int field3159;

    public class220() {
    }

    public class220(class119 arg0, boolean arg1) {
        this.field3156 = arg0.method2435();
        this.field3155 = arg0.method2292();
        this.field3161 = arg0.method2295();
        this.field3157 = arg0.method2295();
        this.field3158 = arg0.method2295();
        this.field3159 = arg0.method2295();
        if (arg1) {
            this.method3687(method2083(arg0));
        }
    }

    @ObfuscatedName("cx.o(Ldc;B)Ljava/lang/Integer;")
    public static Integer method2083(class119 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2290();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2290();
                if (var4 == 255) {
                    break;
                }
                arg0.field1984--;
                if (arg0.method2292() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2295();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("hs.f(Ljava/lang/Integer;B)V")
    public void method3687(Integer arg0) {
    }

    @ObfuscatedName("hs.i(B)I")
    public int method3700() {
        return this.field3156 & 0x7;
    }

    @ObfuscatedName("hs.h(I)I")
    public int method3689() {
        return (this.field3156 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hs.q(II)V")
    public void method3690(int arg0) {
        this.field3156 &= 0xFFFFFFF8;
        this.field3156 = (byte) (this.field3156 | arg0 & 0x7);
    }

    @ObfuscatedName("hs.u(II)V")
    public void method3691(int arg0) {
        this.field3156 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3156 = (byte) (this.field3156 | 0x8);
        }
    }
}
