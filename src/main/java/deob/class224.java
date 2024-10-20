package deob;

@ObfuscatedName("hj")
public class class224 {

    @ObfuscatedName("hj.l")
    public byte field3220;

    @ObfuscatedName("hj.g")
    public int field3216;

    @ObfuscatedName("hj.r")
    public int field3217;

    @ObfuscatedName("hj.e")
    public int field3215;

    @ObfuscatedName("hj.h")
    public int field3219;

    @ObfuscatedName("hj.s")
    public int field3218;

    public class224() {
    }

    public class224(class123 arg0, boolean arg1) {
        this.field3220 = arg0.method2491();
        this.field3216 = arg0.method2492();
        this.field3217 = arg0.method2477();
        this.field3215 = arg0.method2477();
        this.field3219 = arg0.method2477();
        this.field3218 = arg0.method2477();
        if (arg1) {
            this.method3894(method204(arg0));
        }
    }

    @ObfuscatedName("z.l(Ldc;I)Ljava/lang/Integer;")
    public static Integer method204(class123 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2490();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2490();
                if (var4 == 255) {
                    break;
                }
                arg0.field2051--;
                if (arg0.method2492() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2477();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("hj.g(Ljava/lang/Integer;B)V")
    public void method3894(Integer arg0) {
    }

    @ObfuscatedName("hj.r(B)I")
    public int method3892() {
        return this.field3220 & 0x7;
    }

    @ObfuscatedName("hj.e(B)I")
    public int method3896() {
        return (this.field3220 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hj.h(IB)V")
    public void method3897(int arg0) {
        this.field3220 &= 0xFFFFFFF8;
        this.field3220 = (byte) (this.field3220 | arg0 & 0x7);
    }

    @ObfuscatedName("hj.s(II)V")
    public void method3898(int arg0) {
        this.field3220 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3220 = (byte) (this.field3220 | 0x8);
        }
    }
}
