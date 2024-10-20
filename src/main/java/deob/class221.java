package deob;

@ObfuscatedName("ha")
public class class221 {

    @ObfuscatedName("ha.f")
    public byte field3168;

    @ObfuscatedName("ha.u")
    public int field3169;

    @ObfuscatedName("ha.x")
    public int field3170;

    @ObfuscatedName("ha.b")
    public int field3173;

    @ObfuscatedName("ha.l")
    public int field3172;

    @ObfuscatedName("ha.d")
    public int field3171;

    public class221() {
    }

    public class221(class120 arg0, boolean arg1) {
        this.field3168 = arg0.method2369();
        this.field3169 = arg0.method2387();
        this.field3170 = arg0.method2527();
        this.field3173 = arg0.method2527();
        this.field3172 = arg0.method2527();
        this.field3171 = arg0.method2527();
        if (arg1) {
            this.method3749(method2968(arg0));
        }
    }

    @ObfuscatedName("fp.f(Ldj;I)Ljava/lang/Integer;")
    public static Integer method2968(class120 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2385();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2385();
                if (var4 == 255) {
                    break;
                }
                arg0.field1999--;
                if (arg0.method2387() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2527();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("ha.u(Ljava/lang/Integer;B)V")
    public void method3749(Integer arg0) {
    }

    @ObfuscatedName("ha.x(I)I")
    public int method3750() {
        return this.field3168 & 0x7;
    }

    @ObfuscatedName("ha.b(B)I")
    public int method3751() {
        return (this.field3168 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("ha.l(IS)V")
    public void method3748(int arg0) {
        this.field3168 &= 0xFFFFFFF8;
        this.field3168 = (byte) (this.field3168 | arg0 & 0x7);
    }

    @ObfuscatedName("ha.d(II)V")
    public void method3766(int arg0) {
        this.field3168 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3168 = (byte) (this.field3168 | 0x8);
        }
    }
}
