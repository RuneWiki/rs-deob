package deob;

@ObfuscatedName("ie")
public class class254 extends class185 {

    @ObfuscatedName("ie.q")
    public static class155 field3270 = new class155(64);

    @ObfuscatedName("ie.j")
    public static class155 field3285 = new class155(30);

    @ObfuscatedName("ie.p")
    public int field3272;

    @ObfuscatedName("ie.g")
    public int field3273;

    @ObfuscatedName("ie.n")
    public int field3274 = -1;

    @ObfuscatedName("ie.u")
    public short[] field3275;

    @ObfuscatedName("ie.a")
    public short[] field3276;

    @ObfuscatedName("ie.z")
    public short[] field3278;

    @ObfuscatedName("ie.w")
    public short[] field3282;

    @ObfuscatedName("ie.y")
    public int field3269 = 128;

    @ObfuscatedName("ie.c")
    public int field3280 = 128;

    @ObfuscatedName("ie.h")
    public int field3281 = 0;

    @ObfuscatedName("ie.k")
    public int field3279 = 0;

    @ObfuscatedName("ie.r")
    public int field3283 = 0;

    @ObfuscatedName("cu.m(Lic;Lic;I)V")
    public static void method1964(class244 arg0, class244 arg1) {
        Statics.field3277 = arg0;
        Statics.field1159 = arg1;
    }

    @ObfuscatedName("p.o(IB)Lie;")
    public static class254 method41(int arg0) {
        class254 var1 = (class254) field3270.method3127((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3277.method3891(13, arg0);
        class254 var3 = new class254();
        var3.field3272 = arg0;
        if (var2 != null) {
            var3.method4144(new class310(var2));
        }
        field3270.method3137(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ie.q(Lkn;I)V")
    public void method4144(class310 arg0) {
        while (true) {
            int var2 = arg0.method5227();
            if (var2 == 0) {
                return;
            }
            this.method4161(arg0, var2);
        }
    }

    @ObfuscatedName("ie.j(Lkn;II)V")
    public void method4161(class310 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3273 = arg0.method5283();
        } else if (arg1 == 2) {
            this.field3274 = arg0.method5283();
        } else if (arg1 == 4) {
            this.field3269 = arg0.method5283();
        } else if (arg1 == 5) {
            this.field3280 = arg0.method5283();
        } else if (arg1 == 6) {
            this.field3281 = arg0.method5283();
        } else if (arg1 == 7) {
            this.field3279 = arg0.method5227();
        } else if (arg1 == 8) {
            this.field3283 = arg0.method5227();
        } else if (arg1 == 40) {
            int var3 = arg0.method5227();
            this.field3275 = new short[var3];
            this.field3276 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3275[var4] = (short) arg0.method5283();
                this.field3276[var4] = (short) arg0.method5283();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5227();
            this.field3278 = new short[var5];
            this.field3282 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3278[var6] = (short) arg0.method5283();
                this.field3282[var6] = (short) arg0.method5283();
            }
        }
    }

    @ObfuscatedName("ie.p(IB)Lef;")
    public final class137 method4145(int arg0) {
        class137 var2 = (class137) field3285.method3127((long) this.field3272);
        if (var2 == null) {
            class131 var3 = class131.method2632(Statics.field1159, this.field3273, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3275 != null) {
                for (int var4 = 0; var4 < this.field3275.length; var4++) {
                    var3.method2639(this.field3275[var4], this.field3276[var4]);
                }
            }
            if (this.field3278 != null) {
                for (int var5 = 0; var5 < this.field3278.length; var5++) {
                    var3.method2690(this.field3278[var5], this.field3282[var5]);
                }
            }
            var2 = var3.method2619(this.field3279 + 64, this.field3283 + 850, -30, -50, -30);
            field3285.method3137(var2, (long) this.field3272);
        }
        class137 var6;
        if (this.field3274 == -1 || arg0 == -1) {
            var6 = var2.method2762(true);
        } else {
            var6 = class269.method3330(this.field3274).method4522(var2, arg0);
        }
        if (this.field3269 != 128 || this.field3280 != 128) {
            var6.method2723(this.field3269, this.field3280, this.field3269);
        }
        if (this.field3281 != 0) {
            if (this.field3281 == 90) {
                var6.method2718();
            }
            if (this.field3281 == 180) {
                var6.method2718();
                var6.method2718();
            }
            if (this.field3281 == 270) {
                var6.method2718();
                var6.method2718();
                var6.method2718();
            }
        }
        return var6;
    }

    @ObfuscatedName("bw.g(I)V")
    public static void method804() {
        field3270.method3130();
        field3285.method3130();
    }
}
