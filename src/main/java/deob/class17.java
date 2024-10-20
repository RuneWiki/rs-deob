package deob;

@ObfuscatedName("h")
public class class17 {

    @ObfuscatedName("h.b")
    public byte field285;

    @ObfuscatedName("h.s")
    public int field282;

    @ObfuscatedName("h.r")
    public int field283;

    @ObfuscatedName("h.g")
    public int field284;

    @ObfuscatedName("h.x")
    public int field281;

    @ObfuscatedName("h.f")
    public int field286;

    public class17() {
    }

    public class17(class181 arg0, boolean arg1) {
        this.field285 = arg0.method2946();
        this.field282 = arg0.method3081();
        this.field283 = arg0.method2996();
        this.field284 = arg0.method2996();
        this.field281 = arg0.method2996();
        this.field286 = arg0.method2996();
        if (arg1) {
            this.method93(method1700(arg0));
        }
    }

    @ObfuscatedName("cs.b(Lfs;I)Ljava/lang/Integer;")
    public static Integer method1700(class181 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2945();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2945();
                if (var4 == 255) {
                    break;
                }
                arg0.field2488--;
                if (arg0.method3081() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2996();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("h.s(Ljava/lang/Integer;I)V")
    public void method93(Integer arg0) {
    }

    @ObfuscatedName("h.r(I)I")
    public int method91() {
        return this.field285 & 0x7;
    }

    @ObfuscatedName("h.g(I)I")
    public int method92() {
        return (this.field285 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("h.x(II)V")
    public void method89(int arg0) {
        this.field285 &= 0xFFFFFFF8;
        this.field285 = (byte) (this.field285 | arg0 & 0x7);
    }

    @ObfuscatedName("h.f(II)V")
    public void method90(int arg0) {
        this.field285 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field285 = (byte) (this.field285 | 0x8);
        }
    }
}
