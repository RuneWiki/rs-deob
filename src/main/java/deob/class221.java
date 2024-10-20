package deob;

@ObfuscatedName("hb")
public class class221 {

    @ObfuscatedName("hb.e")
    public byte field3173;

    @ObfuscatedName("hb.w")
    public int field3170;

    @ObfuscatedName("hb.f")
    public int field3168;

    @ObfuscatedName("hb.s")
    public int field3171;

    @ObfuscatedName("hb.p")
    public int field3172;

    @ObfuscatedName("hb.h")
    public int field3169;

    public class221() {
    }

    public class221(class120 arg0, boolean arg1) {
        this.field3173 = arg0.method2465();
        this.field3170 = arg0.method2532();
        this.field3168 = arg0.method2360();
        this.field3171 = arg0.method2360();
        this.field3172 = arg0.method2360();
        this.field3169 = arg0.method2360();
        if (arg1) {
            this.method3698(method218(arg0));
        }
    }

    @ObfuscatedName("b.e(Ldq;B)Ljava/lang/Integer;")
    public static Integer method218(class120 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2355();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2355();
                if (var4 == 255) {
                    break;
                }
                arg0.field1977--;
                if (arg0.method2532() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2360();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("hb.w(Ljava/lang/Integer;I)V")
    public void method3698(Integer arg0) {
    }

    @ObfuscatedName("hb.f(B)I")
    public int method3715() {
        return this.field3173 & 0x7;
    }

    @ObfuscatedName("hb.s(B)I")
    public int method3700() {
        return (this.field3173 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hb.p(II)V")
    public void method3712(int arg0) {
        this.field3173 &= 0xFFFFFFF8;
        this.field3173 = (byte) (this.field3173 | arg0 & 0x7);
    }

    @ObfuscatedName("hb.h(IB)V")
    public void method3701(int arg0) {
        this.field3173 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3173 = (byte) (this.field3173 | 0x8);
        }
    }
}
