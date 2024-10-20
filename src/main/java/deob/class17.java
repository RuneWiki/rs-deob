package deob;

@ObfuscatedName("e")
public class class17 {

    @ObfuscatedName("e.c")
    public byte field297;

    @ObfuscatedName("e.o")
    public int field298;

    @ObfuscatedName("e.i")
    public int field300;

    @ObfuscatedName("e.u")
    public int field305;

    @ObfuscatedName("e.g")
    public int field301;

    @ObfuscatedName("e.m")
    public int field302;

    public class17() {
    }

    public class17(class174 arg0, boolean arg1) {
        this.field297 = arg0.method3014();
        this.field298 = arg0.method2861();
        this.field300 = arg0.method2987();
        this.field305 = arg0.method2987();
        this.field301 = arg0.method2987();
        this.field302 = arg0.method2987();
        if (arg1) {
            this.method86(method3862(arg0));
        }
    }

    @ObfuscatedName("ir.c(Lfp;I)Ljava/lang/Integer;")
    public static Integer method3862(class174 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2843();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2843();
                if (var4 == 255) {
                    break;
                }
                arg0.field2357--;
                if (arg0.method2861() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2987();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("e.o(Ljava/lang/Integer;I)V")
    public void method86(Integer arg0) {
    }

    @ObfuscatedName("e.i(B)I")
    public int method87() {
        return this.field297 & 0x7;
    }

    @ObfuscatedName("e.u(I)I")
    public int method88() {
        return (this.field297 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("e.g(IB)V")
    public void method104(int arg0) {
        this.field297 &= 0xFFFFFFF8;
        this.field297 = (byte) (this.field297 | arg0 & 0x7);
    }

    @ObfuscatedName("e.m(IB)V")
    public void method106(int arg0) {
        this.field297 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field297 = (byte) (this.field297 | 0x8);
        }
    }
}
