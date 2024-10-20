package deob;

@ObfuscatedName("m")
public class class17 {

    @ObfuscatedName("m.i")
    public byte field307;

    @ObfuscatedName("m.h")
    public int field299;

    @ObfuscatedName("m.u")
    public int field300;

    @ObfuscatedName("m.q")
    public int field298;

    @ObfuscatedName("m.g")
    public int field302;

    @ObfuscatedName("m.v")
    public int field301;

    public class17() {
    }

    public class17(class174 arg0, boolean arg1) {
        this.field307 = arg0.method2931();
        this.field299 = arg0.method2932();
        this.field300 = arg0.method2927();
        this.field298 = arg0.method2927();
        this.field302 = arg0.method2927();
        this.field301 = arg0.method2927();
        if (arg1) {
            this.method88(method3444(arg0));
        }
    }

    @ObfuscatedName("gh.i(Lfv;S)Ljava/lang/Integer;")
    public static Integer method3444(class174 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2930();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2930();
                if (var4 == 255) {
                    break;
                }
                arg0.field2384--;
                if (arg0.method2932() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2927();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("m.h(Ljava/lang/Integer;B)V")
    public void method88(Integer arg0) {
    }

    @ObfuscatedName("m.u(B)I")
    public int method104() {
        return this.field307 & 0x7;
    }

    @ObfuscatedName("m.q(I)I")
    public int method89() {
        return (this.field307 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("m.g(IB)V")
    public void method91(int arg0) {
        this.field307 &= 0xFFFFFFF8;
        this.field307 = (byte) (this.field307 | arg0 & 0x7);
    }

    @ObfuscatedName("m.v(II)V")
    public void method92(int arg0) {
        this.field307 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field307 = (byte) (this.field307 | 0x8);
        }
    }
}
