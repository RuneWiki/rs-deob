package deob;

@ObfuscatedName("il")
public class class244 extends class183 {

    @ObfuscatedName("il.y")
    public static class155 field3224 = new class155(64);

    @ObfuscatedName("il.w")
    public static class155 field3212 = new class155(30);

    @ObfuscatedName("il.p")
    public int field3221;

    @ObfuscatedName("il.b")
    public int field3214;

    @ObfuscatedName("il.e")
    public int field3215 = -1;

    @ObfuscatedName("il.x")
    public short[] field3216;

    @ObfuscatedName("il.a")
    public short[] field3217;

    @ObfuscatedName("il.d")
    public short[] field3218;

    @ObfuscatedName("il.c")
    public short[] field3211;

    @ObfuscatedName("il.o")
    public int field3209 = 128;

    @ObfuscatedName("il.v")
    public int field3219 = 128;

    @ObfuscatedName("il.k")
    public int field3222 = 0;

    @ObfuscatedName("il.s")
    public int field3223 = 0;

    @ObfuscatedName("il.l")
    public int field3210 = 0;

    @ObfuscatedName("fh.f(Lhz;Lhz;I)V")
    public static void method3266(class234 arg0, class234 arg1) {
        Statics.field3213 = arg0;
        Statics.field3220 = arg1;
    }

    @ObfuscatedName("fh.i(IB)Lil;")
    public static class244 method3267(int arg0) {
        class244 var1 = (class244) field3224.method3099((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3213.method3752(13, arg0);
        class244 var3 = new class244();
        var3.field3221 = arg0;
        if (var2 != null) {
            var3.method4011(new class300(var2));
        }
        field3224.method3101(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("il.y(Lkq;I)V")
    public void method4011(class300 arg0) {
        while (true) {
            int var2 = arg0.method5110();
            if (var2 == 0) {
                return;
            }
            this.method4012(arg0, var2);
        }
    }

    @ObfuscatedName("il.w(Lkq;IB)V")
    public void method4012(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3214 = arg0.method5112();
        } else if (arg1 == 2) {
            this.field3215 = arg0.method5112();
        } else if (arg1 == 4) {
            this.field3209 = arg0.method5112();
        } else if (arg1 == 5) {
            this.field3219 = arg0.method5112();
        } else if (arg1 == 6) {
            this.field3222 = arg0.method5112();
        } else if (arg1 == 7) {
            this.field3223 = arg0.method5110();
        } else if (arg1 == 8) {
            this.field3210 = arg0.method5110();
        } else if (arg1 == 40) {
            int var3 = arg0.method5110();
            this.field3216 = new short[var3];
            this.field3217 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3216[var4] = (short) arg0.method5112();
                this.field3217[var4] = (short) arg0.method5112();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5110();
            this.field3218 = new short[var5];
            this.field3211 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3218[var6] = (short) arg0.method5112();
                this.field3211[var6] = (short) arg0.method5112();
            }
        }
    }

    @ObfuscatedName("il.p(II)Ldw;")
    public final class128 method4025(int arg0) {
        class128 var2 = (class128) field3212.method3099((long) this.field3221);
        if (var2 == null) {
            class122 var3 = class122.method2543(Statics.field3220, this.field3214, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3216 != null) {
                for (int var4 = 0; var4 < this.field3216.length; var4++) {
                    var3.method2602(this.field3216[var4], this.field3217[var4]);
                }
            }
            if (this.field3218 != null) {
                for (int var5 = 0; var5 < this.field3218.length; var5++) {
                    var3.method2556(this.field3218[var5], this.field3211[var5]);
                }
            }
            var2 = var3.method2603(this.field3223 + 64, this.field3210 + 850, -30, -50, -30);
            field3212.method3101(var2, (long) this.field3221);
        }
        class128 var6;
        if (this.field3215 == -1 || arg0 == -1) {
            var6 = var2.method2632(true);
        } else {
            var6 = class259.method209(this.field3215).method4401(var2, arg0);
        }
        if (this.field3209 != 128 || this.field3219 != 128) {
            var6.method2647(this.field3209, this.field3219, this.field3209);
        }
        if (this.field3222 != 0) {
            if (this.field3222 == 90) {
                var6.method2663();
            }
            if (this.field3222 == 180) {
                var6.method2663();
                var6.method2663();
            }
            if (this.field3222 == 270) {
                var6.method2663();
                var6.method2663();
                var6.method2663();
            }
        }
        return var6;
    }

    @ObfuscatedName("gt.b(B)V")
    public static void method3349() {
        field3224.method3102();
        field3212.method3102();
    }
}
