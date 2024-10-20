package deob;

@ObfuscatedName("hv")
public class class220 {

    @ObfuscatedName("hv.z")
    public byte field3153;

    @ObfuscatedName("hv.q")
    public int field3152;

    @ObfuscatedName("hv.k")
    public int field3154;

    @ObfuscatedName("hv.f")
    public int field3155;

    @ObfuscatedName("hv.d")
    public int field3156;

    @ObfuscatedName("hv.l")
    public int field3157;

    public class220() {
    }

    public class220(class119 arg0, boolean arg1) {
        this.field3153 = arg0.method2423();
        this.field3152 = arg0.method2415();
        this.field3154 = arg0.method2306();
        this.field3155 = arg0.method2306();
        this.field3156 = arg0.method2306();
        this.field3157 = arg0.method2306();
        if (arg1) {
            this.method3663(method807(arg0));
        }
    }

    @ObfuscatedName("at.z(Lda;I)Ljava/lang/Integer;")
    public static Integer method807(class119 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2457();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2457();
                if (var4 == 255) {
                    break;
                }
                arg0.field1986--;
                if (arg0.method2415() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2306();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("hv.q(Ljava/lang/Integer;I)V")
    public void method3663(Integer arg0) {
    }

    @ObfuscatedName("hv.k(I)I")
    public int method3649() {
        return this.field3153 & 0x7;
    }

    @ObfuscatedName("hv.f(I)I")
    public int method3650() {
        return (this.field3153 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hv.d(IB)V")
    public void method3647(int arg0) {
        this.field3153 &= 0xFFFFFFF8;
        this.field3153 = (byte) (this.field3153 | arg0 & 0x7);
    }

    @ObfuscatedName("hv.l(II)V")
    public void method3646(int arg0) {
        this.field3153 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3153 = (byte) (this.field3153 | 0x8);
        }
    }
}
