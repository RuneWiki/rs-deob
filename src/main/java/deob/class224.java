package deob;

@ObfuscatedName("hv")
public class class224 {

    @ObfuscatedName("hv.m")
    public byte field3223;

    @ObfuscatedName("hv.w")
    public int field3219;

    @ObfuscatedName("hv.e")
    public int field3218;

    @ObfuscatedName("hv.o")
    public int field3221;

    @ObfuscatedName("hv.g")
    public int field3222;

    @ObfuscatedName("hv.l")
    public int field3220;

    public class224() {
    }

    public class224(class123 arg0, boolean arg1) {
        this.field3223 = arg0.method2415();
        this.field3219 = arg0.method2548();
        this.field3218 = arg0.method2419();
        this.field3221 = arg0.method2419();
        this.field3222 = arg0.method2419();
        this.field3220 = arg0.method2419();
        if (arg1) {
            this.method3810(method2733(arg0));
        }
    }

    @ObfuscatedName("et.m(Ldj;B)Ljava/lang/Integer;")
    public static Integer method2733(class123 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2398();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2398();
                if (var4 == 255) {
                    break;
                }
                arg0.field2046--;
                if (arg0.method2548() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2419();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("hv.w(Ljava/lang/Integer;I)V")
    public void method3810(Integer arg0) {
    }

    @ObfuscatedName("hv.e(I)I")
    public int method3804() {
        return this.field3223 & 0x7;
    }

    @ObfuscatedName("hv.o(B)I")
    public int method3806() {
        return (this.field3223 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hv.g(II)V")
    public void method3807(int arg0) {
        this.field3223 &= 0xFFFFFFF8;
        this.field3223 = (byte) (this.field3223 | arg0 & 0x7);
    }

    @ObfuscatedName("hv.l(II)V")
    public void method3808(int arg0) {
        this.field3223 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3223 = (byte) (this.field3223 | 0x8);
        }
    }
}
