package deob;

@ObfuscatedName("hs")
public class class220 {

    @ObfuscatedName("hs.h")
    public byte field3151;

    @ObfuscatedName("hs.q")
    public int field3149;

    @ObfuscatedName("hs.v")
    public int field3150;

    @ObfuscatedName("hs.n")
    public int field3153;

    @ObfuscatedName("hs.f")
    public int field3152;

    @ObfuscatedName("hs.g")
    public int field3148;

    public class220() {
    }

    public class220(class119 arg0, boolean arg1) {
        this.field3151 = arg0.method2370();
        this.field3149 = arg0.method2385();
        this.field3150 = arg0.method2388();
        this.field3153 = arg0.method2388();
        this.field3152 = arg0.method2388();
        this.field3148 = arg0.method2388();
        if (arg1) {
            this.method3789(method2983(arg0));
        }
    }

    @ObfuscatedName("ei.h(Ldm;B)Ljava/lang/Integer;")
    public static Integer method2983(class119 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2383();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2383();
                if (var4 == 255) {
                    break;
                }
                arg0.field1973--;
                if (arg0.method2385() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2388();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("hs.q(Ljava/lang/Integer;B)V")
    public void method3789(Integer arg0) {
    }

    @ObfuscatedName("hs.v(I)I")
    public int method3810() {
        return this.field3151 & 0x7;
    }

    @ObfuscatedName("hs.n(I)I")
    public int method3791() {
        return (this.field3151 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hs.f(IB)V")
    public void method3801(int arg0) {
        this.field3151 &= 0xFFFFFFF8;
        this.field3151 = (byte) (this.field3151 | arg0 & 0x7);
    }

    @ObfuscatedName("hs.g(II)V")
    public void method3808(int arg0) {
        this.field3151 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3151 = (byte) (this.field3151 | 0x8);
        }
    }
}
