package deob;

@ObfuscatedName("ir")
public class class244 extends class176 {

    @ObfuscatedName("ir.b")
    public static class146 field3248 = new class146(64);

    @ObfuscatedName("ir.g")
    public static class146 field3247 = new class146(30);

    @ObfuscatedName("ir.z")
    public int field3261;

    @ObfuscatedName("ir.p")
    public int field3251;

    @ObfuscatedName("ir.h")
    public int field3252 = -1;

    @ObfuscatedName("ir.y")
    public short[] field3253;

    @ObfuscatedName("ir.w")
    public short[] field3254;

    @ObfuscatedName("ir.i")
    public short[] field3246;

    @ObfuscatedName("ir.k")
    public short[] field3256;

    @ObfuscatedName("ir.x")
    public int field3257 = 128;

    @ObfuscatedName("ir.o")
    public int field3258 = 128;

    @ObfuscatedName("ir.e")
    public int field3255 = 0;

    @ObfuscatedName("ir.n")
    public int field3260 = 0;

    @ObfuscatedName("ir.r")
    public int field3249 = 0;

    @ObfuscatedName("ai.u(II)Lir;")
    public static class244 method420(int arg0) {
        class244 var1 = (class244) field3248.method3076((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3259.method3928(13, arg0);
        class244 var3 = new class244();
        var3.field3261 = arg0;
        if (var2 != null) {
            var3.method4098(new class300(var2));
        }
        field3248.method3078(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ir.f(Lkg;I)V")
    public void method4098(class300 arg0) {
        while (true) {
            int var2 = arg0.method5138();
            if (var2 == 0) {
                return;
            }
            this.method4092(arg0, var2);
        }
    }

    @ObfuscatedName("ir.b(Lkg;II)V")
    public void method4092(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3251 = arg0.method5337();
        } else if (arg1 == 2) {
            this.field3252 = arg0.method5337();
        } else if (arg1 == 4) {
            this.field3257 = arg0.method5337();
        } else if (arg1 == 5) {
            this.field3258 = arg0.method5337();
        } else if (arg1 == 6) {
            this.field3255 = arg0.method5337();
        } else if (arg1 == 7) {
            this.field3260 = arg0.method5138();
        } else if (arg1 == 8) {
            this.field3249 = arg0.method5138();
        } else if (arg1 == 40) {
            int var3 = arg0.method5138();
            this.field3253 = new short[var3];
            this.field3254 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3253[var4] = (short) arg0.method5337();
                this.field3254[var4] = (short) arg0.method5337();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5138();
            this.field3246 = new short[var5];
            this.field3256 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3246[var6] = (short) arg0.method5337();
                this.field3256[var6] = (short) arg0.method5337();
            }
        }
    }

    @ObfuscatedName("ir.g(IB)Ldf;")
    public final class128 method4091(int arg0) {
        class128 var2 = (class128) field3247.method3076((long) this.field3261);
        if (var2 == null) {
            class122 var3 = class122.method2548(Statics.field3250, this.field3251, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3253 != null) {
                for (int var4 = 0; var4 < this.field3253.length; var4++) {
                    var3.method2561(this.field3253[var4], this.field3254[var4]);
                }
            }
            if (this.field3246 != null) {
                for (int var5 = 0; var5 < this.field3246.length; var5++) {
                    var3.method2617(this.field3246[var5], this.field3256[var5]);
                }
            }
            var2 = var3.method2568(this.field3260 + 64, this.field3249 + 850, -30, -50, -30);
            field3247.method3078(var2, (long) this.field3261);
        }
        class128 var6;
        if (this.field3252 == -1 || arg0 == -1) {
            var6 = var2.method2637(true);
        } else {
            var6 = class259.method154(this.field3252).method4450(var2, arg0);
        }
        if (this.field3257 != 128 || this.field3258 != 128) {
            var6.method2652(this.field3257, this.field3258, this.field3257);
        }
        if (this.field3255 != 0) {
            if (this.field3255 == 90) {
                var6.method2643();
            }
            if (this.field3255 == 180) {
                var6.method2643();
                var6.method2643();
            }
            if (this.field3255 == 270) {
                var6.method2643();
                var6.method2643();
                var6.method2643();
            }
        }
        return var6;
    }
}
